#include<stdio.h>
#include<stdlib.h>

float main(void)
{
char word[50];
   printf("Type a word: ");

fgets(word, 50, stdin);

   printf("%s",word);
}
/* You have to remember that a string of size x, can only store x-1 letters,
 because the last piece of storage is dedicated to "\0", which tells the machine
 to stop.*/

