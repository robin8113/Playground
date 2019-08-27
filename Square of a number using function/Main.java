#include<stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  square(n);
   return 0;
}
int square(int n)
{
  int f=1;
  n=n*n;
  printf("%d",n);
}