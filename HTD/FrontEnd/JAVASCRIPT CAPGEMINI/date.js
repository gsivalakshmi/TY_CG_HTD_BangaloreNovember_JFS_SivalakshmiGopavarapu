// var date = new Date();

// console.log("Date is: " , date.getDate())
// console.log("month is: " , date.getMonth()+1)
// console.log("year is: " , date.getFullYear());
// console.log(date.getHours())
// console.log(date.getMinutes())
// console.log(date.getMilliseconds())

setInterval(() => {
    var date = new Date();
    document.getElementById('todaysDate').innerHTML = `
    Date ::: ${date.getDate()}-${date.getMonth() +1}-${date.getFullYear()}
    Time ::: ${date.getHours()}:${date.getMinutes()}:${date.getSeconds()}:${date.getMilliseconds()}`
},1);