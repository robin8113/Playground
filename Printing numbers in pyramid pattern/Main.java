#include <stdio.h>
int main() {
	int n,c=1;
  scanf("%d",&n);
 for(int i=1;i<=n;i++)
  {
      
    for(int m=1;m<=(n-i);m++)
    {
      printf(" ");
    }
     
    for(int j=1;j<=i;j++)
    {
     printf("%d ",c);
      c=c+1;
      
    }
      
     printf("\n");
      
  }
  return 0;
}