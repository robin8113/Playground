#include<stdio.h>
int main()
{
  int n,r,s;
  scanf("%d",&n);
  r=n/100;
  r=r%10;
  s=n%10;
  s=s+r;
  printf("%d",s);
  return 0;
}