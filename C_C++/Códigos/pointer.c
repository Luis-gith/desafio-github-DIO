#include<stdio.h>
#include<stdlib.h>

int main(void)
{
int a=2;

      printf("Variable 'a' equals: %d.\n",a);
      //Declaring pointer
int *pointer1;
pointer1=&a;
*pointer1=4;

      printf("\n'pointer1' has set 'a' to: %d.\n",a);
}
