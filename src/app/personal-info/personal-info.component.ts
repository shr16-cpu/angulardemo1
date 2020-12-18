import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-personal-info',
  templateUrl: './personal-info.component.html',
  styleUrls: ['./personal-info.component.less']
})
export class PersonalInfoComponent implements OnInit {
  public patientNm;
  public selectedType;
  public patientAge;
  public patientAddress;
  public contact;
  public mail;
  public bloodgrp;
  public country;
  public  patientId;


  constructor( private router: Router,private http: HttpClient) {}  

  ngOnInit() {
  }
  save()
  {
    this.patientId=sessionStorage.getItem('patientId');
   
    let postdata =
    { 
    "ptype": this.selectedType,
    "address": this.patientAddress, 
    "age": this.patientAge, 
    "pid": this.patientId, 
    "nationality": this.country, 
    "bloodgroup": this.bloodgrp, 
  
  }
  let savePatientDataURL="http://hack-trial-app.herokuapp.com/saveAllPatientData";
  console.log(JSON.stringify(postdata));
  this.http.post(savePatientDataURL,postdata).subscribe(
    data => {
      
      alert("saved Successfully");
      
      },
      err=>{
         console.log("error");
         
      });
  

}

}
