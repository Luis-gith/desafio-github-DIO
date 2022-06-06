# Tópicos essenciais sobre funções em JS

### Tipos de função

+ **Estrutura inicial de uma função:** reservada `function`, nome dela e seus parâmetros. **Ex:**`function name(parameters){statements}.`

+ **Return:** para a execução da função e determina valor que pode ser usado em outras operações.

+ **Função anônima:** uma variável pode armazenar uma função e, nesse caso, não é necessário dar nome. **Ex:** `const soma = function (a,b) {return a+b}`.

+ **Função autoinvocável:** IIFE(Immediately Invoked Function Expression) é uma função também anônima, mas que é seguida de parênteses  vazios. Também pode ser utilizada com parâmetros ou armazenada numa const ou var. 

  + ex:  `(`

    `function() {`

    `let name = "Luís Felipe Belasco Silva"`

    `return name; }`

    `)();`

+ **Callbacks:** função passada como argumento para outra.

  ![callback](C:\Users\Lipe\Downloads\callback.jpg)

  

### Parâmetros

Parâmetros de uma função são os nomes listados durante a definição da função.

+ **Regras:**
  + Definições de funções não especificam tipos de dado para um parâmetro;
  + Funções não executam checagem de tipo nos argumentos passados;
  + Funções não checam o número de argumentos recebidos.
  + **Parâmetro DEFAULT:** O comportamento padrão de uma função que é chamada com menos argumentos do que foram declarados, os valores não definidos são tomados como `undefined` pelo JavaScript. Em alguns caso, isso é aceito, mas em outros é mais seguro colocar um valor default para esses parâmetros.
    + `function myFunction(x, y = 2) {`
      `}`

### O  Objeto  Arguments

Funções de JavaScript têm um objeto embutido chamado de "arguments object". Esse objeto contem um array dos argumentos utilizados quando a função foi invocada. Dessa forma, é possível realizar ações como encontrar o maior valor em uma lista de números. 

![ex-arguments](C:\Users\Lipe\Downloads\ex-arguments.jpg)



[Leitura de suporte](https://www.w3schools.com/js/js_function_parameters.asp)



