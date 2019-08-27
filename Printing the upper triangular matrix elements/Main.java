#include<stdio.h>
int main()
{

    int a[10][10],n,m,i,j,k;
    scanf("%d",&n);
    scanf("%d",&m);
    for(i = 0;i<n; i++){
      for(j=0;j<m;j++)  
        {
          scanf("%d",&a[i][j]);
        }
    }
      for(k=0;k<m;k++)
      {
        for(i=0,j=k;j<m;i++,j++)
        {
          printf("%d ",a[i][j]);
        }
      }
      return 0;
}