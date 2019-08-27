#include<stdio.h>
int main()
{
	int a[10],n,i,j,k,temp;
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
     int flag=0;
     for(k=i;k<j;k++)
     {
       if(a[k]<a[j])
       {
       flag=1;
       }
       else
       {
         flag=0;
       }
     }
   if(flag==1)
     printf("%d,%d \n",a[i],a[j]);
    
   }
   
   }
 }
  return 0;
}