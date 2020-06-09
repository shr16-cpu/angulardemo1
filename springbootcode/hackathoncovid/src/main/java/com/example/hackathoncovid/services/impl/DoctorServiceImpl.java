package com.example.hackathoncovid.services.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.hackathoncovid.dao.DoctorsDAO;
import com.example.hackathoncovid.dto.DoctorsDTO;
import com.example.hackathoncovid.entities.DoctorsEntity;
import com.example.hackathoncovid.repositories.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.hackathoncovid.services.DoctorService;

import javax.print.Doc;


@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public DoctorsDTO retreiveDocDetails(DoctorsDAO doctorsDAO)
    {
        DoctorsDTO doctorsDTO = new DoctorsDTO();
        List<DoctorsDTO> doctorsDTOList = new ArrayList<DoctorsDTO>();
        DoctorsEntity docsInfoList = new DoctorsEntity();

        docsInfoList = this.doctorRepository.findByDoctorId(doctorsDAO.getDoctorId());

            doctorsDTO.setDoctorId(docsInfoList.getDoctorId());
            doctorsDTO.setDoctorNm(docsInfoList.getDoctorName());

        return doctorsDTO;


    }
}
