#include<stdio.h>
#include<string.h>
int main(){
    int a[10][10],n,m;
    scanf("%d",&n);
   scanf("%d",&m);
    for(int i = 0;i<n; i++){
      for(int j= 0;j<m;j++)  
        {
          scanf("%d",&a[i][j]);
        }
    }
 
for(int j=m-1;j>=0;j--) 
{
   for(int i = 0;i<n; i++)
        {
          printf("%d ",a[i][j]);
        }
    printf("\n");
    }
 
    
    return 0;
}