const alunos = [
	{
		nome: 'João',
		nota: 5,
		turma: '1B',
	},
	{
		nome: 'Sofia',
		nota: 9,
		turma: '1B',
	},
	{
		nome: 'Paulo',
		nota: 6,
		turma: '2C',
	},
    {
        nome: 'Marcos',
        nota: 2,
        turma: '2C',
    }
];

function stPass(array, avg) {
    let aux = [];
    for(let i = 0; i < array.length; i++) {

        const {nota, nome} = array[i]
        if(nota >= avg) {
            aux.push(nome);
        }
    }
  return aux;
}
console.log(stPass(alunos, 8));