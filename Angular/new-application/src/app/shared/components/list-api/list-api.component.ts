import { ListService } from './../../services/list.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-list-api',
  templateUrl: './list-api.component.html',
  styleUrls: ['./list-api.component.less']
})
export class ListApiComponent implements OnInit {

  constructor(private listService: ListService) { }
  characters: Array<any> = [];

  ngOnInit(): void {
    this.getCharacters()
  }

  getCharacters() {
    this.listService.getList().subscribe(response => {
      this.characters = response.results;
    })
  }
}
