//Use html input element para pode chamar.value, senão a propriedade não existe
var btn = document.getElementById('button');
var inp1 = document.getElementById('input1');
var inp2 = document.getElementById('input2');
function soma(n1, n2) {
    return n1 + n2;
}
if (btn) {
    btn.addEventListener('click', function () {
        if (inp1 && inp2) {
            console.log(soma(Number(inp1.value), Number(inp2.value)));
        }
    });
}
