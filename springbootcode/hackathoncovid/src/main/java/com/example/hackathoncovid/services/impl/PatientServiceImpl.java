package com.example.hackathoncovid.services.impl;

import com.example.hackathoncovid.dao.*;
import com.example.hackathoncovid.dto.DoctorsDTO;
import com.example.hackathoncovid.dto.PatientIdDTO;
import com.example.hackathoncovid.dto.PatientSymptomAndComments;
import com.example.hackathoncovid.entities.*;
import com.example.hackathoncovid.repositories.*;
import com.example.hackathoncovid.services.DoctorService;
import com.example.hackathoncovid.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private SymptomRepository symptomRepository;

    @Autowired
    private PatientSymtomRepository patientSymtomRepository;

    @Autowired
    private DoctorCommentRepository doctorCommentRepository;

    @Override
    public PatientIdDTO savePatientData( SaveUserDAO saveUserDAO)
    {
        PatientIdDTO patientIdDTO = new PatientIdDTO();

        Integer patientId = this.patientRepository.saveUserDetails(saveUserDAO.getPatientNm(), saveUserDAO.getPassword(), saveUserDAO.getEmailid(),
                            saveUserDAO.getGender(), saveUserDAO.getPhoneNm());

        patientIdDTO.setPatientId(patientId);

        return patientIdDTO;


    }

    @Override
    public PatientIdDTO validateUserData(ValidateUserDAO validateUserDAO) {
        Integer patientId = this.patientRepository.getPatientDataByUnameAndPwd(validateUserDAO.getUsername(), validateUserDAO.getPassword());

        PatientIdDTO patientIdDTO = new PatientIdDTO();
        patientIdDTO.setPatientId(patientId);

        return patientIdDTO;
    }

    @Override
    public PatientIdDTO saveAllPatientData(SaveAllPatientData saveAllPatientData) {
        Integer patientId = this.patientRepository.saveAllUserDetails(saveAllPatientData.getAddress(), saveAllPatientData.getBloodgroup(),
                saveAllPatientData.getNationality(), saveAllPatientData.getPtype(), saveAllPatientData.getPage(), saveAllPatientData.getPid());

        PatientIdDTO patientIdDTO = new PatientIdDTO();
        patientIdDTO.setPatientId(patientId);

        return patientIdDTO;
    }

    @Override
    public PatientEntity getPatientData(PatientIdDTO patientIdDTO) {
        PatientEntity patientEntity = this.patientRepository.getByPatientId(patientIdDTO.getPatientId());

        return patientEntity;
    }

    @Override
    public List<SymptomsEntity> getAllSymptoms() {
        List<SymptomsEntity> symptomsEntity = this.symptomRepository.findAllSymptoms();
        return symptomsEntity;
    }

    @Override
    public Integer getPatientSC(PatientSymptomAndComments psc) {
        Integer patientId = this.patientSymtomRepository.savePatientSymptoms(psc.getPatientcomments(), psc.getPid(),
                psc.getSid(), psc.getSvalue());
        return patientId;
    }

    @Override
    public List<SymptomsCommentsEntity> getAllSymptomsC(PatientIdDTO patientIdDTO) {
        List<SymptomsCommentsEntity> symptomsEntity = this.patientSymtomRepository.findAllSymptomsC(patientIdDTO.getPatientId());
        return symptomsEntity;
    }

    @Override
    public Integer getDoctorC(DoctorCommentDAO psc) {
        Integer patientId = this.doctorCommentRepository.saveDoctorComments(psc.getComments(), psc.getPid(), psc.getDoctorid());
        return patientId;
    }

    @Override
    public DoctorCommentEntity getDoctorComments(PatientIdDTO patientIdDTO) {
        DoctorCommentEntity symptomsEntity = this.doctorCommentRepository.getAllComments(patientIdDTO.getPatientId());
        return symptomsEntity;
    }
}
