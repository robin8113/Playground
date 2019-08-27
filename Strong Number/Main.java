#include <stdio.h>
int main() {
	int n,temp,s=0,sum;
  scanf("%d",&n);
  temp=n;
  while(n>0)
  {
   
    s= n % 10;
    int f=1;
    for(int i=1;i<=s;i++)
    {
     f=f*i;
    }
    sum=sum+f;
    n=n/10;
  }
  if(temp==sum)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
    
	return 0;
}