
// Como podemos rodar isso em um arquivo .ts sem causar erros? 

//let employee = {};
//employee.code = 7;
//employee.name = "Malcom";

//assim
let employee1: {name:string, code:number} ={
    name: 'Malcom',
    code: 7
};
//ou assim, para generalizar
interface employee {
    code:number,
    name:string
};




