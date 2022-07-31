import { PersonService } from './shared/services/person.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less']
})
export class AppComponent implements OnInit {
  constructor(private personService: PersonService) { }
  count = 0;
  text: string = '';
  persons = []

  ngOnInit() {
    this.personService.getPersons().subscribe(persons=>this.persons = persons)
    let interval = setInterval(() => {
      this.count++;
      if (this.count === 10) {
        clearInterval(interval)
      }
    }, 1000)
  }


  clicked(name: string): void {
    console.log(`${name} click`);
  }

 





}
