#include<time.h>
#include <locale.h>
#include<iostream>
#include<string>
#include<stdio.h>
#include<stdlib.h>
using namespace std;

void menu();
void solo();
void clean()
{system("CLS");}

int main()
{

srand((unsigned)time(NULL));
menu();

return 0;
}


void solo(){
 string palavra[3]={"Queijo","Manga","Suco"};
 int rand_i=rand()%3;
  cout<<palavra[rand_i];
}


void menu(){
//Declaring variables
    int opt=0;
    bool volts;
    string palavra2;
setlocale(LC_ALL,"");

//Looping until correct answer

while(opt<1||opt>4){
        clean();
     cout<<"Bem-vindo ao Jogo da Forca!\n";
     cout<<" 1- Jogar Sozinho\n";
     cout<<" 2- Jogar com Amigo\n";
     cout<<" 3- Créditos\n";
     cout<<" 4- Sair\n";
     cout<<"Digite o número da opção e aperte 'ENTER'.\n";
        cin>>opt;
        clean();
switch(opt){

case(1):

solo();

break;

case(2):
clean();
    cout<<"Então vamos lá! Bem-vindo ao Jogo da Forca!\n";
     cout<<"Digite a palavra que seu rival irá adivinhar: ";
        cin>>palavra2;
clean();
     cout<<"\nAdivinhe a palavra que seu amigo digitou!\n";

break;

case(3):
clean();
     cout<<"\nInformações do jogo:\nFeito por: Luís Felipe Belasco Silva.\n Programado em C++.\n";
break;

case(4):
clean();
      cout<<"Tem certeza que deseja sair?\n1+'ENTER' para sair\n0+'ENTER' para voltar ao menu principal.\n";
         cin>>volts;
if(volts=true){
     (menu());
}
else{cout<<"\nBença, fi.\n";}
break;
}
}
}
