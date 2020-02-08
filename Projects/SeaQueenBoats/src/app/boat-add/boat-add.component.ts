import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormBuilder, Validators } from '@angular/forms';
import { AddBoatValidator} from './boat-add.validator'
import { Boat } from '../Boat';
import { BoatService } from '../boat.service';
@Component({
  selector: 'boat-add',
  templateUrl: './boat-add.component.html',
  styleUrls: ['./boat-add.component.css']
})
export class BoatAddComponent implements OnInit {
  
  boatAddForm:FormGroup;
  message:String;
  private locations:string[];
  private boatTypes: string[];
  constructor(private fb:FormBuilder, private boatService:BoatService){//injecting service
   this.createForm();
 }

createForm(){    
  this.boatAddForm = this.fb.group({    
    boatType:["",[Validators.required]],
    location:["",[Validators.required]],
    description:["",[Validators.required, Validators.minLength(10)]],   
    basePrice:["",[Validators.required]],
    discount:["",[Validators.required]],
    bookingStart:["",[Validators.required]],
    allowedDays:["",[Validators.required,AddBoatValidator.allowedDaysValue]]  
  });    
}    

addBoat(){ 
  let boatToAdd:Boat = this.boatAddForm.value as Boat; //Line 1
  this.boatService.addBoat(boatToAdd) //Line 2
                  .then( (response) => this.message = response.message+" with id: "+ response.boatId ) //Line 3
}

addBoatDetails(){
  alert( JSON.stringify( this.boatAddForm.value ) )
}



  ngOnInit() {
    this.boatService.getLocations().then(    
      result => {    
      this.locations = result    
  });
  
  this.boatService.getBoatTypes().then(    
    result => {    
    this.boatTypes = result;    
  });
  }

}
