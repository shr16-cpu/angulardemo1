import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-individual-assessment',
  templateUrl: './individual-assessment.component.html',
  styleUrls: ['./individual-assessment.component.less']
})
export class IndividualAssessmentComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  public countries = [
    {id: 1, name: 'Cold',checked:false},
    {id: 2, name: 'Fever',checked:false},
    {id: 3, name: 'Dry Cough',checked:false},
    {id: 4, name: 'Difficulty in breathing',checked:false},
    {id: 5, name: 'Headache',checked:false},
    {id: 6, name: 'Fatigue',checked:false},
    {id: 7, name: 'Nausea',checked:false},
];
public critical = [
  {id: 1, name: 'Trouble breathing',checked:false},
  {id: 2, name: 'Persistent Pain or Pressure in chest',checked:false},
  {id: 3, name: 'Inability to wake or stay awake',checked:false},
  {id: 4, name: 'Bluish lips or face',checked:false},
  {id: 5, name: 'continuous fever',checked:false},
 
];
public health_history = [
  {id: 1, name:'diabetes',checked:false},
  {id: 2, name: 'hypertension',checked:false},
  {id: 3, name: 'lung disease',checked:false},
  {id: 4, name: 'heart disease',checked:false},
  {id: 5, name: 'thyroid',checked:false},
  {id: 6, name: ' kidney disease',checked:false},
  {id: 7, name: 'thyroid',checked:false},
 
];
public additional_info = [
  {id: 1, name:'Have you travelled internationally since last 30 to 45 days',checked:false},
  {id: 2, name: 'Have you been in crowded place',checked:false},
  {id: 3, name: 'Have you be in exposure with covid-19 positive person',checked:false},
  {id: 4, name: 'Are you healthcare worker and examined covid-19 positive with non-protective gear',checked:false},
  
 
];
public sendCheckedCountries(): void {
  const selectedCountries = this.countries.filter( (countries) => countries.checked );
  const selectedCritical = this.critical.filter( (critical) => critical.checked );
  const selectedHealth = this.health_history.filter( (health_history) => health_history.checked );
  const selectedAdd_info = this.additional_info.filter( (additional_info) => additional_info.checked );
  
  //const selectedCountries = this.countries.filter( (countries) => countries.checked );
  // you could use an EventEmitter and emit the selected values here, or send them to another API with some service
  if(selectedCountries.length<=3 &&  selectedCritical.length==0 && selectedHealth.length==0 && selectedAdd_info.length==0)
  {
    alert("Please follow below instructions  \nStay home stay healthy \nWear a face covering \nCover your coughs and sneezes \nClean your hands often");
  }
  if(selectedCountries.length>3 &&  selectedCritical.length==0 && selectedHealth.length==0 && selectedAdd_info.length==0)
  {
    alert("We are here to help please contact below mentioned medical professionals");

  console.log (selectedCountries);
  }
  if(selectedCountries.length<3 &&  selectedCritical.length==0 && selectedHealth.length>0 && selectedAdd_info.length==0)
  {
    alert("Please follow below instructions  \nStay home stay healthy \nWear a face covering \nCover your coughs and sneezes \nClean your hands often");

  console.log (selectedCountries);
  }
  if(selectedCountries.length==0 &&  selectedCritical.length==0 && selectedHealth.length==0 && selectedAdd_info.length>0)
  {
    alert("You are doing great \n stay home \n stay fit \n stay safe");

  console.log (selectedCountries);
  }
  if(selectedCountries.length>0 &&  selectedCritical.length==0 && selectedHealth.length>0 && selectedAdd_info.length>0)
  {
    alert("Please follow below instructions  \nStay home stay healthy \nWear a face covering \nCover your coughs and sneezes \nClean your hands often");

  console.log (selectedCountries);
  }
}

}





