
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-individual-instruction',
  templateUrl: './individual-instruction.component.html',
  styleUrls: ['./individual-instruction.component.less']
})
export class IndividualInstructionComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }
  routeToLiveTracker(path){
    this.router.navigate(['/doctor']); 
  }
}

