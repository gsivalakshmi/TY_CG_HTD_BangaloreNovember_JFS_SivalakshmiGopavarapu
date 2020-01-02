"use strict";
var Taining = /** @class */ (function () {
    function Taining() {
        this.name = 'abc';
        this.age = 22;
    }
    Taining.prototype.printData = function () {
        console.log('hiii');
    };
    return Taining;
}());
var Trainee1 = {
    name: 'asd',
    age: 45,
    printData: function () {
        console.log(this.name, this.age);
    },
};
