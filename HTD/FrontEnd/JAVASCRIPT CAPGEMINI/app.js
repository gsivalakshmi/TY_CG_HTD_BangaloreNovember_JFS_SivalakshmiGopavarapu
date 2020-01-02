console.log('hiiii js !!!!');

//VARIABLE DECLARATION
var a;

//VARIABLE INITIALIZATION
a = 100;

console.log("value of a is :" +a);

console.log(typeof a);

//DECLARING STRING
var name = "shiva";
console.log(name);
console.log(typeof name);

var age = 23;
// console.log(age);
// console.log(typeof age);

var details = `The name is ${name} and age is ${age}`;
console.log(details);

//NUMBER
console.log(`The sum of two numbers is ${10+11}`)

var sample= 'hi bujji how r u.......';

console.log(sample);

//BOOLEAN
var icompass = true;
console.log(typeof icompass)

var empty = null;
console.log(typeof empty)


//vSTRICT EQUALS
if(true === 'true'){
    console.log('true block')
}
    else{
        console.log
        ('false block')
    }

    
    if(null == undefined){
        console.log('true block')
    }
        else{
            console.log
            ('false block')
        }

        //OUTPUT METHODS

        alert('Are you ok!?Baby...')

       var userconfirm = confirm('are u sure want to procedd');
       console.log(userconfirm);

       if(userconfirm) {
           console.log('user selected ok')
       }else {
        console.log('user select cancel')
       }

       var userInput = prompt('pls enter name')
       console.log(userInput)

       document.write("welcome to javascipt")

       //functions

       //NAMING FUNCTION

       var a = 'abc';
       function demo(){
           console.log(a);
           var b = 100;
           console.log('function is called')
       }
       //console.log(b);
       //throws error as b is not defined
       //it is a local scoped variable
       demo();

       function add(a , b) {
           return a+b;
       }
       console.log(add(1,3));

       //ANONYMOUS FUNCTION
       var test = function(){
           console.log('ananymous func assigned to variable test');
       }
       test();

       //IMMEDIATE INVOKE FUNCTION
       (function (p,q){
           var name = 'shiva';
           console.log(p+q);
           console.log('inside fn',name)
        console.log('IIFE running')
       })(12,23);
       console.log('outside fn',name);

       function samplet(x) {
           console.log('sample test started');
           x();
           console.log('sample function ended')
       }

       samplet(function(){
           console.log('callback is running')
       });