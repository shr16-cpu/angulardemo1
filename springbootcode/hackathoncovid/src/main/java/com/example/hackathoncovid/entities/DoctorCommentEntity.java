package com.example.hackathoncovid.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "doctorcomment")
@IdClass(DoctorCommentEntity.class)
//@EqualsAndHashCode
public class DoctorCommentEntity implements Serializable {

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Id
    @Column(name = "comments")
    private String doctorName;

    @Id
    @Column(name = "doctorid")
    private int doctorId;

    @Id
    @Column(name = "pid")
    private int pid;
}

