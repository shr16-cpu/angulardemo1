package com.example.hackathoncovid.dto;

public class PatientSymptomAndComments {
    public String patientcomments;
    public int pid;
    public int sid;

    public String getPatientcomments() {
        return patientcomments;
    }

    public void setPatientcomments(String patientcomments) {
        this.patientcomments = patientcomments;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSvalue() {
        return svalue;
    }

    public void setSvalue(String svalue) {
        this.svalue = svalue;
    }

    public String svalue;
}
