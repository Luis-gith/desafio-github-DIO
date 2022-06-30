// O código abaixo tem alguns erros e não funciona como deveria. Você pode identificar quais são e corrigi-los em um arquivo TS?

/*let botaoAtualizar = document.getElementById('atualizar-saldo');
let botaoLimpar = document.getElementById('limpar-saldo');
let soma = document.getElementById('soma');
let campoSaldo = document.getElementById('campo-saldo');

campoSaldo.innerHTML = 0

function somarAoSaldo(soma) {
    campoSaldo.innerHTML += soma;
}

function limparSaldo() {
    campoSaldo.innerHTML = '';
}

botaoAtualizar.addEventListener('click', function () {
    somarAoSaldo(soma.value);
});

botaoLimpar.addEventListener('click', function () {
    limparSaldo();
});*/

let botaoAtualizar = document.getElementById('atualizar-saldo') as HTMLButtonElement;
let botaoLimpar = document.getElementById('limpar-saldo') as HTMLButtonElement;
let soma = document.getElementById('soma') as HTMLInputElement;
let campoSaldo = document.getElementById('campo-saldo') as HTMLTitleElement;

//setando valor a ser exibido por padrão no tipo correto
campoSaldo.innerHTML = '0';

function somarAoSaldo(soma:number) {
   campoSaldo.innerHTML = (parseInt(campoSaldo.innerHTML)+soma).toString();
}

function limparSaldo() {
    campoSaldo.innerHTML = '';
}

botaoAtualizar.addEventListener('click', function () {
    //criar funcao com parseInt para resolver problema de tipagem
    let _soma = parseInt(soma.value)
    if(!_soma){
        alert('Digite um número')
    } else {
        soma.value = ''
        somarAoSaldo(_soma);
    }
});

botaoLimpar.addEventListener('click', function(){
    limparSaldo();
})
/*
    <h4>Valor a ser adicionado: <input id="soma"> </h4>
    <button id="atualizar-saldo">Atualizar saldo</button>
    <button id="limpar-saldo">Limpar seu saldo</button>
    <h1>"Seu saldo é: " <span id="campo-saldo"></span></h1>
*/


// complete o programa adicionando funções para subtrair/sacar.