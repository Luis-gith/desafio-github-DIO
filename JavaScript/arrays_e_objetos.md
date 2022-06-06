## Arrays

### Técnica do Spread

![](C:\Users\Lipe\Downloads\exemplo-spread.jpg)

O que era considerado um array vira um elemento independente. No caso acima, há presença de três elementos no array e três parâmetros na função. Dessa maneira o `console.log` associará, os conteúdos do array aos parâmetros, respeitando a ordem em que foram declarados.

+ **OBS:** usando essa técnica, é possível deixar o código mais leve. Um dos exemplos seria na utilização dos elemento de um array para realizar um soma que, se posta da maneira comum, precisaria da definição uma variável para cada elemento do array.

  ![ex2-spread](C:\Users\Lipe\Downloads\ex2-spread.jpg)

  

### Técnica do Rest

Essa funcionalidade permite que a função receba um número indefinido de argumentos, e os armazena num array.

![ex-rest](C:\Users\Lipe\Downloads\ex-rest.jpg)









## Objetos

### Object Destructuring

É possível filtrar um argumento de dentro de uma função, de forma que não seja necessário percorrer e obter todos os dados dela. 

![obj-destructuring](C:\Users\Lipe\Downloads\obj-destructuring.jpg)

+ Nesse caso, foi filtrado de `'user'` apenas o necessário, `id` e `full name`, enquanto `displayName` não foi mostrado. 

  + Confia que esse trem é bão. 

    > Fonte: Datafolha e IBGE.