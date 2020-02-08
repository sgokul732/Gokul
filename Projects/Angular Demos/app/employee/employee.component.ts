import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  userName:string;
  address:string;
  imageUrl:string;
  alignment:string;
  colortheme:string;
  

  constructor() {
    this.userName="john"
    this.address="sdscsdf"
    this.imageUrl="assets/logo/favicon.ico";
    this.alignment="left";
    this.colortheme="red";
   }

  ngOnInit() {
    console.log("check this")
  }

}
