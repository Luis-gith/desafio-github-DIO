### **Padrão de definição de uma variável:**

+ `<visibilidade><modificador>tipo nome<= valorInicial>;`

+ V(opcional): public, protected e private

+ M(opcional): static e final (utilizado para definir uma variável constante)

+ T: tipo de dado [Java é uma linguagem muito tipada]

+ N: nome da variável

+ VI(opcional): um valor inicial, caso necessário



### Tipos de Variável

+ String: armazena dados textuais. Os valores de uma string devem ter aspas duplas e, para tipas, usamos letra maiúscula;
  + `String car = "Aston Martin"`;
+ int: armazena números inteiros, sem utilizar casas decimais;
+ float: armazena números com casas decimais;
+ char: armazena letras individuais e devem ter aspas simples
  + `char firstLetter = 'a'`;
+ boolean: armazena valores true e false;



#### Declarando variáveis

+ Múltiplas variáveis: basta separar a declaração por vírgulas: `int a = 1, b = 2, c = 3;`

+ Mesmo valor para múltiplas variáveis: `a = b = c = 10;`

  

### Identificadores

Toda variável do Java deve ser identificada com um nome único, definido como identifier. Normalmente, o melhor é utilizar nomes que façam sentido e descrevam a função da variável, para facilitar a compreensão humana do código. 

#### **Regras e convenções**:

+ Variáveis não podem ser iniciadas com números: 1person;
+ Embora permitida, a utilização de '$' e ' _ ' deve ser evitada (não podem conter outros caracteres especiais);
+ Variáveis são case-sensitive: abc3 **≠** Abc3 **≠** AbC e etc;
+ Variáveis não podem ter espaços;
+ Sempre comece com letra minúscula(exceto quando final: `int final CONTADOR = 1`);
+ Utilize nomes expressivos;
+ camel-Case Notation;
+ Fórmula geral: `tipo nomeVariavel = valor;`
+ Variáveis não podem ser palavras reservadas do Java;

![](C:\coisas\Estudo\Programação\Java\anotacoes\reservadas.jpg)

































