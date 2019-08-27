#include<stdio.h>
int main()
{
  int x=365,m;
  m=x/4;
  int y=x%4;
  printf("Quotient: %d \n",m);
  printf("Remainder: %d",y);
  return 0;
}