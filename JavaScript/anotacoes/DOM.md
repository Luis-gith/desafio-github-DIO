# Manipulando o D.O.M.

## DOM x BOM

![](https://miro.medium.com/max/708/1*K-CM7OV1lQnnACBeIcagSw.png)



O D.O.M. (Document Object Model) HTML é um padrão de como acessar os elementos HTML de uma página. Já o B.O.M. (Browser Object Model) é uma convenção específica dos navegadores e relação aos objetos mostrados na página web, como histórico, tamanho e tipo de tela e localização.





### Métodos no DOM

#### Adicionar e Deletar

| Método                          | Descrição                  |
| ------------------------------- | -------------------------- |
| document.createElement(element) | Cria um novo elemento HTML |
| document.removeChild(element)   | Remove um elemento         |
| document.appendChild(element)   | Adiciona um elemento       |
| document.replaceChild(new, old) | Substitui um elmeento      |



## Trabalhando com estilos

### Classes

- Claudio.classList.add("homem"): adiciona uma classe ao elemento;
- Claudio.classList.remove("pessoa"): remove uma classe do elemento;
- Claudio.classList.toggle("setor1"): remove uma classe se o objeto já fizer parte dela, ou adiciona se não for parte ainda. 



### Acessando CSS diretamente

document.getElementsByTagName("h1").style.color = "pink";



## Eventos

Ações feitas pelo usuário numa página

+ Mouse
  + mouseover/mouseout
+ Clique
  + click/dbclick
+ Atualização
  + change/load



### Acionando eventos

No JavaScript: .addEventListener("click", funcao2);

No HTML:  `<h1 onclick="changeText(this)">Lorem ipsum</h1>` `<script> function changeText(id) { id.innerHTML = "changed";} </script>` obs: no HTML, é apenas necessário colocar 'on' antes do nome do evento.



