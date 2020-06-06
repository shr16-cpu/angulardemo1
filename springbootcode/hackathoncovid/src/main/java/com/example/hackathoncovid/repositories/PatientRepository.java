package com.example.hackathoncovid.repositories;

import java.util.List;

import com.example.hackathoncovid.dto.PatientIdDTO;
import com.example.hackathoncovid.entities.PatientEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.hackathoncovid.entities.DoctorsEntity;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PatientRepository extends CrudRepository<PatientEntity, String> {

    @Transactional
    @Query(nativeQuery = true, value="INSERT INTO patient (pname, password, email, pgender, phoneno) VALUES (:pname, :password, :email, :gender, :phoneno) RETURNING id")
    Integer saveUserDetails(@Param("pname") String pname, @Param("password") String password, @Param("email") String email,
                                 @Param("gender") String gender, @Param("phoneno") String phoneno);


    @Query(nativeQuery = true, value="SELECT id FROM patient WHERE pname = :pname and password = :password")
    Integer getPatientDataByUnameAndPwd(@Param("pname") String pname, @Param("password") String password);


    @Transactional
    @Query(nativeQuery = true, value="UPDATE patient\n" +
            "SET address = :address, bloodgroup = :bloodgroup, nationality = :nationality, ptype = :ptype, age = :page where id = :pid RETURNING id")
    Integer saveAllUserDetails(@Param("address") String address, @Param("bloodgroup") String bloodgroup, @Param("nationality") String nationality,
                            @Param("ptype") String ptype, @Param("page") int page, @Param("pid") int pid);

    @Query(nativeQuery = true, value="SELECT * from patient WHERE id = :id")
    PatientEntity getByPatientId(@Param("id") int id);

}


