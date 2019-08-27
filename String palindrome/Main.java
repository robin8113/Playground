#include<stdio.h>
#include<string.h>
int main()
{
  char s[10],b[10],n,flag=0;
  scanf("%s",s);
  n=strlen(s);
 int f=0,l=n-1;
  while(f<l)
  {
    if(s[f]==s[l])
    {
      flag=1;
      break;
   }
    f++;l--;
  }
  if(flag==1)
  {
printf("%s is a palindrome",s);
  }
  else
{
printf("%s is not a palindrome",s);
  }
  return 0;
}