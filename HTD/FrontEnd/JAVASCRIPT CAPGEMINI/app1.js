var marks=[21,25,32,25,14,18];

marks.sort((a,b) => {
    return a-b;

});

console.log('ascending order of manju marks:' ,marks);

marks.sort((a,b) => {
    return b-a;

});

console.log('descending order of manju marks:' ,marks);