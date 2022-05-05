#include<time.h>
#include <locale.h>
#include<iostream>
#include<string>
#include<stdio.h>
#include<stdlib.h>
using namespace std;
void clean()
{system("CLS");}
int main(void)

{setlocale(LC_ALL,"");
srand((unsigned)time(NULL));
//Jogando Sozinho
void solo();
    cout<<"Então vamos lá! Bem-vindo ao Jogo da Forca!\n";
 string palavra[5]={"Pão","Queijo","Manga","Água","Suco"};
 int rand_i=rand()%5;
    cout<<"Tente adivinhar a palavra:\n";
  cin<<palavra;
  palavra[rand_i];

}

