import { PersonService } from './../../services/person.service';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-persons',
  templateUrl: './list-persons.component.html',
  styleUrls: ['./list-persons.component.less']
})
export class ListPersonsComponent implements OnInit {
  @Input() persons = [{ firstName: '', lastName: '', age: 0 }]

  constructor(private personService: PersonService) { }

  ngOnInit(): void {
  }

}
