let btn = document.getElementById('button');
let inp1 = document.getElementById('input1');
let inp2 = document.getElementById('input2');

function soma(n1, n2) {
    if(typeof n1 === 'number' && typeof n2 === 'number'){
    return n1+n2;
} else {
    return Number(n1) + Number(n2);
}
}

btn.addEventListener('click', () => {
    console.log(soma(inp1.value, inp2.value));
})