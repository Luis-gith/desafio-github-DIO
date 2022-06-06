### Condicionais If/Else: compara valores(==)

+ A primeira declaração vem dentro do bloco if, entre chaves, sendo essa acionada caso a condição seja verdadeira. A segunda declaração vem dentro do bloco else, entre chaves, sendo essa acionada caso a condição seja falsa.

  + É possível utilizar "else if" para adicionar uma nova verificação, sendo a ordem: if, else if, else. **ATENÇÃO** : Em JavaScript, "else if" é **SEPARADO**, diferentemente de outras linguagens.

  

### Switch/Case: compara tipos e valores (===)

Essa verificação é útil quando precisamos comparar muitas condições, e **SEMPRE** acompanha um valor DEFAULT.

![switch-ex](C:\Users\Lipe\Downloads\switch-ex.JPG)



### For: loop dentro de elementos iteráveis

#### For simples:

+ `for (statement 1; statement2; statement 3) {code}` 

  + 1 é executado uma vez, antes de passar pelo bloco de código; 2 define a condição para executar o bloco de código; 3 é executado todas as vezes que o bloco de código passa.

  + Normalmente, **statement 1** sempre será utilizado para inicializar a variável que utilizaremos para definir as repetições. Contudo, isso não é obrigatório, e nem sempre será o caso; Podemos iniciar múltiplos valores em 1, apenas separando-os com vírgulas.
  + Em **statement 2**, colocamos a condição a ser cumprida pela variável inicial para iniciar o bloco `for`. De certa forma, também e opcional, massssssssss, a falta de um limitador pode causar um crash no navegador, já que o processo nunca acaba. Por esse motivo, SEMPRE que omitirmos S2, é necessário definir um break dentro do loop.
  + Em **statement 3**, geralmente, colocamos a operação a ser realizada na variável inicial. Assim como S1 e S2, é opcional e pode ser omitida nos casos em que a operação é executada dentro do bloco de código.





 