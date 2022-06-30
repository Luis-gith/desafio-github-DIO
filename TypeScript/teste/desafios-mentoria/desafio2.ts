// Como podemos melhorar o esse código usando TS? 

/*let pessoa1 = {};
pessoa1.nome = "maria";
pessoa1.idade = 29;
pessoa1.profissao = "atriz"

let pessoa2 = {}
pessoa2.nome = "roberto";
pessoa2.idade = 19;
pessoa2.profissao = "Padeiro";

let pessoa3 = {
    nome: "laura",
    idade: "32",
    profissao: "Atriz"
};

let pessoa4 = {
    nome = "carlos",
    idade = 19,
    profissao = "padeiro"
}*/

enum professions {
    actress = 'Atriz',
    baker = 'Padeiro'
}

interface pessoa {
    nome:string,
    idade:number,
    profissao:string
};

let pessoa1 = {
    nome: "Maria",
    idade: 29,
    profissao: professions.actress
};

let pessoa2 = {
    nome: "Roberto",
    idade: 19,
    profissao: professions.baker
};

let pessoa3 = {
    nome: "Laura",
    idade: 32,
    profissao: professions.actress
};

let pessoa4 = {
    nome: "Carlos",
    idade: 19,
    profissao: professions.baker
};

function getInfo(person:pessoa){
    return `Os dados de ${person.nome} são: \nNome: ${person.nome}\nIdade: ${person.idade}\nProfissão: ${person.profissao}`;
}


console.log(getInfo(pessoa1));