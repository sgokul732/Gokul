import { Component, OnInit, Input } from '@angular/core';
import { Boat } from '../Boat'
import { ActivatedRoute, Router, ParamMap } from '@angular/router';
import 'rxjs/add/operator/switchMap';
import { BoatService } from '../boat.service';
import { Location } from '@angular/common';


@Component({
  selector: 'boat-details',
  templateUrl: './boat-details.component.html',
  styleUrls: ['./boat-details.component.css']
})


export class BoatDetailsComponent implements OnInit {

  private chosenBoat: Boat;
  private boatTypes: string[];
  private locationTypes:string[];
  // @Input()
  // chosenBoat : Boat;
  // display:boolean=true;   
  // updateCheck:boolean=false;

  constructor(private boatService: BoatService,private router: Router, 
    private route:ActivatedRoute, private location:Location) {      
}

  // modifyVariablesOnClick(){
  //   this.display=false;
  //   this.updateCheck=true;
  //   }

    ngOnInit():void {
      this.chosenBoat = new Boat();
      this.route.paramMap
                .switchMap( (params: ParamMap) => this.boatService.getBoatDetails(params.get('boatId') ) )
                .subscribe(boat => {this.chosenBoat = boat; });              
}

goBack():void {
  this.location.back(); //forward() method to navigate to forward page
} 

}
