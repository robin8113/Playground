#include <stdio.h>
int main() {
	int n,i;
  scanf("%d",&n);
  printf("1 \n");
  for(i=2;i<=n;i++)
  {
    if(n%i==0)
    {
      printf("%d \n",i);
    }
  }
	return 0;
}