import { Occupation } from './Occupation';
export default class Person {
    name: string
    age: number
    occupation: Occupation

    constructor(name: string, age: number, occupation: Occupation) {
        this.name = name
        this.age = age
        this.occupation = occupation
    }
    
}


let personOne: Person = new Person("Maria", 29, Occupation.Atriz)
let personTwo: Person = new Person("Roberto", 19, Occupation.Pedreiro)
let personTree: Person = new Person("Laura", 32, Occupation.Atriz)
let personFour: Person = new Person("Carlos", 19, Occupation.Padeiro)