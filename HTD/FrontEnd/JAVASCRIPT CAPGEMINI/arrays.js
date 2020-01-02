var technology = ['java','jdbc','hibernate','servlets',1234,true,null];

// console.log(technology);

//FOR OF LOOP
// for(let technologies of technology){
//     console.log(technologies);
// }

// //FOR IN 

// for(let index in technology){
//     console.log('index is ' + index + '  value is ' + technology[index]);
// }

technology.forEach((value,index) => {
    console.log(value);
    console.log(index)
});

console.log('value of hibernate is ' + technology.indexOf('hibernate'))
console.log('before pop ',technology);
console.log(technology.pop());
//return last index and remove it
console.log('after pop ' , technology);

console.log('before pushing' , technology)
technology.push('spring boot');
//adds th element and returns length
console.log('after pushing' ,technology)

console.log('before shift ', technology);
 console.log(technology.shift());
 console.log('after shifting' , technology)

 console.log('before unshift ', technology);
 console.log(technology.unshift());
 console.log('after unshifting' , technology)

technology.splice(2,0,'angular','spring rest','bootstrap');
console.log(technology)

technology.splice(technology.indexOf(1234),2);
console.log(technology);

//lentgth of array
console.log(technology.length)

technology.reverse();
console.log(technology)
console.log(marks)
var marks = [35,12,70,30,60,42,90,11];
let filterarray =  marks.filter((value,index,Array) => {
    return value > 30;
});
console.log(filterarray);

var markss = [20,20,20,30,40,40,40];
//FILTER THIS FOR UNIQUE VALUES
// let filterm = markss.filter((value,index,Array)=>{
//     if(Array.indexOf(value)=== index){
//         return true;
//     } else {
//         return false;
//     }
    

// });
var filterm = markss.filter((value,index,Array)=>{
    return Array.indexOf(value) === index;
});
console.log(filterm);

//map method creates a new array
var x = [20,30,40,50,60];
let newArray = x.map((value,index,Array) => {
    return {index1:index , value1:value} ;
});
console.log(newArray);
