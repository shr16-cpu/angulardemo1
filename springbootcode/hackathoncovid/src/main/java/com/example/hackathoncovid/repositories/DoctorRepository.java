package com.example.hackathoncovid.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.hackathoncovid.entities.DoctorsEntity;

@Repository
public interface DoctorRepository extends CrudRepository<DoctorsEntity, String> {
    @Query(nativeQuery = true, value="SELECT * FROM doctor WHERE doctorId = :doctorId")
    DoctorsEntity findByDoctorId(@Param("doctorId") int doctorId);
}


