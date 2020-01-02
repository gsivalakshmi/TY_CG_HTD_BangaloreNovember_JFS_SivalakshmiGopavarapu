"use strict";
console.log('typescript code started');
var a = 100; // implicitly considered as let a:number = 100;
a = null;
//a = 'string';  error cannot reassign type number to string
var b; //implicity considered as any type
b = 100;
b = 'shiva';
console.log(b);
// let marks: number[] = [1,2,3,4,'shiv'] shows error accepts only numbers no other datatypes
var marks = [1, 2, 3, 5, 4];
var student;
student = {
    name: 'shiv',
    age: 25,
    pass: true
};
var Student = /** @class */ (function () {
    function Student(name, age, USN, marks, aaharno, pan) {
        this.name = name;
        this.age = age;
        this.USN = USN;
        this.marks = marks;
        this.aaharno = aaharno;
        this.pan = pan;
    }
    return Student;
}());
var student2 = {
    name: 'lucky',
    age: 52,
    USN: 'qwer231',
    marks: 25,
    aaharno: 361674388170,
    pan: 'SDTY23FG'
};
var student1 = new Student('shiva', 20, 'ac123', 12, undefined, 'DESFA234sa');
console.log(student2.name);
// console.log(student1)
// student1.printDetails();
console.log('typescript code ended');
