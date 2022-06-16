## Assincronicidade no JavaScript:

Por padrão, o JS roda de maneira síncrona, esperando retornos para continuar os processos. Já que em alguns casos é necessário rodar muitas coisas ao mesmo tempo, também existem as maneiras assíncronas de utilizar o JavaScript. Desse forma, é possível, por exemplo, que o cliente envie uma requisição, e enquanto permanece trabalhando, o servidor processa e retorna os dados.



### Promises:

Uma promise não é nada além de um "representante" para um valor que pode, ou não, ser desconhecido quando ela é criada. Este recurso permite que métodos assíncronos retornem valores como métodos síncronos. Nesse caso, ao invés de simplesmente retornar o valor final, o método assíncrono passa uma promise ao valor em algum momento futuro



Inicialmente, o objeto de processamento assíncrono promise, possui valor desconhecido. Esse valor pode ser, então, rejeitado pelo `catch` ou resolvido.

#### Estados da Promise:

+ **Pending:** Esperando verificação;
+ **Fulfilled:** Passando para as ações assíncronas e, posteriormente, retornando para "Pending"
+ **Rejected:** Falhou na verificação.



![](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise/promises.png)

#### Encadeamento de Promises:

Utilizando os métodos  `.prototype.then`, `.prototype.catch` e `.prototype.finally` é possível associar mais ações a uma promise.



O `.then` aceita até 2 argumentos, sendo o primeiro uma callback para o resolved da primeira promise, e o segundo outra callback para o rejected. Cada `.then` retorna um novo objeto promise, que pode, opcionalmente, ser utilizado em outro encadeamento. 



### Async/await

`Async` define funções assíncronas, para possibilitar que a promise possa retornar um resultado com o `await`. `Await` para o código e insiste na resolução da promise antes que ele possa continuar.

































