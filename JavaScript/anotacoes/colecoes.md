## Map:

O objeto *Map* armazena pares chave-valor e registra a ordem de inserção de cada uma das chaves. Qualquer valor, tanto objetos quanto valores primitivos, podem ser utilizados como chave ou valor.



De certa forma, um *Map* e um *Object* são quase iguais. Ainda assim, há algumas diferenças bem importantes que fazem o primeiro ser uma melhor alternativa para alguns casos: 



1. O número de itens de um *Map* pode ser obtido com a propriedade .*size*, enquanto num *Object* é necessário determinar o tamanho manualmente;
2. Um *Map* não possui nenhuma chave, por padrão. Já nos *Objects*, é possível que algumas chaves criadas por padrão entrem em conflito com aquelas por você criadas;
3. Qualquer tipo de valor pode ser uma chave num *Map*, já num *Object*, apenas *Strings* ou [*Symbols*](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Symbol) (objeto comumente utilizado para definir chaves que não podem conflitar);
4. Um *Map* é um objeto iterável, então ele pode ser diretamente iterado, enquanto um *Object* precisa de um protocolo de iteração *(Object.keys ou Object.entries)* ou *for/in*;
5. *Maps* performam melhor em situações de edição constante, enquanto *Objects* não são otimizados para edição frequente.



##### [Leitura auxiliar](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Map)(merge em 'examples')



#### Métodos

| Método    | Descrição                                                    |
| :-------- | :----------------------------------------------------------- |
| new Map() | Cria um novo objeto *Map*                                    |
| set()     | Define o valor de uma chave num *Map*                        |
| get()     | Obtém o valor de uma chave num *Map*                         |
| clear()   | Remove todos os elementos de um *Map*                        |
| delete()  | Remove um elemento, especificado por uma chave, de um *Map*  |
| has()     | Retorna *true* se uma chave existir num *Map*                |
| forEach() | Invoca um *callback* para cada par de chave/valor num *Map*  |
| entries() | Retorna um objeto iterador com o par [chave, valor] num *Map* |
| keys()    | Retorna um objeto iterador com as chaves de um *Map*         |
| values()  | Retorna um objeto iterador dos valores de um *Map*           |





## Set: o objeto sem chaves

Coleção chaveada que armazena **APENAS** valores únicos, sem possibilidade de repetição, diferentemente de um *array*. Devido ao fato de não possuir chaves associadas aos valores, é compatível com *Maps*.



| Método                                                       | Descrição                                                |
| :----------------------------------------------------------- | :------------------------------------------------------- |
| new Set()                                                    | Cria um novo *Set*                                       |
| add()                                                        | Adiciona um novo elemento ao *Set*                       |
| delete()                                                     | Remove um elemento do *Set*                              |
| has()                                                        | Retorna true se um valor existir no *Set*                |
| clear()                                                      | Remove todos os elementos de um *Set*                    |
| forEach()                                                    | Invoca um *callback* para cada elemento do *Set*         |
| values()[[leitura]](https://www.javatpoint.com/javascript-set-values-method) | Retorna um iterador com todos os valores do *Set*        |
| keys()                                                       | Igual values()                                           |
| entries()                                                    | Retorna um iterador com o par [valor, valor] de um *Set* |





### [Set x Array](https://medium.com/front-end-weekly/es6-set-vs-array-what-and-when-efc055655e1a)

+ *Arrays* são mais flexíveis e, por isso, possuem mais métodos disponíveis, que não existem para *Sets*. Apesar disso, cada um tem seu uso e, na minha opinião, *Sets* são melhores quando a coleção em questão realmente não pode ter duplicidade e/ou conflitos durante seu uso.
