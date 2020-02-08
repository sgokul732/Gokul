import { Component } from '@angular/core';
import { Boat } from './boat'
//import { BOATS } from './mock-boat'
import { BoatService } from './boat.service';
import { OnInit } from '@angular/core/src/metadata/lifecycle_hooks';
import { Router } from '@angular/router';
import { Location } from '@angular/common';

@Component({
  selector: 'boats',
  templateUrl: './boats.component.html',
  styleUrls: ['./boats.component.css']
})


export class BoatsComponent implements OnInit {
 
  show: boolean = false;
  boatData:Boat[];
  displayBoat: Boat;
  addBoatFlag = false; //Will be used to show or hide the add boat form    
  showDetailFlag = false; //Will be used to show or hide the boat detail table
  
  constructor(private boatService:BoatService, private location:Location,
    private router:Router) { }

  showBoat(boat: Boat) {
    this.showDetailFlag = this.showDetailFlag ? false : true;
    this.displayBoat = boat;
    //alert("Details of " + this.boat.boatType + "\n" + this.boat.description);
  }

  onSelect(boat:Boat):void{
    this.showDetailFlag = true;
    this.addBoatFlag = false;
    this.displayBoat = boat;
}

// Method is used to switch the value of variable to display add boat form

addBoat():void{
    this.addBoatFlag = true;
    this.showDetailFlag = false;
}
goForward():void {
  this.location.forward(); //forward() method to navigate to forward page
} 


gotoDetails(boat:Boat){
  this.router.navigate(['/boat', boat.boatId]);
}
  


  ngOnInit():void{        
    this.boatService.getAllBoats().then(response=>this.boatData=response);}
}
