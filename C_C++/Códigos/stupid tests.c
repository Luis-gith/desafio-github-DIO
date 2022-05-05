#include<stdio.h>
int main(void)
{
int i;
for(i=1;i<10;i++)
{
if(i==5)
    continue;
if(i==9)
break;
printf("%d",i);
}
}
//The "continue" statement implies that everything after it will be skipped
