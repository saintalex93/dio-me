export default class Employee {
  code: number;
  name: string;

  constructor(code: number, name: string) {
    this.code = code
    this.name = name
  }

}


let employee: Employee = new Employee(10, "John")