import {Component, OnDestroy, OnInit,EventEmitter, Output, HostListener} from "@angular/core";
import {FormGroup, FormControl, Validators} from '@angular/forms';
import {Router} from '@angular/router';


@Component({
    selector: 'home',
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.less'],
})

export class HomeComponent  {
    public username;
    ngOnInit() {
       
    }
    constructor(private router:Router) {}
    openPersonal()
    {
        this.router.navigate(['/personalInfo']);
    }
    openLiveStatus()
    {
        this.router.navigate(['/patientDetails']);
    }
    openIndividual()
    {
        this.router.navigate(['/individualAssessment']);
    }

    }

    