#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main(void)
{
int program;
while(program>5||program<1)
    {
    printf("What's the number of the program you want to load, 1, 2, 3, 4 or 5?\n\n");
    scanf("%d", &program);
    switch(program)
{
    case(1): ;
    system("CLS");
float a, b ;
printf("\nInitializing program 1.\n\n");
     printf("Give me a negative value\n");
scanf("%f",&a);
     printf("Give me another negative value\n");
scanf("%f",&b);
     printf("The average is %.3f.\nAnd the absolute value of that is %.3f.\n\n",(a+b)/2,fabs(((a+b)/2)));
     break;
// Function abs= absolute value for integers. So this "fabs", is kind of the same thing, but for floats

case 2: ;

printf("\nInitializing program 2.\n\n");
int x, y, z, product;

     printf("You are going to insert three integer numbers of your choice.\n");
     printf("First number: ");
scanf("%d", &x);
     printf("Second number: ");
scanf("%d", &y);
     printf("Third number: ");
scanf("%d", &z);
product=x*y*z;
     printf("The product of those three numbers you have typed is: %d\n",product);
if(product%2==1)
{
     printf("This is an odd number.\n\n");
}
else
{
     printf("This is an even number.\n\n");
}
break;

case 3: ;

float sc1, sc2, sc3;
    printf("\nInitializing program\n\nFINAL RESULTS\n\n");

    printf("Tell me your scores on the three tests that happened last week:\n");

    printf("Score 1:");
scanf("%f",&sc1);
    printf("Score 2:");
scanf("%f",&sc2);
    printf("Score 3:");
scanf("%f",&sc3);

float avg=(sc1+sc2+sc3)/3;

if(avg<6.5)
{
    printf("Sorry, but you didn't make it. Your average score was just %.2f. Try again next week, and get an average score above 6.5 to pass\n",avg);
}
else if(avg>6.5 && avg<7.5)
{
    printf("Congratulations!You have passed with an average score of %.2f! Now, be aware, the next level is much harder, so you better study hard.",avg);
}
else
{
    printf("Wow! You passed with exceptional results. An average score of %.2f! Keep up with that good work next level.",avg);
}
break;

case 4: ;
float side1, side2, side3;
    printf("\nInitializing program\n\nTRIANGLE TYPES\n\n");
    printf("In this program, you can discover the type of your triangle. Please, insert the values of each side:\n");
    printf("Side 1: ");
    scanf("%f",&side1);
    printf("Side 2: ");
    scanf("%f",&side2);
    printf("Side 3: ");
    scanf("%f",&side3);
if(side1==side2&&side2==side3)
    {
        printf("Equilateral triangle\n");
    }
else if(side1==side2||side1==side3||side2==side3)
    {
        printf("Isosceles triangle\n");
    }
else
    {
        printf("Scalene triangle\n");
    }
break;

case 5: ;
int p, i, aux;
printf("\nInitializing program \n\nPRIME NUMBER\n\n");
printf("Here, you can check if a number is prime or not. Enter an integer:\n");
scanf("%d",&p);
for(i=1;i<=p;i++)
{
if(p%i==0)
{aux++;}
if(aux==2)
{
    printf("Prime.\n\n");
}
else
{
    printf("Not prime.\n\n");
}
break;

default:
    fflush(stdin); //essa linha que ta impedindo de loopar no erro ao inserir letras na resposta
    system("CLS");
    printf("Invalid option. Rerunning the program.\n");

break;
}
}
}
}
