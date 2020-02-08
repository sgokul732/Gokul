import { Component, OnInit } from '@angular/core';
import {Employee} from '../employee';
import { EMPLOYEES } from '../mockemployee';
@Component({
  selector: 'employeedata',
  templateUrl: './employeedata.component.html',
  styleUrls: ['./employeedata.component.css']
})
export class EmployeedataComponent implements OnInit {
   employees:Employee[];
   columnspan:number;
  constructor() { 
     this.employees=EMPLOYEES
     this.columnspan=2
  }

  ngOnInit() {
  }

}
