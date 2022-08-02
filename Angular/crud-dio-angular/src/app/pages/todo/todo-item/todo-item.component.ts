import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { Todo } from 'src/app/models/todo'
@Component({
  selector: 'app-todo-item',
  templateUrl: './todo-item.component.html',
  styleUrls: ['./todo-item.component.css']
})
export class TodoItemComponent implements OnInit {
  @Input() todo: Todo = {
    id: 0,
    title: '',
    done: false
  };

  @Output() remove = new EventEmitter
  @Output() markAsDoneEmitter = new EventEmitter;

  constructor() { }

  ngOnInit(): void {
  }

  removeTodo(): void {
    this.remove.emit(this.todo)
  }

  

  markAsDone(): void {
    // debugger;
    this.todo.done = true;
    this.markAsDoneEmitter.emit(this.todo)
  }

}
