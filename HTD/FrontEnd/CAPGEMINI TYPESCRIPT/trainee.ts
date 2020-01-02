interface Trainee {
    name: string,
    age: number,
    printData(): void
}
class Taining implements Trainee{
    name = 'abc';
    age = 22;
    printData() {
        console.log('hiii')
    }
}

let Trainee1: Trainee = {
     name: 'asd',
     age: 45,
     printData: function() {
         console.log(this.name , this.age);

     },
    }

