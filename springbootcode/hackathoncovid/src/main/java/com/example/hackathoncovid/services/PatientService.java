package com.example.hackathoncovid.services;

import com.example.hackathoncovid.dao.DoctorCommentDAO;
import com.example.hackathoncovid.dao.SaveAllPatientData;
import com.example.hackathoncovid.dao.SaveUserDAO;
import com.example.hackathoncovid.dao.ValidateUserDAO;
import com.example.hackathoncovid.dto.DoctorsDTO;
import com.example.hackathoncovid.dto.PatientIdDTO;
import com.example.hackathoncovid.dto.PatientSymptomAndComments;
import com.example.hackathoncovid.entities.DoctorCommentEntity;
import com.example.hackathoncovid.entities.PatientEntity;
import com.example.hackathoncovid.entities.SymptomsCommentsEntity;
import com.example.hackathoncovid.entities.SymptomsEntity;

import java.util.List;

public interface PatientService {
    PatientIdDTO savePatientData(SaveUserDAO saveUserDAO);
    PatientIdDTO validateUserData(ValidateUserDAO validateUserDAO);
    PatientIdDTO saveAllPatientData(SaveAllPatientData saveAllPatientData);
    PatientEntity getPatientData(PatientIdDTO patientIdDTO);
    List<SymptomsEntity> getAllSymptoms();
    Integer getPatientSC(PatientSymptomAndComments psc);
    List<SymptomsCommentsEntity> getAllSymptomsC(PatientIdDTO patientIdDTO);
    Integer getDoctorC(DoctorCommentDAO psc);
    DoctorCommentEntity getDoctorComments(PatientIdDTO patientIdDTO);

}
