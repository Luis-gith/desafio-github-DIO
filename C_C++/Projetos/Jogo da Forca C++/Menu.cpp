#include <locale.h>
#include<iostream>
#include<string>
#include<stdio.h>
#include<stdlib.h>
using namespace std;

void menu();

void clean()
{system("CLS");}

int main(void)
{
    menu();
return 0;
}

void menu(){
//Declaring variables
    string palavra;
    int opt=0;
setlocale(LC_ALL,"");

//Looping until correct answer

while(opt<1||opt>3){
        clean();
     cout<<"Bem-vindo ao LipeGames2021\n";
     cout<<" 1- Jogar\n";
     cout<<" 2- Cr�ditos\n";
     cout<<" 3- Sair\n";
     cout<<"Escolha uma op��o e aperte 'ENTER'.\n";
        cin>>opt;
        clean();
switch(opt){

case(1): ;
clean();
     cout<<"Digite a palavra que seu rival ir� adivinhar:";
        cin>>palavra;
clean();
     cout<<"Ent�o vamos l�! Bem-vindo ao Jogo da Forca! Adivinhe a palavra que seu amigo digitou:";

break;

case(2): ;
clean();
     cout<<"\nInforma��es do jogo:\nFeito por: Lu�s Felipe Belasco Silva.\n22/01/2021\n Programado em C++\n";
break;

case(3): ;
clean();
bool volts;
      cout<<"Tem certeza que deseja sair?\n1+'ENTER' para sair\n0+'ENTER' para voltar ao menu principal.\n";
         cin>>volts;
if(volts=true){
     (menu());
}
else{cout<<"\nBen�a, fi.\n";}
break;
}
}
}
