```markdown
<div style="text-align: justify">
```



## Um pouco sobre let, var e const 



#### Declarando variáveis: 

Se escrita como:  `var a = 10;`, o valor da variável está definido globalmente. Por outro lado, ao escrevermos em um bloco: `if (condition) { let a= 21; }` , 'a' conservará o novo valor apenas enquanto acontecer a passagem pelo bloco e, portanto, se houver outra função separada desse condicional, tomará o valor de 'a' como 10. Em outra situação, onde 'a' é declarada uma vez no topo e depois no meio de uma função, se escrevermos `var a`, esse novo valor será utilizado durante e após a passagem pela função, mas não antes.  

**EXEMPLO:**

![escopos](C:\Users\Lipe\Downloads\escopos.JPG)

#### Declaração x atribuição:

Quando declaramos uma variável, utilizamos a palavra reservada e atribuímos, ou não, um valor para ela. Se, por ventura, for necessário modificar valores, redeclaramos (apenas var), da mesma maneira que faríamos normalmente. Já na atribuição, citamos apenas o nome da variável e igualamos à um valor; para reatribuir, mesmo processo.





#### Var x Let; sempre em camelCase 

Utilizamos let, normalmente, ao invés de var, por questões de segurança. Se precisamos trabalhar com `a+b` somente num momento, declare `let a=10;` e `let b=20;`. Caso seja necessário algo em escopo global, usaremos let, no topo e, lembrando, porque não custa, **camelCase** sempre, por favor.



#### Const; sempre em UPPER_CASE_SNAKE_CASE

Para declararmos constantes, QUE NÃO PODEM SER REATRIBUÍDAS NEM REDECLARADAS (se fosse pra mexer no trem, não chamasse de constante né mano), utilizamos `const MEU_NOME = "Luís Felipe";`.



### Resuminho 

![resumo-var-const-let](C:\Users\Lipe\Downloads\resumo-var-const-let.JPG)

+ Links úteis:

  + [Diferença var, let e const](https://www.freecodecamp.org/portuguese/news/var-let-e-const-qual-e-a-diferenca/#:~:text=Vari%C3%A1veis%20de%20var%20podem%20ser%20atualizadas%20e%20declaradas%20novamente%20dentro,ser%20atualizadas%20nem%20declaradas%20novamente.)

  + [O que é hoisting?](https://developer.mozilla.org/en-US/docs/Glossary/Hoisting)

  + [Vars são inseguras?](https://www.youtube.com/watch?v=FNh2JCiFXIg)

    









```
</div>
```