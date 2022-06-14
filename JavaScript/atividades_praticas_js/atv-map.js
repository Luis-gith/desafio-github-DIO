const a = {
    value: 3,
};

const b = {
    value: 5,
}; 

function delta(array, thisArg) {
    return array.map(function(item) {
        return item * this.value; 
    },thisArg);
}

const numbers = [1, 2]

console.log(delta(numbers, a));
console.log(delta(numbers, b));