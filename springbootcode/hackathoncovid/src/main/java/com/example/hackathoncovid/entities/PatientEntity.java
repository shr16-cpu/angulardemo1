package com.example.hackathoncovid.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "patient")
@IdClass(PatientEntity.class)
//@EqualsAndHashCode
public class PatientEntity implements Serializable {

    public String getPatientNm() {
        return patientNm;
    }

    public void setPatientNm(String patientNm) {
        this.patientNm = patientNm;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Id
    @Column(name = "pname")
    private String patientNm;

    @Id
    @Column(name = "id")
    private int patientId;

    @Id
    @Column(name = "pgender")
    private String gender;

    @Id
    @Column(name = "ptype")
    private String ptype;

    @Id
    @Column(name = "email")
    private String email;

    @Id
    @Column(name = "age")
    private int age;

    @Id
    @Column(name = "address")
    private String address;

    @Id
    @Column(name = "bloodgroup")
    private String bloodgroup;

    @Id
    @Column(name = "nationality")
    private String nationality;

    @Id
    @Column(name = "phoneno")
    private String phoneno;

    @Id
    @Column(name = "password")
    private String password;
}

