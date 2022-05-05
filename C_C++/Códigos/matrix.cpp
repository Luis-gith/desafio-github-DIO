#include<iostream>
#include<string>
using namespace std;
int main(void)
{
int matrix[2][3], i, j;
//Set the values
matrix[0][0]=1;
matrix[0][1]=2;
matrix[0][2]=3;
matrix[1][0]=4;
matrix[1][1]=5;
matrix[1][2]=6;

for(i=0; i<2 ;i++)
{
for(j=0; j<3; j++)
{
    cout<< matrix[i][j]*2<<" ";
}
    cout<<"\n";
}
}

