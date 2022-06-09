const person1 = {
    nome: 'Luís Felipe',
    idade: 18,
}

const person2 = {
    nome: 'Lara',
    idade: 19,
}

function futureAge(anos) {
	return `Daqui a ${anos} anos, ${this.nome} terá ${
		this.idade + anos
	} anos de idade.`;
}

console.log(futureAge.call(person1, 5));
console.log(futureAge.apply(person2,[5]));

