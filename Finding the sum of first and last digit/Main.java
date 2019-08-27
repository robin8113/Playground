#include <stdio.h>
int main() {
	int n,n1,s;
  scanf("%d",&n);
  s=n%10;
  while(n>=10)
  {
    n=n/10;
  }
  n1=n%10;
  n1=n1+s;
  printf("%d",n1);
  return 0;
}