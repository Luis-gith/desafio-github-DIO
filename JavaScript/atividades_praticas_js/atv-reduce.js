// some todos os números de um array

function sum(array) {
    return array.reduce(function(prev, curr) {
        return prev + curr;
    });
}

const a = [1, 2, 7, 13];

console.log("A soma do elementos desse conjunto é:",sum(a));

// saldo após subtrair reços da lista de compras

function saldoRestante(saldo,listaDeCompras) {
    return listaDeCompras.reduce(function(p,c) {
        return p - c.price;
    }, saldo);

}

const compras = [
    {
        name: "mamão",
        price: 10,
    },
    {
        name: "morango",
        price: 5,
    },
    {
        name: "queijo",
        price: 30,
    },
    {
        name: "frango inteiro",
        price: 6,
    }
];
const foodMoney = 500;

console.log("O saldo restante após a compra é de:",saldoRestante(foodMoney,compras));