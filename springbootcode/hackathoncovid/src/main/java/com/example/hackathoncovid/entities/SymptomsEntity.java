package com.example.hackathoncovid.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "symptom")
@IdClass(SymptomsEntity.class)
//@EqualsAndHashCode
public class SymptomsEntity implements Serializable {

    public String getSymptomname() {
        return symptomname;
    }

    public void setSymptomname(String symptomname) {
        this.symptomname = symptomname;
    }

    public int getSymptomid() {
        return symptomid;
    }

    public void setSymptomid(int symptomid) {
        this.symptomid = symptomid;
    }

    @Id
    @Column(name = "symptomname")
    private String symptomname;

    @Id
    @Column(name = "id")
    private int symptomid;
}

