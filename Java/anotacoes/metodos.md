***[GUIA](https://www.devmedia.com.br/metodos/7348#:~:text=Um%20m%C3%A9todo%20em%20Java%20%C3%A9,definidos%20dentro%20de%20uma%20classe.)***

### Padrões de definição de um método

- Visibilidade: public, protected ou private;
- Tipo: concreto ou abstrato;
- Modificador: static ou final;
- Retorno: tipo de dado ou void;
- Nome: nome do método (sempre um verbo e camel-case);
- Parâmetros: parâmetros que o método rcebe. Se não tiver parâmetros, apenas ();
- Exceções: exceções(erros) a serem lançados;
- Código: código do método ou vazio;



### Sobrecarga de método

A sobrecarga é a capacidade de definir métodos para diferentes contextos enquanto preservamos seu nome. O mesmo método se comporta de diferentes maneiras dependendo do contexto, a partir de mudanças na lista de parâmetros(alterar a assinatura no método).



#### Sobrecarga X Sobrescrita

+ Ambas atuam sobre métodos, mas são um pouco diferentes:
  + Sobrescrever é criar um novo método na classe filha, contento a mesma assinatura e tipo de retorno daquele que foi sobrescrito.
  + Sobrecarregar é definir um método de mesmo nome de outro, mas que tenha uma assinatura diferente e, portanto, receba parâmetros/argumentos diferentes. Dessa maneira, podemos reutilizar um método enquanto mudamos o retorno de 'int' para 'string', por exemplo.

