package com.example.hackathoncovid.services;
import com.example.hackathoncovid.dao.DoctorCommentDAO;
import com.example.hackathoncovid.dao.DoctorsDAO;
import com.example.hackathoncovid.dto.DoctorsDTO;

import java.util.List;
public interface DoctorService {

    DoctorsDTO retreiveDocDetails(DoctorsDAO doctorsDAO);

}

