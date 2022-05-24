function compare (n1, n2) {
    const firstPhase = createFirst(n1, n2);
    const secondPhase = creatSecond(n1, n2);

    return `${firstPhase} ${secondPhase}`;
}

function createFirst(n1, n2) {
    let firstPhase = `Os números ${n1} e ${n2}`; 
    let yn = 'não';

    if(n1==n2) {
        yn='';
    }

    return `${firstPhase} ${yn} são iguais.`;
}

function creatSecond(n1, n2) {
    const soma = n1 + n2;
    let compareDez = 'menor';
    let compareVinte = 'menor';

    if(soma>10) {
        compareDez = 'maior';
    }

    if(soma>20) {
        compareVinte = 'maior';
    }

    return `Sua soma é ${soma}, um resultado ${compareDez} do que 10 e ${compareVinte} do que 20.`
}


console.log(compare(15, 5));