package com.example.hackathoncovid.controllers;

import com.example.hackathoncovid.dao.DoctorsDAO;
import com.example.hackathoncovid.dto.DoctorsDTO;
import com.example.hackathoncovid.services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

//Include required DAO and DTO here

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;


@CrossOrigin(origins = "*")
@RestController
@ComponentScan(basePackages = "com.example.hackathoncovid")
@RequestMapping("/hackathoncovid/")
public class DoctorsController {

    @Autowired
    private DoctorService doctorService;

    DoctorsDTO doctorsDTO;

    @RequestMapping(value="getDoctorDetails", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<DoctorsDTO> retrievepredictedColumns(@RequestBody DoctorsDAO doctorsDAO) {
        DoctorsDTO doctorsDTO = this.doctorService.retreiveDocDetails(doctorsDAO);
        return renderContent5(doctorsDTO, HttpStatus.CREATED);
    }

    private ResponseEntity<DoctorsDTO> renderContent5(DoctorsDTO library, HttpStatus httpStatus) {
        // TODO Auto-generated method stub
        return library == null ? ResponseEntity.notFound().build() : ResponseEntity.status(httpStatus).body(library);
    }
}
