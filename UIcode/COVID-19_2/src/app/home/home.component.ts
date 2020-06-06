import {Component, OnDestroy, OnInit,EventEmitter, Output, HostListener} from "@angular/core";
import {FormGroup, FormControl, Validators} from '@angular/forms';
import {Router} from '@angular/router';


@Component({
    selector: 'home',
    templateUrl: './home.template.html',
    styleUrls: ['./home.less'],
})

export class HomeComponent  {
    public username;
    ngOnInit() {
        let userData = JSON.parse(sessionStorage.getItem('userDetails'));
        this.username=userData.username;

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

    