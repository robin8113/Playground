#include<stdio.h>
int main()
{
  int a[15],n,k,i,j,c1=0;
  scanf("%d",&n);
  scanf("%d",&k);
  for(i=0;i<n;i++)
  scanf("%d",&a[i]);
  
 int c=1;
  while(c<=k)
  { 
    c1=0;
  for(i=0;i<n;i++)
    {
      if(a[i]==c)
      {
        c1++;
      }
    }
    printf("%d %d \n",c,c1);
    c++;
    }
     return 0;
}