//Use html input element para poder chamar.value, senão a propriedade não existe
let btn = document.getElementById('button');
let inp1 = document.getElementById('input1') as HTMLInputElement;
let inp2 = document.getElementById('input2') as HTMLInputElement;

function soma(n1:number, n2:number) {
    return n1+n2
}

if(btn) {
    btn.addEventListener('click', () => {
        if(inp1 && inp2) {
            soma(Number(inp1.value), Number(inp2.value))
        }
    })
}