import { Component } from '@angular/core';
import { Boat } from './Boat'
@Component({
  selector: 'boats',
  templateUrl: './boats.component.html'
})

export class BoatsComponent {

    boat: Boat = {
        boatId: '1001',
        boatType: 'Houseboat',
        location: 'Allepey',
        allowedDays: null,
        basePrice: 999.0,
        discount: 0.066,
        bookingStart: new Date(new Date().getTime() + 100000000),
        description: `These boats offer the luxury of living on water 
        and provide excellentrecreational & holiday accomodation facilities`,
        message: ''
};
}
