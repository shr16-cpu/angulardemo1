import {Component, OnDestroy, OnInit,EventEmitter, Output, HostListener} from "@angular/core";
import {FormGroup, FormControl, Validators} from '@angular/forms';
import {Router} from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
    selector: 'login-in-dialog',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.less'],
})

export class LoginComponent  {
   @Output() onLogin: EventEmitter<any> = new EventEmitter<any>();
 
  
   public patientName;
   public patientPassword;

   constructor( private router: Router,private http: HttpClient) {}
   ngOnInit() {   
      console.log(this.router.url); 
  
   }
   navigateToRegister()
   {
    this.router.navigate(['/register']); 
   }
   navigateToHome() {
      let validateUserApi='http://hack-trial-app.herokuapp.com/hackathoncovid/validateUser';
      let postdata={
         "username":this.patientName,
         "password":this.patientPassword,
      }
      sessionStorage.setItem('username',postdata.username);
      this.http.post(validateUserApi,postdata).subscribe(
         data => {
        //  let patientId=data;

          console.log(data);
         //sessionStorage.setItem('patientId',data);
         
            this.router.navigate(['/home']);

            
           },
         err=>{
              console.log("error");
              
           }
      );

     
     
         
    
      
        
       
       // this.cm.emitChange({userinfo: {"userId":"blakshm4","userFirstNm":"Bijjala","userLastNm":"Lakshmi","userEmailAddress":"bijjala.lakshmi@optum.com","userPhoneNumber":"+91 403/089-5005","userActiveFlag":"Active","password":null,"tenantId":null,"roleId":null,"roleList":null,"createTimeStamp":"2019-06-08 01:09:22 PM","updateTimeStamp":"2019-06-20 03:57:23 PM","createUserId":"akuma603","updateUserId":"akuma603","message":null}});
       
    }

   
    
}