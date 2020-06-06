package com.example.hackathoncovid.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "doctor")
@IdClass(DoctorsEntity.class)
//@EqualsAndHashCode
public class DoctorsEntity implements Serializable {
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

    @Id
    @Column(name = "doctorname")
    private String doctorName;

    @Id
    @Column(name = "doctorid")
    private int doctorId;
}

