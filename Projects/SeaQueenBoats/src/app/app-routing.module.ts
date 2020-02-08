import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BoatsComponent } from './boats.component';
import { BoatDetailsComponent } from './boat-details/boat-details.component';
import { BoatAddComponent } from './boat-add/boat-add.component';

const routes: Routes = [
    
  { path: '', redirectTo: '/', pathMatch: 'full' },
  { path:'displayAllBoats', component: BoatsComponent },
  { path: 'boatAdd', component: BoatAddComponent},
  { path: 'boat/:boatId', component: BoatDetailsComponent } // adding a new Boat
];

@NgModule({
  imports: [ 
      RouterModule.forRoot(routes)
    ],
  exports: [
       RouterModule
    ]
})
export class AppRoutingModule { }