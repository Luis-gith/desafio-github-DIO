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
var professions;
(function (professions) {
    professions["actress"] = "Atriz";
    professions["baker"] = "Padeiro";
})(professions || (professions = {}));
;
var pessoa1 = {
    nome: "Maria",
    idade: 29,
    profissao: professions.actress
};
var pessoa2 = {
    nome: "Roberto",
    idade: 19,
    profissao: professions.baker
};
var pessoa3 = {
    nome: "Laura",
    idade: 32,
    profissao: professions.actress
};
var pessoa4 = {
    nome: "Carlos",
    idade: 19,
    profissao: professions.baker
};
function getInfo(person) {
    return "Os dados de ".concat(person.nome, " s\u00E3o: \nNome: ").concat(person.nome, "\nIdade: ").concat(person.idade, "\nProfiss\u00E3o: ").concat(person.profissao);
}
console.log(getInfo(pessoa1));
