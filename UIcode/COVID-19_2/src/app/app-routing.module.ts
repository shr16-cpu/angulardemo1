import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import {PersonalInfoComponent} from './personal-info/personal-info.component';
import { IndividualAssessmentComponent } from './individual-assessment/individual-assessment.component';
import { FrequentlyAskedComponent } from './frequently-asked/frequently-asked.component';
import {DoctorsTabComponent} from './doctors-tab/doctors-tab.component';
import { PatientsComponent } from './patients/patients.component';
import { PatientTrackComponent } from './patient-track/patient-track.component';
import { RegisterComponent } from './register/register.component';
import {IndividualInstructionComponent} from './individual-instruction/individual-instruction.component';

const appRoutes: Routes = [
  {path: '', redirectTo: '/login', pathMatch: 'full'},
  {path: 'login', component: LoginComponent},
  {path: 'home', component: HomeComponent},
  {path: 'personalInfo', component:PersonalInfoComponent },
  {path: 'individualAssessment', component:IndividualAssessmentComponent },
  {path: 'frequently-asked', component:FrequentlyAskedComponent },
  {path: 'patientDetails', component:DoctorsTabComponent },
  {path: 'patients', component:PatientsComponent },
  {path: 'patientTrack', component:PatientTrackComponent },
   {path: 'register', component:RegisterComponent },
   {path: 'individualInstructions', component: IndividualInstructionComponent},

  
];

const routes: Routes = [];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
