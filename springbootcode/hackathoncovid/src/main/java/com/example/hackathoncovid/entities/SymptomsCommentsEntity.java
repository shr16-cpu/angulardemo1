package com.example.hackathoncovid.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "patientsymptom")
@IdClass(SymptomsCommentsEntity.class)
//@EqualsAndHashCode
public class SymptomsCommentsEntity implements Serializable {


    public int getSymptomid() {
        return symptomid;
    }

    public void setSymptomid(int symptomid) {
        this.symptomid = symptomid;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public String getSymtomvalue() {
        return symtomvalue;
    }

    public void setSymtomvalue(String symtomvalue) {
        this.symtomvalue = symtomvalue;
    }

    public String getPcomments() {
        return pcomments;
    }

    public void setPcomments(String pcomments) {
        this.pcomments = pcomments;
    }

    @Id
    @Column(name = "symptomid")
    private int symptomid;

    @Id
    @Column(name = "pid")
    private int patientid;

    @Id
    @Column(name = "symtomvalue")
    private String symtomvalue;

    @Id
    @Column(name = "patientcomments")
    private String pcomments;
}

