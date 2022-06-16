## Tipos de Erros

### ECMAScript Error:

##### Erros que ocorrem em tempo de execução. Vêm acompanhados de:

+ Mensagem
+ Nome
+ Linha
+ Call Stack (pilha de chamadas até chegar no erro)



### DOMException:

##### Erros relacionados ao DOcument Object Model(DOM)

Aparecem quando há tentativas de leitura do código pela página, mas ela encontra irregularidades pelo caminho, como valores inválidos.





## Tratando Erros

### [Throw](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/throw)

Funciona como return, mas trata o resultado como um erro. Utilizado para estabelecer erros em validações, por exemplo.



### [Try...Catch](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/try...catch)

Dentro de `try` verificamos um código e, se houver erros, ele é capturado no `catch` para ser manipulado como desejarmos.

+ Pode conter o `finally`, que executa independentemente de haver erros ou não. Se esse bloco for designado para retornar um elemento e ele não for enviado ou não for correto, `finally`mostrará um espaço em banco, uma vez que o parâmetro esperado por ele não é válido.



## Criando erros e manipulando o objeto "[Error](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Error)"

Aceita os seguintes parâmetros (todos opcionais), nessa ordem, separados por vírgulas:

+ Mensagem
+ Nome do Arquivo
+ Número da linha





