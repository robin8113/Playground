/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
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
            int s=0,s1=0;
          for(int i=0;i<n/2;i++)
          {
              s=s+a[i];
          }
          
          for(int i=n/2;i<n;i++)
          {
              s1=s1+a[i];
          }
          
          if(s==s1)
          {
              printf("Perfect Batch");
          }
          else
           printf("Not a Perfect Batch"); 
            
        
    return 0;
}