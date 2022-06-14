function mp(arrayNumbers) {
    return arrayNumbers.map(function(item) {
        return item * 2;
    });
}

const numbers = [1, 2 , 3, 4, 5];

console.log(mp(numbers));