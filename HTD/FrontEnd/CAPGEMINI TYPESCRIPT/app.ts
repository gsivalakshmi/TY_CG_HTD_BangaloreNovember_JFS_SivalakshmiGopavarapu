console.log('typescript code started')

let a = 100; // implicitly considered as let a:number = 100;
a = null;

//a = 'string';  error cannot reassign type number to string

let b; //implicity considered as any type
b = 100;
b = 'shiva';
console.log(b)

// let marks: number[] = [1,2,3,4,'shiv'] shows error accepts only numbers no other datatypes

let marks: number[] = [1,2,3,5,4];

let student: {name: string, age: number, pass: boolean}
student = {
    name: 'shiv',
    age: 25,
    pass: true
}

class Student {
    constructor(
   public name: string,
   public age: number,
   public USN: string,
   public marks: number,
   public aaharno: number,
   public pan: string
   ) {

    }
    // printDetails(): void {     //function declaration in class
    //     console.log(`
    //         Name is ${this.name},
    //         age is ${this.age},
    //         USN is${this.USN},
    //         Marks are ${this.marks}
             
    //     `);
}
let student2: Student = {
    name: 'lucky',
    age: 52,
    USN: 'qwer231',
    marks: 25,
    aaharno: 361674388170,
    pan: 'SDTY23FG'
}
let student1 = new Student('shiva',20,'ac123',12,undefined, 'DESFA234sa');
console.log(student2.name)
// console.log(student1)
// student1.printDetails();
console.log('typescript code ended')
