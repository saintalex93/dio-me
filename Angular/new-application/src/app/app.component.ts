import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less']
})
export class AppComponent implements OnInit {
  count = 0;
  text: string = '';
  persons = [
    {
      name: "Alex",
      lastName: "Santos"
    },
    {
      name: "Mathias",
      lastName: "Santos"
    },
    {
      name: "Théo",
      lastName: "Santos"
    },
    {
      name: "Cristine",
      lastName: "Fogaça"
    },
  ];
  clicked(name: string): void {
    console.log(`${name} click`);
  }


  constructor() {

  }

  ngOnInit() {

    let interval = setInterval(() => {
      this.count++;
      if (this.count === 10) {
        clearInterval(interval)
      }
    }, 1000)

  }


}
