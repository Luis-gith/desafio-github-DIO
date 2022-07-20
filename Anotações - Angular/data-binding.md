Data Binding é um conceito chave de Angular que permite a comunicação entre um componente e o D.O.M., tornando mais fácil a definição de de aplicações interativas e diminuindo as manipulações de dados necessárias.



### Tipos de Data Binding

#### Do componente para o template

+ Interpolação: `{{ valor }}`. Essa notação adiciona o valor de uma propriedade do componente. `Name: {{ user.name }}` mostrará no D.O.M. o valor 'name' armazenado em 'user', localizado no componente.
+ Property Binding: `[propriedade] = "valor"`. Essa notação passa o valor localizado no componente para a propriedade especificada. Pode ser, por exemplo, a cor de um fundo: `<div [style.background-color]="pinkishRedBackground">`. 'pinkishRedBackground' está no componente, mas é associado à propriedade de estilo do CSS, que foi chamada no HTML.

#### Do template para o componente

+ Event Binding:  `(evento) = "função".` Quando um evento específico do D.O.M. acontece, essa notação chama a função passada, que está no componente. Em suma, um (click) , por exemplo, pode ativar a função 'somar', definida no componente, como responsável pela soma de números apresentados pelo usuário n caixa de input.



#### Two-way data binding: 

`[(ngModel)] = "valor"`. Utilizando esse mecanismo, é possível acontecer data-flow entre o D.O.M. e os componentes ao mesmo tempo. Podemos utilizar, por exemplo, para receber um input e alterar um dado pré-estabelecido no componente. Ao obter o input do usuário, o D.O.M. envia ao componente um valor para 'name', que já tinha mandado um valor default a ser exibido. Após a obtenção do valor, 'name' passa a ser igual ao que recebeu do usuário e, em todas as instâncias da aparição dessa propriedade também apresentará esse valor. 

`<input type="name" [(ngModel)]="user.name">`



Para mais informações sobre outros tipos de data binding: [***documentação***](https://angular.io/guide/binding-syntax).
