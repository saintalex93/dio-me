import { Occupation } from './Occupation';
var Person = /** @class */ (function () {
    function Person(name, age, occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    return Person;
}());
export default Person;
var personOne = new Person("Maria", 29, Occupation.Atriz);
var personTwo = new Person("Roberto", 19, Occupation.Pedreiro);
var personTree = new Person("Laura", 32, Occupation.Atriz);
var personFour = new Person("Carlos", 19, Occupation.Padeiro);
