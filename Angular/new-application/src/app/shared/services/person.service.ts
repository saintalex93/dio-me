import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PersonService {

  constructor() { }

  getPersons(): Observable<any> {
    let persons = [{
      firstName: 'Alex',
      lastName: 'Santos',
      age: '29'
    },
    {
      firstName: 'Mathias',
      lastName: 'Santos',
      age: '5'
    },
    {
      firstName: 'Théo',
      lastName: 'Santos',
      age: '2'
    },
    {
      firstName: 'Cristine',
      lastName: 'Fogaça',
      age: '35'
    }];

    return of(persons);
  }

}
