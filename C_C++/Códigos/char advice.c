#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

int main(void)
{
int a;
    printf("Insert a character: ");
scanf("%c",&a);
    printf(" %c is a great character.",a);
// If the code was: scanf("%c",&a);
//printf(" %c is a great character.",&a);
// or  scanf("%c",a);
//printf(" %c is a great character.",&a);
// or  scanf("%c",a);
//printf(" %c is a great character.",a);
// or
// scanf("%c",&a);
//printf(" %c is a great character.",a);
//it is going to build but fail.
// And if you forget space before % in the printf line, the char
// is going to bug, for a reason I still don't know.
}

