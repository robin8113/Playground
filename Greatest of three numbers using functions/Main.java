#include <stdio.h>
int main(){
	int a, b,c;
   scanf("%d %d %d",&a,&b,&c);
  great(a,b,c);
  	return 0;
}
int great(int a,int b,int c)
{
  if((a>b)&&(a>c))
  {
    printf("%d",a);
  }
  else if((b>a)&&(b>c))
  {
    printf("%d",b);
  }
  else
  {
    printf("%d",c);
  }
}