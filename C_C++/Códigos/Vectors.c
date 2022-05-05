#include<stdio.h>
#include<stdlib.h>

int main()
{
int size;
printf("Size of vector:\n");
scanf("%d", &size);

float k[size], sum;

int i;
for(i=0; i<size; i++)
{
printf("Insert a value:\n");
scanf("%f", &k[i]);
sum=sum+k[i];
}
printf("Average: %.2f.\n",sum/size);
}
