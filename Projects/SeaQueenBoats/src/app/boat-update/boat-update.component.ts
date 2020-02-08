import { Component, OnInit, Input } from '@angular/core';
import { Boat } from '../Boat';
import { BoatService } from '../boat.service';


@Component({
  selector: 'update-boat',
  templateUrl: './boat-update.component.html',
  styleUrls: ['./boat-update.component.css']
})
export class BoatUpdateComponent implements OnInit {

  @Input()
  receivedBoat:Boat;
  boatToUpdate:Boat;
  private locations:string[];
  private boatTypes: string[];
  constructor(private boatService:BoatService) {
  
 
}
  ngOnInit() {
  
  this.boatToUpdate = new Boat();  
  this.boatToUpdate.allowedDays = this.receivedBoat.allowedDays;  
  this.boatToUpdate.basePrice = this.receivedBoat.basePrice;  
  this.boatToUpdate.boatId = this.receivedBoat.boatId;  
  this.boatToUpdate.boatType = this.receivedBoat.boatType;  
  this.boatToUpdate.bookingStart = this.receivedBoat.bookingStart;  
  this.boatToUpdate.description = this.receivedBoat.description;  
  this.boatToUpdate.discount = this.receivedBoat.discount;  
  this.boatToUpdate.location = this.receivedBoat.location;  
  this.boatToUpdate.message = this.receivedBoat.message;

  this.boatService.getLocations().then(    
    result => {    
    this.locations = result    
});

this.boatService.getBoatTypes().then(    
  result => {    
  this.boatTypes = result;    
});


}

updateBoatDetails() {   
  // alert(JSON.stringify(this.boatToUpdate));
  this.boatService.updateBoat(this.boatToUpdate).then(  
  (resBoat) => this.boatToUpdate=resBoat  
  )      
}

}
