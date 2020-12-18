import {CommonModule} from '@angular/common';
import {NgModule} from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {LoginComponent} from './login.component';
import {HttpClientModule} from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';




@NgModule({
  declarations: [
    LoginComponent
  ],
  imports: [
    BrowserModule,
   
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
    
  ],
  exports: [
   
  ],
  providers: [
  
  ]
})
export class LoginModule { }
