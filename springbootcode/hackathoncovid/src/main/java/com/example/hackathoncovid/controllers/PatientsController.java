package com.example.hackathoncovid.controllers;

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
import com.example.hackathoncovid.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@ComponentScan(basePackages = "com.example.hackathoncovid")
@RequestMapping("/hackathoncovid/")
public class PatientsController {

    @Autowired
    private PatientService patientService;

    PatientIdDTO patientIdDTO;

    @RequestMapping(value="saveUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<PatientIdDTO> saveUserData(@RequestBody SaveUserDAO saveUserDAO) {
        PatientIdDTO patientIdDTO = this.patientService.savePatientData(saveUserDAO);
        return renderContent1(patientIdDTO, HttpStatus.CREATED);
    }

    @RequestMapping(value="validateUser", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<PatientIdDTO> validateUser(@RequestBody ValidateUserDAO validateUserDAO) {
        PatientIdDTO patientIdDTO = this.patientService.validateUserData(validateUserDAO);
        return renderContent1(patientIdDTO, HttpStatus.CREATED);
    }

    @RequestMapping(value="saveAllPatientData", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<PatientIdDTO> saveAllPatientData(@RequestBody SaveAllPatientData saveAllPatientData) {
        PatientIdDTO patientIdDTO = this.patientService.saveAllPatientData(saveAllPatientData);
        return renderContent1(patientIdDTO, HttpStatus.CREATED);
    }

    @RequestMapping(value="getPatientDetails", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<PatientEntity> saveUserData(@RequestBody PatientIdDTO patientIdDTO) {
        PatientEntity patientEntity = this.patientService.getPatientData(patientIdDTO);

        return patientEntity == null ? ResponseEntity.notFound().build() : ResponseEntity.status(HttpStatus.CREATED).body(patientEntity);
    }

    @RequestMapping(value="getAllSymptoms", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<List<SymptomsEntity>> getAllSymptoms() {
        List<SymptomsEntity> symptomsEntities = this.patientService.getAllSymptoms();

        return symptomsEntities == null ? ResponseEntity.notFound().build() : ResponseEntity.status(HttpStatus.CREATED).body(symptomsEntities);
    }

    @RequestMapping(value="savePatientSymptomsAndComments", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Integer> savePSC(@RequestBody PatientSymptomAndComments psc) {
        Integer ps = this.patientService.getPatientSC(psc);

        return ps == null ? ResponseEntity.notFound().build() : ResponseEntity.status(HttpStatus.CREATED).body(ps);
    }

    @RequestMapping(value="saveDoctorComments", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Integer> savePSC(@RequestBody DoctorCommentDAO psc) {
        Integer ps = this.patientService.getDoctorC(psc);

        return ps == null ? ResponseEntity.notFound().build() : ResponseEntity.status(HttpStatus.CREATED).body(ps);
    }

    @RequestMapping(value="getDoctorComments", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<DoctorCommentEntity> getAllSymptoms(@RequestBody PatientIdDTO patientIdDTO) {
        DoctorCommentEntity symptomsEntities = this.patientService.getDoctorComments(patientIdDTO);

        return symptomsEntities == null ? ResponseEntity.notFound().build() : ResponseEntity.status(HttpStatus.CREATED).body(symptomsEntities);
    }

    @RequestMapping(value="getAllSymptomsComments", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<List<SymptomsCommentsEntity>> getAllSymptomsC(@RequestBody PatientIdDTO patientIdDTO) {
        List<SymptomsCommentsEntity> symptomsEntities = this.patientService.getAllSymptomsC(patientIdDTO);

        return symptomsEntities == null ? ResponseEntity.notFound().build() : ResponseEntity.status(HttpStatus.CREATED).body(symptomsEntities);
    }


    private ResponseEntity<DoctorsDTO> renderContent5(DoctorsDTO library, HttpStatus httpStatus) {
        // TODO Auto-generated method stub
        return library == null ? ResponseEntity.notFound().build() : ResponseEntity.status(httpStatus).body(library);
    }

    private ResponseEntity<PatientIdDTO> renderContent1(PatientIdDTO library, HttpStatus httpStatus) {
        // TODO Auto-generated method stub
        return library == null ? ResponseEntity.notFound().build() : ResponseEntity.status(httpStatus).body(library);
    }
}


