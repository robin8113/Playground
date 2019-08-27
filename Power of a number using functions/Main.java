#include<stdio.h>
#include<math.h>
int main(){
    int n,e;
  scanf("%d %d",&n,&e);
  fun(n,e);
    
return 0;
}
int fun(int a,int b)
{
 int s=0;
 s=s+pow(a,b);
 printf("%d",s);
 
  
}