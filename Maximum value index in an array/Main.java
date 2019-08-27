// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include<stdio.h>
int main()
{
      int n;
        scanf("%d",&n);
        int arr[10];
        
        for(int i = 0; i < n; i++)
        {
            scanf("%d",&arr[i]);
        }
        print(arr,n);
        
}        
        void print(int a[],int n)
        {
            int s,i;
            s=a[0];
          for( i=0;i<n-1;i++)
          {
              if(a[i]>s)
              s=a[i];
          }
          printf("%d",i);
            
        
    
}