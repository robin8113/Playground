#include<stdio.h>
int main()
{
	int a[10],n,i,j,temp;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
 for(i=0;i<n;i++)
 {
   for(j=1;j<n;j++)
   {
   if(a[i]<a[j])
   {
     printf("%d,%d \n",a[i],a[j]);
   }
    
   
   }
 }
  return 0;
}