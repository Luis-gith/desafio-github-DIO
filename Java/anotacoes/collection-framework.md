# Collections 

#### [*GUIA*](https://home.csulb.edu/~pnguyen/cecs277/lecnotes/javacollections.pdf)

- Collection é um objeto que agrupa múltiplos elementos(variáveis primitivas ou objetos) dentro de uma única unidade;
- Serve para armazenar e processar coleções de dados de forma eficiente.



### Composição:

+ **Interfaces:** um contrato que, quando assumido por uma classe, deve ser implementado;
+ **Implementações ou Classes:** são as materializações, a codificação das interfaces;
+ **Algoritmos:** sequencia lógica, finita e definida de instruções que devem ser seguidas para resolver um problema.





## Hierarquia JCF(Java Collection Framework)

![](https://prod-acb5.kxcdn.com/wp-content/uploads/2021/07/Collection-in-Java.png.webp)

![](https://prod-acb5.kxcdn.com/wp-content/uploads/2021/07/Map_Hierarchy-1.png.webp)



## Definindo tipos

### Lists

+ Collections do tipo **List** são capazes de armazenar um inteiro chamado **index** para cada elemento armazenado dentro dela. Os index dos elementos começam de **zero** e vão até onde permitirmos. Lists **permitem elementos duplicados**, que apesar de apresentarem o mesmo conteúdo, são diferenciados pelo seu index na List.



### Sets

+ Collections do tipo **Set** são coleções **sem definição de posição** para os elementos armazenados. Sets **não permitem** a existência de elementos duplicados.



### Maps

+ Collections do tipo **Map** são coleções de **pares de objetos**: um **value**(objeto a ser armazenado) e uma **key**(objeto associado ao value, que pode ser utilizado para encontrar o mesmo dentro da collection). Um Map é um conjunto de keys, onde cada key tem um valor associado a ela. Maps **não permitem** a existência de **KEYS duplicadas**.



### Métodos da Interface de Collections

| Método                          | Descrição                                                    |
| ------------------------------- | ------------------------------------------------------------ |
| `add(o : E) : boolean`          | Adiciona um objeto 'o' à Collection. Esse método retorna true se a adição der certo e false se der errado; |
| `clear() : void`                | Remove todos os elementos da Collection;                     |
| `contains(o : Object): boolean` | Retorna true se 'o' for um elemento da Collection e false se não for; |
| `isEmpty() : boolean`           | Retorna true se não houver elementos na Collection e false se houver pelo menos um; |
| `iterator() : Iterator<E>`      | Retorna um objeto chamado "iterator", que pode ser usado para examinar os elementos armazenados em uma Collection; |
| `remove(o : Object) : boolean`  | Remove o objeto 'o' da Collection e retorna true se der certo, false se der errado; |
| `size() : int`                  | Retorna o número de elementos atualmente armazenados na Collection. |



### Iterator Object

Um iterator é um objeto que está associado à collection. O iterator provém métodos responsáveis por coletar alguns elementos da collection, um a um, em uma ordem. Iterators possuem um método para remover de uma collection o último item obtido dela.

#### A interface do Iterator

Iterators implementam a interface de Iterator. Essa interface especifica os seguintes métodos:

| Método              | Descrição                                                    |
| ------------------- | ------------------------------------------------------------ |
| hasNext() : boolean | Retorna true se houver pelo menos mais um elemento da collection que pode ser retornado, falso caso contrário. |
| next() : E          | Retorna o próximo elemento da collection.                    |
| remove() : void     | Remove da collection o elemento retornado pela última call de next(). Esse método pode ser chamado pelo menos uma vez para cada call de next(). |

+ O último método é opcional, então nem todo iterator o possui.



# INCOMPLETO





