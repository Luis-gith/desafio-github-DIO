### Módulos

São arquivos JS que importam e exportam informações de outros arquivos '.js'.

##### Vantagens de uso: 

+ Organização;
+ Compartilhamento de variáveis em escopos diferentes;
+ Explicitação de dependência de cada arquivo.



### Exports

##### Named Export: 

Utilizado para exportar mais de um função 

+ Pode exportar múltiplos valores
+ Deve utilizar o nome exportado ao importar

##### Default Export

Utilizado para exportar um único valor 

+ Pode exportar apenas um valor

+ Pode utilizar qualquer nome ao importar, o que pode gerar inconsistência e conflitos durante uma possível manutenção/edição

+ É permitido apenas um por módulo


[Link útil 01](https://medium.com/@etherealm/named-export-vs-default-export-in-es6-affb483a0910)

[Link útil 02](https://medium.com/@timoxley/named-exports-as-the-default-export-api-670b1b554f65)





### Imports

##### Named Import:

`import {funcao, variavel, classe} from './arquivo.js'`

##### Default Import:

`import valorDefault from './arquivo.js' `



**Dica:** dê um apelido para funções importadas, evitando conflitos

`import {arquivo as Apelido} from './arquivo.js'; Apelido.metodo();`



**Importar tudo de um arquivo**:

`import * as Apelido from './arquivo.js'; Apelido.metodoA(); console.log(Apelido.variable); `



**Vinculando ao HTML:**

`<script type = "module" src= "./main.js"></script>`

- Lembrando que: se o site estiver hospedado, é possível testar tranquilamente. Porém, caso esteja testando em nível local, é necessário rodar um servidor.



#### Dicas importantes: 

+ Um módulo está sempre em ["strict mode"](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Strict_mode);
+ Podemos utilizar as extensões .js, .cjs e .mjs, sendo a última encorajada, uma vez que deixa claro o propósito do arquivo: ser um módulo EcmaScript para uso em Node.js. *Essa explicação não é a melhor possível e encorajo a leitura de alguns materiais sobre o [assunto](https://blog.logrocket.com/commonjs-vs-es-modules-node-js/);*
+ Para testar localmente, use um servidor;
+ Ao importar, **NÃO ESQUEÇA** da extensão(.js, .cjs, .mjs);
+ Ao importar, **NÃO ESQUEÇA** de usar "./" como indicador do ponto de partida. `./fileFile.mjs` .

![](https://samanthaming.gumlet.io/tidbits/79-module-cheatsheet.jpg.gz?format=auto)





#### CheatSheets

+ https://www.samanthaming.com/tidbits/79-module-cheatsheet/
+ https://medium.com/@serbanmihai/javascript-es6-cheatsheet-modules-b6b3eeed2800
+ https://gist.github.com/brianneisler/d008f8b9df344acc4aae47f9db049023





