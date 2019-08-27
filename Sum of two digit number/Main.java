#include<stdio.h>
int main()
{
  int n,s;
  scanf("%d",&n);
  s=n/10;
  n=n%10;
  s=s+n;
  printf("%d",s);
  return 0;
}