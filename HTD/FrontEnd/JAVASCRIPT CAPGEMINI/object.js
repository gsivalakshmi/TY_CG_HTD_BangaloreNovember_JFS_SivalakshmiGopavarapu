var person = {
    aadharno : 361674388170
}
var pandetails ={
    panid : '1254s3644'
}
var student = {
    ...person,  //inherits all the persons details ito student
    ...pandetails,
    id: 1234,
    name: 'shiva',
    degree: 'b.tech',
    phone: 739643616,
    address: {
        city: 'proddatur',
        state: 'AP',
        pincode: 516360
    }
}

for (let key in student){
    console.log(key+ '::: '+ student[key]);
}
// console.log(student.address.city)
// console.log(student);
// console.log(student.aadharno);
