const numbers = [30, 30, 40, 5, 223, 2049, 3034, 5];

function numSelector(conjunto) {
    let novoConjunto = new Set(conjunto);
    return[...novoConjunto];
}

console.log(numSelector(numbers));