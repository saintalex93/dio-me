import { Component, OnInit } from '@angular/core';
import { Todo } from 'src/app/models/todo';
const LOCAL_STORAGE_TODO_KEY = "todos";

@Component({
  selector: 'app-todo-list',
  templateUrl: './todo-list.component.html',
  styleUrls: ['./todo-list.component.css']
})

export class TodoListComponent implements OnInit {

  todos: Array<Todo> = [];

  constructor() {
  }

  ngOnInit(): void {
    let items: any = localStorage.getItem(LOCAL_STORAGE_TODO_KEY);
    let todos = JSON.parse(items);
    todos ? this.todos = todos : this.todos = [];
  }

  addTodo(title: string) {
    const id = this.todos.length + 1;
    this.todos.push({ id: id, title: title, done: false })
    this.updateLocalStorage()
  }

  removeTodo(todo: any) {
    let index = this.todos.indexOf(todo)
    this.todos.splice(index, 1);
    this.updateLocalStorage()
  }

  markTodo(todo: any) {
    let index = this.todos.indexOf(todo)
    this.todos.splice(index, 1, todo);
    this.updateLocalStorage()
  }

  private updateLocalStorage() {
    localStorage.setItem(LOCAL_STORAGE_TODO_KEY, JSON.stringify(this.todos))
  }

}
