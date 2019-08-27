#include <stdio.h>
int main() {
	int n,c=0;
  scanf("%d",&n);
  c=n;
	for(int i=1;i<=n;i++)
  {
      
    for(int m=1;m<=(n-i);m++)
    {
      printf("");
    }
     
    for(int j=c;j>=1;j--)
    {
     printf("%d",j);
      
      
    }
      c=c-1;
     printf("\n");
      
  }
  return 0;
}