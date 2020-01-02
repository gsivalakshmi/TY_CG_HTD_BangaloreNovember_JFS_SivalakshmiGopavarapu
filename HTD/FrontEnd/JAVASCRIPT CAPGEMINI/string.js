let message = 'good morning folks';

//returns ascii value of the char at the specified index
console.log(message.charCodeAt(3));

//returns the character in specified index
console.log(message.charAt(2));

// let splittedmsg = message.split('');
// console.log(splittedmsg);

//reversing a string
let splittedmsg = message.split('').reverse().join(' ');
console.log(splittedmsg);

//to check particular string value is present in that
console.log(message.includes('folks'));    //it returns boolean

//to upper
console.log(message.toUpperCase());
console.log(message.toLowerCase());
// console.log(message.toLocaleUpperCase());

//its check from startindex to upto whatever we give the length and its accept spaces also
console.log(message.substr(0,10));

//to find the length of string
console.log(message.length)

//rest parameter
function add(...nums) {
    let sum = 0;
    for (const number of nums) {
        sum = sum + number;
    }
    console.log('sum of the numbers: ' , sum);
}

add(10,30,50,24);

//object DESTRUCTURING
let student = {
    id: 123,
    name: 'Hemakukka',
    age: 78
}

let {id,name,...theRest} = student;
console.log(id)
console.log(name)
console.log(theRest)

//ARRAY DESTRUCTURING
let marks = [20,40,60,80,100];

let[maths,ps,hindi,telugu,...rest] = marks;

console.log('maths marks :' ,maths)
console.log('ps marks :',ps);
console.log('hindi marks ' , hindi)
console.log('telugu marks ' , telugu)
console.log('rest of marks ', rest)

