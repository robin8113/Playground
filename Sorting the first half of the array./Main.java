#include<stdio.h>
int main()
{
	int a[10],n,i,j,temp;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n/2;i++)
  {
    for(j=0;j<n/2-1;j++)
    {
      
    if(a[j]>a[j+1])
    {
      temp=a[j];
      a[j]=a[j+1];
      a[j+1]=temp;
    }
    }
  }
  for(j=0;j<n;j++)
  {
    printf("%d ",a[j]);
  }
	return 0;
}