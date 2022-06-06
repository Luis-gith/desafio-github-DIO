### Tags básicas:

+  ``<html> conteúdo </html>\`` : cria um documento HTML
+ ``<head> conteúdo </head>`` : define o título e outras informações que não são visualizadas (meta dados, links de referência, etc)
+ ``<body> conteúdo </body>`` : define a porção visível do documento
+ ``<title> conteúdo </title>`` : define o nome do documento na barra de título da aba no navegador (vem dentro de head)





### Links:

+ ``<a href=URL>[link/archive-path here/clickable-text]</a>`` : cria um hyperlink para um URL
+ ``<a href="mailto:luisfelipebelasco@hotmail.com" target="_blank"> `` : cria um hyperlink para um email (target="_blank" faz abrir em outra aba)





### Texto: 

+ ``<h1> [conteúdo] </h1>`` : cria headlines (títulos) e vai, em ordem decrescente de tamanho, de h1 à h6

+ ``<b> [conteúdo] </b>`` : cria textos em negrito e não é a melhor opção. Sempre que possível, use ``<strong>`` e, melhor ainda, CSS.
+ ``<i> [conteúdo] </i>`` : mesma coisa de ``<b>``, só que em itálico.
+ ``<code> [conteúdo] </code>`` : normalmente utilizada como definidora de source code e é monoespaçada.
+ ``<cite> [conteúdo] </cite>`` : cria uma citação, normalmente transformando-a em itálico
+ ``<strong> [conteúdo] </strong>`` : já explicado em ``<b>``
+ ``<font-size> <font color> e <font-face>``: assim como ``<b>``, há uma versão em CSS. Definem, respectivamente, tamanho, cor e fonte para o texto.  



### Formatação: 

+ ``<p>[conteúdo]</p>`` : cria um parágrafo
+ ``<br>`` : insere uma quebra e linha
+ ``<blockquote> [conteúdo] </blockquote>`` : coloca o conteúdos dentro de aspas - identa o texto de ambos os lados
+ ``<div>[conteúdo]</div>`` : usada para formatar blocos de conteúdo com CSS. 
  + ex: ``<div class="group"> [<p>Lorem ipsum</p>] </div>`` //// no CSS : ``.group { font-size: []; }``
+ ``<span> [conteúdo] </span>`` : usada para formatar conteúdo dentro da linha no CSS
  + span vs div: os spans são mais adequados para formatar pequenos trechos, enquanto as divs abrigam blocos de código com vários conteúdos diferentes em seus interiores.





### Listas: 

+ `` <ul> [itens] </ul>`` : cria uma lista não ordenada

+ `` <li> [conteúdo] </li>`` : abriga um item da lista

  + ``<ul> <li></li> </ul>``

+ ``<ol start = ?> </ol>`` : cria uma lista ordenada (start=xx onde x é um número de contagem)

  + <ol start="50">
     <li>Coffee</li>
     <li>Tea</li>
     <li>Milk</li>
    </ol>





### Elementos Gráficos:

+ ``<img src="URL"/>`` : adiciona imagens a partir de um arquivo externo conectado à URL
  + É possível adicionar propriedades align, border, height e width, também, mas é recomendado o fazer no CSS.  ``<img src="URL" propriedade=?/>`` PELO AMOR DE DEUS, COLOCA ISSO NO CSS MANO PFV.
+ ``<img src="URL" alt="bread"/>`` : define texto alternativo para o caso da imagem não ser processada e também para leitores de tela. É um recurso necessário para estar e acordo com as normas do ADA (The Americans with Disabilities Act).











