#include<stdlib.h>
#include<stdio.h>
#include<locale.h>

void main()
{
    {
    setlocale(LC_ALL,"");
    int x;

    printf("O valor de x �\n");
    scanf("%d",&x);
    printf("x = %d",x);
    }
    fflush(stdin);
    char j;
    printf("\nVamos mudar o tipo de valor de x.\nAgora diremos que x � outra letra.\nDigite qual letra x armazena: ");
    scanf("%c",&j);
    printf("x = %c",j);

}





//Exerc�cio 1: M�dia Aritim�tica
float nota1;
float nota2;
printf("Qual foi a sua nota na primeira prova?\n");
scanf("%f", nota1);
printf("E qual foi a nota na segunda?\n");
scanf("%f", nota2);
