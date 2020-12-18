import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.less']
})
export class HeaderComponent implements OnInit {
public username;
  constructor(private router: Router) { }

  ngOnInit() {
  
   this.username=JSON.parse(sessionStorage.getItem('username'))

  }
  getURL(){
    if(this.router.url != '/register' )
    {
      return true;

    }
   
    else{
      return false;
    }
  }
  getURL1()
  {
    if(this.router.url != '/login' )
    {
      return true;

    }
   
    else{
      return false;
    }
  }
  getUserDoctor()
  {
    if(this.username=='ShraddhaG' )
    {
      return true;
    }
    else{
      return false;
    }
  }

  
  getUser()
  {
    if(this.username!="ShraddhaG")
    {
      return true;
    }
    else{
      return false;
    }
  }


}


