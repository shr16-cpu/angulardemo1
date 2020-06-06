package com.example.hackathoncovid.repositories;

import java.util.List;

import com.example.hackathoncovid.entities.DoctorCommentEntity;
import com.example.hackathoncovid.entities.SymptomsCommentsEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.hackathoncovid.entities.DoctorsEntity;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DoctorCommentRepository extends CrudRepository<DoctorCommentEntity, String> {
    @Transactional
    @Query(nativeQuery = true, value="INSERT INTO doctorcomment ( comments,pid, doctorid) VALUES ( :comments, :pid, :doctorid) returning pid")
    Integer saveDoctorComments(@Param("comments") String comments, @Param("pid") int pid, @Param("doctorid") int doctorid);


    @Query(nativeQuery = true, value="SELECT * from doctorcomment where pid= :pid")
    DoctorCommentEntity getAllComments(@Param("pid") int pid);


}


