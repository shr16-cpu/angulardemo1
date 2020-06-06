package com.example.hackathoncovid.repositories;

import java.util.List;

import com.example.hackathoncovid.dto.PatientSymptomAndComments;
import com.example.hackathoncovid.entities.SymptomsCommentsEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.hackathoncovid.entities.DoctorsEntity;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PatientSymtomRepository extends CrudRepository<SymptomsCommentsEntity, String> {


    @Transactional
    @Query(nativeQuery = true, value="INSERT INTO patientsymptom ( patientcomments,pid, symptomid, symtomvalue) VALUES ( :patientcomments, :pid, :sid, :svalue) returning pid")
    Integer savePatientSymptoms(@Param("patientcomments") String patientcomments, @Param("pid") int pid, @Param("sid") int sid,
                            @Param("svalue") String svalue );


    @Query(nativeQuery = true, value="SELECT * from patientsymptom where pid= :pid")
    List<SymptomsCommentsEntity> findAllSymptomsC(@Param("pid") int pid);

}


