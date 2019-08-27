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
     
    for(int m=1;m<=2*i-1;m++)
    {
     printf("*");
      }
     
   
    printf("\n");
  }
  return 0;
}