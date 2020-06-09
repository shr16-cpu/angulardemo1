package com.example.hackathoncovid.dto;

public class DoctorsDTO {
    public String getDoctorNm() {
        return doctorNm;
    }

    public void setDoctorNm(String doctorNm) {
        this.doctorNm = doctorNm;
    }


    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    private int doctorId;
    private String doctorNm;
}
