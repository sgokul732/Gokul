import { Injectable } from '@angular/core';
import { Boat } from './Boat';
//import { BOATS } from './mock-boat';
import { Http } from '@angular/http';
import { Headers } from '@angular/http';
import 'rxjs/add/operator/toPromise';


@Injectable()
export class BoatService {

  //boatList:Boat[] = BOATS;
  private headers = new Headers({'Content-Type': 'application/json'} ); //Line 1
  constructor(private http:Http) {}  

  getAllBoats(): Promise<Boat[]> {
    
    return this.http.get('http://localhost:3333/SeaQueenBoats/api/sqbBoats/boatsAll')    
    .toPromise()    
    .then(response=>response.json() as Boat[])    
    .catch(this.errorHandler);
    }

    getLocations():Promise<string[]> {      
      return Promise.resolve(['Allepey', 'Kumarkom', 'Srinagar', 'Goa', 'Kochi', 'Asan Barrage']);      
}
    getBoatTypes(): Promise<string[]> {      
      return Promise.resolve(['Houseboat', 'Cruiser', 'Bass Boat', 'Speed Boat', 'Power Catamaran']);
}
updateBoat(updatedBoat:Boat):Promise<Boat> {
  const url = 'http://localhost:3333/SeaQueenBoats/api/sqbBoats/boatUpdate'; //Line 2
  return this.http.put(url, JSON.stringify(updatedBoat), {headers: this.headers}) //Line 3
  .toPromise()
  .then(
  (res) => res.json() as Boat
  ).catch(this.errorHandler);
}
addBoat(boatToAdd:Boat):Promise<Boat>{      
  const url = 'http://localhost:3333/SeaQueenBoats/api/sqbBoats/boatAdd';
  return this.http.post(url, JSON.stringify(boatToAdd), {headers:this.headers} )//Line 1      
                  .toPromise() //Line 2      
                  .then((response)=> <Boat> response.json()) //Line 3      
                  .catch(this.errorHandler); //Line 4      
}

getBoatDetails (boatId:string): Promise<Boat> {
  return this.http.get('http://localhost:3333/SeaQueenBoats/api/sqbBoats/boatDetail/'+boatId)
             .toPromise()
             .then(response => (response.json() as Boat))
             .catch(this.errorHandler);
}
    
    private errorHandler(error:any):Promise<any> {
    console.error("Error occured",error);    
    return Promise.reject(error.message || error);
    }    

    
}


