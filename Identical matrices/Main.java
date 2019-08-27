#include<stdio.h>
#include<string.h>
int main(){
    int a[10][10],b[10][10],n,m,flag=0;
    scanf("%d",&n);
   scanf("%d",&m);
    for(int i = 0;i<n; i++){
      for(int j= 0;j<m;j++)  
        {
          scanf("%d",&a[i][j]);
        }
    }
 for(int i = 0;i<n; i++){
      for(int j= 0;j<m;j++)  
        {
          scanf("%d",&b[i][j]);
        }
    }
for(int i = 0;i<n; i++){
      for(int j= 0;j<m;j++)  
        {
          if(b[i][j]==a[i][j])
          {
            flag=1;
          }
        else
          flag=0;
    }
}
 if(flag==1)
 {
   printf("Yes");
 }
  else
    printf("No");
  
    
    return 0;
}