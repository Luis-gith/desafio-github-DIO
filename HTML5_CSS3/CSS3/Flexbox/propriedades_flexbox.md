### Comando geral

+ [display:flex;]  transforma uma tag num elemento flex-container e todos os filhos da tag em flex-items



### Flex-Direction: 

Estabelece o eixo principal, ou seja, a direção em que os flex-items serão colocados no container.

ATENÇÃO: **TODOS OS COMANDOS TEM UMA VERSÃO REVERSE**

+ [flex-direction: row;]  comportamento padrão, texto vai da esquerda para a direita
  + [row-reverse] sentido oposto.
+ [flex-direction: column;] ordenação dos conteúdos de cima pra baixo em uma coluna



### Flex-Wrap:

Define se a quebra de linha ocorrerá quando o limite do conteúdo for excedido.

O comportamento padrão deixa exceder o limite sem compactação.

+ [flex-wrap: nowrap;] comportamento padrão, sem quebra de linha
+ [flex-wrap: wrap;] permite a quebra de linha quando o container para de comportar o item, mesmo que seja por falta de 1px
  + [flex-wrap: reverse;] permite a quebra de linha da mesma maneira que wrap só que envia o próximo item para a direção oposta à da linha.
    + ex: se um wrap-reverse for adicionado à uma coluna, os itens se adequarão de forma que o primeiro item ficará mais a esquerda, o segundo abaixo, até atingir o limite vertical e quebrar para a coluna a direita, se repetindo até não haver mais espaço no container. **OBS: a definição de uma float (recurso de direção em CSS3) estraga o wrap, porque obriga a mudança da direção e entra em conflito com as mudanças já feitas.**



### Flex-Flow: pouco usado

Faz tudo que o wrap e o direction fazem com uma sintaxe um pouco diferente e que complica o código, na minha opinião. Não uso e é isso.



### Justify-Content:

Alinha os itens de acordo com o espaço do container e da direção definida, além de organizar o espaçamento. Funciona basicamente como justificar um texto no Word. Se o container já estiver 100% ocupado pelos itens, a propriedade não se aplica, uma vez que já está tudo alinhado e espaçado ao máximo.

+ [justify-content: flex-start] alinha a partir do início do container
+ [justify-content: flex-end] alinha a partir do final do container
+ [justify-content: center] alinha a partir do meio do container
+ [justify-content: space-between] cria um espaço igual entre os elementos, sem ultrapassar os limites do container
+ [justify-content: space-around] cria um espaço 2x maior entre os elementos em relação ao espaçamento dado nas bordas do container. (pra mim, fica mais bonito desse jeito)



### Align-Items

Alinha os flex-items de acordo com o eixo definido para o container e é a propriedade que permite alinhamentos verticais, diferentemente de justify-content.

+ [align-items: center;] alinha itens ao centro do container

+ [align-items: stretch;] comportamento padrão, que faz os itens crescerem de acordo com o maior item do container

+ [align-items: flex-start;] alinha os itens ao início do container

+ [align-items: flex-end;] alinha os itens ao início do container

+ [align-items: baseline;] alinha os itens de acordo com a linha de base tipográfica dos elementos 

+ alinhamento central total: olhe o último item do código alignitems.html

  **Dica: **

  `justify-content`: longer word: horizontal alignment

  `align-items`: shorter word: vertical alignment

  ![img](https://css-tricks.com/wp-content/uploads/2019/10/flex-align.svg)



### Align-Content:

Alinha as linhas do container de acordo com o eixo perpendicular, normalmente o vertical (default behaviour). Para funcionar, é necessário que possa acontecer quebra de linhas no container e que sua altura seja maior que a soma das linhas dos itens.

+ [align-items: center;] alinha itens ao centro do eixo perpendicular

+ [align-items: stretch;] comportamento padrão; flex items crescem igualmente, tentando preencher o container, considerando margin, border e padding

+ [align-items: flex-start;] alinhamento ao início do eixo perpendicular

+ [align-items: flex-end;] alinhamento ao final do eixo perpendicular

+ [align-items: space-between;] dá espaçamento igual entre os itens

+ [align-items: space-around;] cria um espaço 2x maior entre os elementos em relação ao espaçamento dado no início e no fim do eixo perpendicular. (pra mim, fica mais bonito desse jeito)

  + **Quando os itens não são filhos de flex-container** 

  [align-items: start(ou [end]);]alinha os itens de forma a empurrar todos o mais próximo do começo do eixo perpendicular possível, enquanto conserva as propriedades de cada item, deixando o resto do container livre. Funciona igual flex-start.



### Align-Self:

Permite alinhamento individual de um item.

+ [align-self: auto] Default. Elemento herda as propriedades align-items do pai. Caso sem pai, utiliza stretch
+ [align-self: stretch] Elementos se adequam de forma a preencher todo o container, de acordo com o seu eixo perpendicular
+ [align-self: center;] Elementos se alinham ao centro do seu eixo perpendicular
+ [align-self: flex-start;] Elementos se alinham no começo de seu eixo perpendicular
+ [align-self: flex-end;] Elementos se alinham no final de seu eixo perpendicular
+ [align-self: baseline;] Elementos se alinham de acordo com a linha base da tipografia do container
+ [align-self: initial;] (propriedade geral: initial. Reseta a propriedade ao valor default)
+ [align-self: inherit;] (propriedade geral: herda propriedades do elemento pai)



### Flex-Grow e Shrink:

[LEIA IMPORTANTE !!!!!](https://css-tricks.com/understanding-flex-grow-flex-shrink-and-flex-basis/)

[LEIA TAMBÉM POR FAVOR!!!!](https://medium.com/@tiffnogueira/understanding-flex-shrink-flex-grow-and-flex-basis-and-using-these-properties-to-their-full-e4b4afd2c930)

Definem as proporcionalidades de crescimento ou compressão dos itens, respeitando seus conteúdos. Só é ativada se for necessário e possível encolher ou aumentar o tamanho. Se a caixa cabe perfeitamente na tela e tem valores de limite, ela não será comprimida ou expandida sem motivos. Podem ser escritas juntas: .child {  flex-grow: 0;  flex-shrink: 1;  }

**OBS: flex-grow não funciona se justify-content estiver ativado**.



**Atribuição de valor 0 determina incapacidade de realizar o grow ou shrink para o elemento. Já o valor 1 permite a ocupação ou desocupação do espaço em uma proporção de 1 para 1 em relação aos outros elementos. Se o valor for para 2, a proporção se torna 2 para 1 e assim sucessivamente. Note que, se todos os itens tiverem os mesmos valores de flex, entre si não serão diferentes em tamanho, apenas sua capacidade de transformação mudará.** 

**OBS atribuir um `basis: [x] px;` proíbe o elemento de crescer ou diminuir além do valor especificado. ** 



#### Como o flex realmente funciona:

`.child {  flex: [flex-grow] [flex-shrink] [flex-basis]; }` é a mesma coisa que `.child {  flex: [max] [min] [ideal size]; }` e o ideal é escrever somente flex: [valor] [valor] [valor]. Note que o flex é uma das poucas propriedades em que é melhor utilizar os atalhos, já que em outras, para melhor compreensão humana do código, as formas completas são melhormente vistas.



### Order:

Lembre-se que essa propriedade existe, mas não é tão necessária em todos os casos. Procure entender se é aplicável para o seu. 

`.order1{ order:1; }`













