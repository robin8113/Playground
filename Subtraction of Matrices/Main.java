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
  int b[n][m],c[n][m];
    for(int i = 0;i<n; i++){
      for(int j= 0;j<m;j++)  
        {
          scanf("%d",&b[i][j]);
        }
    }
  
  for(int i = 0;i<m; i++){
      for(int j= 0;j<n;j++)  
        {
          c[i][j]=a[i][j]-b[i][j];
        }
    }
for(int i = 0;i<m; i++){
      for(int j= 0;j<n;j++)  
        {
          printf("%d ",c[i][j]);
        }
    printf("\n");
    }
 
    
    return 0;
}