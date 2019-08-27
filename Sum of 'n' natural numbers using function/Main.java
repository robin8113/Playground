#include<stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  sum(n);
   return 0;
}
int sum(int n)
{
  int f=0;
  for(int i=1;i<=n;i++)
  {
    f=f+i;
  }
  printf("%d",f);
}