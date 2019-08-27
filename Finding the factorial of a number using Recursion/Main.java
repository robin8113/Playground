#include<stdio.h>
int fact(int n)
{
  if (n >= 1)
        return n*fact(n-1);
    else
        return 1;
}
int main()
{
	int n,c;
  scanf("%d",&n);
  c=fact(n);
  printf("%d",c);
	return 0;
}