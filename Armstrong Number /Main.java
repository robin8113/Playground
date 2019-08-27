#include <stdio.h>
#include <math.h>
int main() 
{
  int n,count=0,s=0,s1=0,sum=0;
  scanf("%d",&n);
  s1=n;
  while(n>0)
  {
    s=n%10;
    count++;
    n=n/10;
  }
  n=s1;
  for(int i=1;i<=count;i++)
  {
    s=n%10;
    
    sum=sum + pow(s,count);
    
     n=n/10;
  }
  if(s1==sum)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
  return 0;
}