function filterEven(array) {
    return array.filter(call);
}

function call(item) {
    return item % 2 === 0;
}

const a = [1, 3, 6, 8, 9];

console.log(filterEven(a));