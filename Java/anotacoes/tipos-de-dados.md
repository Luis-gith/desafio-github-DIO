## Tipos Primitivos

| Tipo    | Tamanho | Descrição                                                    | Syntax                                   |
| ------- | ------- | ------------------------------------------------------------ | ---------------------------------------- |
| byte    | 1 byte  | Armazena números inteiros de -128 a 127                      | byte number = 1;                         |
| short   | 2 bytes | Armazena números inteiros de -32,768 a 32,767                | short number = 1;                        |
| int     | 4 bytes | Armazena números inteiros de -2,147,483,648 a 2,147,483,647  | int number = 1;                          |
| long    | 8 bytes | Armazena números inteiros de -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807 | long number = 100000000000000**L**       |
| float   | 4 bytes | Armazena números fracionários com até 6-7 casas decimais     | float number = 10.68**f**;               |
| double  | 8 bytes | Armazena números fracionários com até 15 casas decimais      | double number = 869.7850901**d**;        |
| boolean | 1 byte  | Armazena valores true ou false                               | boolean sheThiccc = true;                |
| char    | 2 bytes | Armazena um único cacactere/letra ou valor [ASCII](https://www.asciitable.com/) | char nota = 'A' ou char nota = '\u0065'; |

+ Para registrar valores em notaçao científica podemos usar a notação numero + e + expoente de 10.
  + `float pow = 5e9f`

### Tipos mais comuns de Variável

+ **String:** armazena dados textuais. Os valores de uma string devem ter aspas duplas e, para tipas, usamos letra maiúscula. OBS: Strings, na verdade, são não-primitivas. Leia sobre em [link1](https://www.edureka.co/blog/data-types-in-java/#:~:text=Strings%3A%C2%A0String%C2%A0is%20a%20sequence%20of%20characters.%20But%20in%20Java%2C%20a%C2%A0string%20is%20an%20object%20that%20represents%20a%20sequence%20of%20characters.%20The%C2%A0java.lang.String%20class%20is%20used%20to%20create%20a%20string%20object.%20If%20you%20wish%20to%20know%20more%20about%20Java%20Strings%2C%20you%20can%20refer%20to%20this%20article%20on%20Strings%20in%20Java.) e [link2](https://www.w3schools.com/java/java_data_types_non-prim.asp);
  + `String car = "Aston Martin"`;
+ **int:** armazena números inteiros, sem utilizar casas decimais;
+ **float:** armazena números com casas decimais;
+ **char:** armazena letras individuais e devem ter aspas simples
  + `char firstLetter = 'a'`;
+ **boolean:** armazena valores true e false;



## Tipos Não-Primitivos

+ **Strings:** em Java, uma string não é so uma sequência de caracteres, mas sim um objeto que representa essa sequência. Armazena "palavras";
+ **Classes:** uma classe em Java é o diagrama que inclui todos os dados. Uma classe contem variáveis e métodos para descrever o comportamento de um objeto;
+ **Arrays:** em Java, um array é uma estrutura de dados homogênea implementada como um objeto. Arrays podem armazenar mais de um valor de um tipo de dado específico e disponibilizar acesso indexado para armazenaro mesmo. Um elemento x pode ser acessado dentro do array de acordo com o número de seu index.
+ [**Interfaces**](https://www.devmedia.com.br/entendendo-interfaces-em-java/25502)

