import {CommonModule} from '@angular/common';
import {NgModule} from '@angular/core';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HomeComponent} from './home.component';
import {HttpClientModule} from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';

// import {SharedModule} from '../../shared/services/shared.module';


@NgModule({
  declarations: [
    HomeComponent
  ],
  imports: [
    BrowserModule,
   
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
    //SharedModule
  ],
  exports: [
    //LoginComponent
  ],
  providers: [
    //PageLoadingIndicatorService
  ]
})
export class HomeModule { }
