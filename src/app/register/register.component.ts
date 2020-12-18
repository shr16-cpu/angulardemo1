import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.less']
})
export class RegisterComponent implements OnInit {
public patientName;
public patientPassword;
public selectedGender;
public patientEmail;
public patientContact;
  constructor( private router: Router,private http: HttpClient) {}

  ngOnInit() {
  }
  SaveUser()
  {
    let postdata= 
    {
      "patientNm":this.patientName, 
     "password": this.patientPassword,
    "phoneNm":this.patientContact,
    "emailid": this.patientEmail,
    "gender": this.selectedGender,
  }
  let registerUser = "http://hack-trial-app.herokuapp.com/hackathoncovid/saveUser";
  this.http.post(registerUser,postdata).subscribe(
    data => {
      
      this.router.navigate(['/login']);
      
      },
      err=>{
         console.log("error");
         
      }
 );
 
  
  

  
        
        
      
     

}}
