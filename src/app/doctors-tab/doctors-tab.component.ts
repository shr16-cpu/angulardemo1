import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-doctors-tab',
  templateUrl: './doctors-tab.component.html',
  styleUrls: ['./doctors-tab.component.less']
})
export class DoctorsTabComponent implements OnInit {

  constructor( private router: Router,private http: HttpClient) {}

  ngOnInit() {
  
  }
  public health_history = [
    {id: 1, name:'Cold',checked:false},
    {id: 2, name: 'Fever',checked:false},
    {id: 3, name: 'Difficulty in breating',checked:false},
    {id: 4, name: 'Dry cough',checked:false},
    {id: 5, name: 'Fatigue',checked:false},
    {id: 6, name: 'Nausea',checked:false},
   
   
  ];
  public health_history_critical = [
    {id: 1, name:'Trouble breathing',checked:false},
    {id: 2, name: 'Persistent pain or pressure in the chest',checked:false},
    {id: 3, name: 'Inability to wake or stay awake',checked:false},
    {id: 4, name: 'Bluish lips or face',checked:false},
   
   
   
  ];
  save()
  {
    let getPatientDetailsURL='http://hack-trial-app.herokuapp.com/getPatientDetails';
    let patientId=sessionStorage.getItem('patientId');
    let postdata={
      "patientId": 3
    }
    this.http.post(getPatientDetailsURL,postdata).subscribe(
      data => {
      
      console.log(JSON.stringify(data));
      alert('saved successfully');
         
        },
      err=>{
       

    });
    
  

  }}

