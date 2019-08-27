#include <stdio.h>
int sum(int n)
{
  if(n>=1)
  {
    return n+sum(n-1);
  }
  else
    return 0;
}

    
int main()
{
  int n ;
  scanf("%d",&n);
  int c=sum(n);
  printf("%d",c);

  return 0;
}