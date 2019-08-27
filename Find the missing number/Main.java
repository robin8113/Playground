#include<stdio.h>
 int main()
 { 
  int a[10],i,j,n,m=1,s=0;
   scanf("%d",&n);
  for(i=0; i<n; i++)
  { 
   scanf("%d", &a[i]);
  }
  while(m<=n)
  {
   for(i=0; i<n; i++)
  {
     s=0;
   if(a[i]==m)
   {
     
     s=1;
     break;
   }
   }
      if(s==0)
   {
     printf("%d",m);
   }
   m++;
  
  }
   
  return 0;  
 }