import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-patient-track',
  templateUrl: './patient-track.component.html',
  styleUrls: ['./patient-track.component.less']
})
export class PatientTrackComponent implements OnInit {

  constructor() { }

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
    alert("saved successfully");
  }


}
