# Orientação a Objetos: entendendo o básico para compreender Java



## Paradigma Estruturado X Paradigma da Orientação a Objetos:

#### Razões Para Usar POO

+ **PE** tem uma representação simplista, enquanto **POO** busca estar mais perto da realidade;
+ **PE** foca em operações(funções) e dados, enquanto **POO** foca na modelagem de entidades e suas interações;
+ **PE** foca em como fazer algo, enquanto **POO** foca no que fazer;

##### Algumas vantagens da POO:

+ Melhor coesão;
+ Melhor acoplamento;
+ Diminuição do Gap semântico entre a linguagem humana;
+ Geralmente possui coletor de lixo nas linguagens, para que não precisemos limpar o buffer manualmente (ex: fflush em C);



### Fundamentos da Orientação a Objetos

1. **Abstração:** processo pelo qual se isolam características de um objeto, considerando os que tenham em comum certos grupos de objetos;
2. **Herança/Reuso:** capacidade de criar novas unidades de código a partir de outras já existentes;
3. **Encapsulamento:** capacidade de esconder complexidade e proteger dados;
4. **Polimorfismo:** consiste na alteração do funcionamento interno de um método herdado para suprir as necessidades da instância que o objeto se encontra naquele momento



### Conceitos Básicos

+ **Classe:** através de uma classe, podemos definir os atributos de certos objetos se os mesmos tiverem características similares. Além disso, ao definir uma classe, pode-se passar o comportamento dos objetos através dos métodos;
+ **Atributos:** conjunto de propriedades de uma classe, responsável pelo comportamento dos objetos, sendo estes redefiníveis quando necessário. Ao definirmos a lista de atributos de uma classe *'CARROS'*, um objeto pertencente a ela terá uma cópia de cada uma das características, porém, individualmente conectadas a ele. A partir disso, podemos isolar um objeto e alterar apenas as suas propriedades, sem mexer na classe, que define todos os outros objetos;
+ **Métodos:** porções de código que definem as ações dos objetos instanciados numa classe. Métodos só são executados quando chamados e, por isso, geralmente são utilizados para definir comportamentos e identificar quais serviços e ações uma classe pode oferecer;
+ **Objeto:** representação de uma coisa ou conceito real que possui significado bem definido para um software. Para tal, precisamos definir sua classe, ora ora;
+ **Mensagem:** os objetos de um sistema orientado a objetos estão sempre se comunicando para realizar tarefas. Essa comunicação é feita através da troca de *mensagens*. Cada mensagem é uma requisição para que um objeto execute uma operação específica. Para requisitar que um objeto obj execute uma operação op (sem argumentos) escrevemos obj.op() em Java, o que indica que durante a execução a mensagem op() será enviada ao objeto obj.



### As Relações na Orientação a Objetos

[*Leitura up/downcasting e polimorfismo*](http://tecnopode.blogspot.com/2018/04/poo-p-24.html)   *[Leitura sobrescrita e sobrecarga](https://www.devmedia.com.br/sobrescrita-e-sobrecarga-de-metodos-em-java/22603)*

+ **Herança(Java não tem herança múltipla):** define-se como herança o relacionamento entre classes em que uma é filha da outra, uma extensão, subtipo da superclasse(classe pai/ classe base/ classe mãe). Por consequência, a subclasse já vem com os atributos e métodos da mãe, além de poder ter características individuais. Uma classe 'pessoas' pode ter uma subclasse chamada 'família', que organiza certos objetos de 'pessoas' em grupos comuns com relações específicas entre si;
+ **Associação:** faz possível a relação entre classes/objetos, onde podem pedir ajuda à outras classes/objetos e representar de maneira completa o conceito ao qual foram destinadas. Em suma, classes e objetos interagem entre si para atingir um objetivo especificado;
  + Associações Estruturais
    + *[Composição e Agregação](https://acervolima.com/associacao-composicao-e-agregacao-em-java/#:~:text=Composi%C3%A7%C3%A3o%20%C3%A9%20uma%20forma%20restrita,existir%20sem%20a%20outra%20entidade.)*
  + Associação Comportamental
    + [*Dependência*](https://www.ateomomento.com.br/orientacao-a-objetosuml-relacionamento-entre-classes-dependencia/)
+ **Interface:** define um contrato a ser seguido pela classe que a implementa. Quando uma classe implementa uma interface, ela está se comprometendo a ter os comportamentos, atributos, métodos disponibilizados na implementação;



### Organização na Orientação a Objetos

+ **Pacotes:** organização física ou lógica, criada pra separar classes com responsabilidades distintas. Assim, espera-se que uma aplicação possa ser mais organizada, e seja possível separar classes com finalidades diferentes.
+ **Visibilidades:** um modificador de acesso tem como finalidade determinar até que ponto uma classe, atributo ou método pode ser usado. A utilização de modificadores de acesso é fundamental para o uso efetivo na Orientação a Objetos. Algumas boas práticas e conceitos só são atingidos com o uso correto deles.
  + **Private:** só acontece dentro da classe. `private int i;` pode ser um contador interno, por exemplo;
  + **Protected:** acontece dentro da classe, dos mesmos pacotes e subclasses. `protected int a;` pode ser um contador que é utilizado pela classe e suas filhas, por exemplo;
  + **Public:** acontece em qualquer lugar. `public void doSomething();` pode ser uma função que é chamada em diversos métodos, por exemplo. Lembrando que método e função são coisas diferentes: um método precisa de uma classe para referenciar, e uma função não.





### [*Princípios S.O.L.I.D.*](https://mari-azevedo.medium.com/princ%C3%ADpios-s-o-l-i-d-o-que-s%C3%A3o-e-porque-projetos-devem-utiliz%C3%A1-los-bf496b82b299)















