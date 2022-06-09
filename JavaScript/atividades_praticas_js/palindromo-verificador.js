// solução 1

function verify(string) {
    if(!string) return "string inválida";
/* quando damos split, a string vira array e possibilita
a utilização do método .reverse */
    return string.split("").reverse().join("") === string;

}

// console.log(verify("word-here"));

// solução 2

function verify2(string) {
    if (!string) return "string inválida";

    for(let i = 0; i < string.length / 2; i++) {
        if(string[i] !== string [string.length - 1 - i] ) {
        return false;
        }
    }

    return true;
}

// console.log(verify2("word-here"));