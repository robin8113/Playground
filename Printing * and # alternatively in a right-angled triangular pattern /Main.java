#include <stdio.h>
int main(){
	int n,flag=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
    {
      if(flag==1)
      {
      printf("*");
        flag=0;
      }
      else if(flag==0)
      {
      printf("#");
        flag=1;
      }
    }
    printf("\n");
  }
  	return 0;
}