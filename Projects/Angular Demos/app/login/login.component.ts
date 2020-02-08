import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
   userName:string;
   password:string;
   submitted:boolean;
  constructor() { }

  ngOnInit() {
  }

  onSubmit(user:string,password:string)
  {
    this.submitted=true
   this.userName=user
   this.password=password
  }

}
