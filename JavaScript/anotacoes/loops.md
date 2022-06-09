### Condicionais If/Else: compara valores(==)

+ A primeira declaração vem dentro do bloco if, entre chaves, sendo essa acionada caso a condição seja verdadeira. A segunda declaração vem dentro do bloco else, entre chaves, sendo essa acionada caso a condição seja falsa.

  + É possível utilizar "else if" para adicionar uma nova verificação, sendo a ordem: if, else if, else. **ATENÇÃO** : Em JavaScript, "else if" é **SEPARADO**, diferentemente de outras linguagens.






### Switch/Case: compara tipos e valores (===)

Essa verificação é útil quando precisamos comparar muitas condições, e **SEMPRE** acompanha um valor DEFAULT.



![](https://github.com/Luis-gith/estudos-gerais/blob/main/JavaScript/anotacoes/imagens/switch-ex.JPG?raw=true)



### For: loop dentro de elementos iteráveis

#### For simples:

+ `for (statement 1; statement2; statement 3) {code}` 
  + 1 é executado uma vez, antes de passar pelo bloco de código; 2 define a condição para executar o bloco de código; 3 é executado todas as vezes que o bloco de código passa.
  
  + Normalmente, **statement 1** sempre será utilizado para inicializar a variável que utilizaremos para definir as repetições. Contudo, isso não é obrigatório, e nem sempre será o caso; Podemos iniciar múltiplos valores em 1, apenas separando-os com vírgulas.
  + Em **statement 2**, colocamos a condição a ser cumprida pela variável inicial para iniciar o bloco `for`. De certa forma, também e opcional, massssssssss, a falta de um limitador pode causar um crash no navegador, já que o processo nunca acaba. Por esse motivo, SEMPRE que omitirmos S2, é necessário definir um break dentro do loop.
  + Em **statement 3**, geralmente, colocamos a operação a ser realizada na variável inicial. Assim como S1 e S2, é opcional e pode ser omitida nos casos em que a operação é executada dentro do bloco de código.



#### For In: realiza loops em relação às propriedades enumeráveis de um objeto

+ O for/in itera sobre um objeto e retorna uma chave(x) a cada iteração, que é utilizada para acessar os valores guardados dentro dela. Assim sendo, o valor da chave(x) é `nomeDoObjeto[x]`

  `const person = {fname:"John", lname:"Doe", age:25};`}

   `let text = "";`
    ` for (let x in person) {`
    `text += person[x];`

  `}`

  

#### For Of: realiza loops em relação aos valores de um objeto iterável

+ O for/of itera sobre os valores de objetos e estruturas de dados iteráveis, como arrays, strings, maps, NodeLists e etc.

  + **Loop em string**: 

    `let language = "JavaScript";`

    `let text = "";`
    `for (let x of language) {`
    `text += x;`
    `}`

    //output = J a v a S c r i p t (cada letra em uma linha)

    

  + **Loop em array**: 

    `const cars = ["BMW", "Volvo", "Mini"];`

    `let text = "";`
    `for (let x of cars) {`
     `text += x;`
    `}`

    //output = BMW Volvo Mini (cada marca em uma linha)





### While:

+ Utilizamos o while para passar pelo bloco de código enquanto a condição for válida. Se fizermos um `while( i < 10) { text += "Number is: " + i;  i++}` o loop acontece enquanto 'i' for menor que 10. **LEMBRANDO QUE: se não mexer na variável de contagem de forma que ela pare o loop em algum momento, vai ficar infinito e vai crashar.** 

  

+ #### Do while

  + Similar ao 'while', executa o bloco de código uma vez antes de fazer a verificação. É estruturado do mesmo jeito, basicamente: `do` `{bloco de código} while(condição);` 









 