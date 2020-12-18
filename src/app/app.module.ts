import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { LoginModule } from './login/login.module';
import { HomeModule } from './home/home.module';
import { HeaderComponent } from './header/header.component';
import { PersonalInfoComponent } from './personal-info/personal-info.component';
import { FormsModule } from '@angular/forms';
import { IndividualAssessmentComponent } from './individual-assessment/individual-assessment.component';
import { FrequentlyAskedComponent } from './frequently-asked/frequently-asked.component';
import { DoctorsTabComponent } from './doctors-tab/doctors-tab.component';
import { PatientsComponent } from './patients/patients.component';
import { PatientTrackComponent } from './patient-track/patient-track.component';
import { RegisterComponent } from './register/register.component';
import { IndividualInstructionComponent } from './individual-instruction/individual-instruction.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    PersonalInfoComponent,
    IndividualAssessmentComponent,
    FrequentlyAskedComponent,
    DoctorsTabComponent,
    PatientsComponent,
    PatientTrackComponent,
    RegisterComponent,
    IndividualInstructionComponent,
  
    
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
   
    LoginModule,
    HomeModule,
   
    FormsModule
    
  ],
  
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
