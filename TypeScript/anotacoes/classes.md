### ***[GUIA](https://www.tutorialspoint.com/typescript/typescript_classes.htm#)***

A partir da implementação das classes no ECMAScript 6, o [***TS***](https://www.typescriptlang.org/docs/handbook/2/classes.html) começou a oferecer suporte para essa funcionalidade do ***[JS](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Classes)***.



`class className {`

`class scope`

`}`



A definição de uma classe pode passar pelos seguintes componentes:

+ **Fields:** um field é qualquer variável declarada dentro da classe, representando dados pertencentes a um objeto
+ **Constructors:** responsáveis por alocar memória aos objetos da classe
+ **Functions:** functions representam ações que podem ser realizadas por um objeto. Elas também são referenciadas, em alguns casos, como methods.



Esses componentes em conjunto são definidos como os dados que são membros da classe. Se definirmos a seguinte classe em TypeScript:

`class Person {`

`}`

Ao compilar, o resultado será o seguinte código em JavaScript:

**`var Person = (function(){`**

​     **`function Person(){`**

​     **`}`**

**`return Person;`**

**`}());`**



### Declarando uma classe

**`class Car {`**

​    **`//field`**

​       **`engine:string;`**

​    **`//constructor`**

​      **`constructor(engine:string) {`**

​            **`this.engine = engine`**

​       **`}`**

​    **`//function`**

​         **`disp():void {`**

​              **`console.log("Engine is : " +this.engine)`**

​         **`}`**

**` }`** 



No exemplo acima, declaramos a classe `Car`, que contem um field chamado "engine". A palavra reservada `var` não usada é em nenhum momento da declaração do field. O exemplo acima declara um construtor para a classe. 

Um construtor é uma função especial das classes que é responsável por inicializar as variáveis de uma classe. O TypeScript define um construtor utilizando a palavra reservada `constructor`. Dessa maneira, por também ser uma função, pode ser parametrizada.

A palavra reservada `this` refere-se à instância atual da classe. No caso acima, o nome do parâmetro do construtor é o mesmo do field da classe. Portanto, para evitar ambiguidade, o field recebe o prefixo `this.`. 



### Classes x Interfaces

Classes também podem implementar interfaces:

`interface Loan {`

​    `interest:number`

  `}`

`  class AgriLoan implements ILoan {`

​    `interest:number`

​    `rebate:number`



​       `constructor(interest:number,rebate:number) {`

​       `this.interest = interest`

​       `       this.rebate = rebate`

​    `}`

  `}`

  `var obj = new AgriLoan(10,1)`

  `console.log("Interest is : "+obj.interest+" Rebate is : "+obj.rebate );`



A classe AgriLoan implementa a interface Loan. Sendo assim, está sendo aplicado a classe para incluir a propriedade interest como seu membro.





