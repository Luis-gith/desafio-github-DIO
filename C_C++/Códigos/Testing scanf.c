#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int a;
    float b;
    char c;
    printf("What's the value of a?\n");
    scanf("%d",&a);
    printf("And what's the value of b?\n");
    scanf("%f",&b);
    printf("So the product of a and b is %.2f\n", a*b);
    // If I was to get a char, I'd have to clean the buffer by now,
    // because it's not going to recognize it after being occupied by an int, for example.
    // printf("");-----fflush(stdin);-----scanf("");
printf("Let's put that result inside of a character, so we can make some algebra problems\n");
printf("What's the char you want?\n");
fflush(stdin);
scanf("%c",&c);
printf("So 4.35%c=3.8ab ",c);
// When trying to use %c, if you put &variable after the comma,
// it doesn't recognize it, so you have to put just the variable
}
