// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include <string.h>
 
int main()
{ 
 char str1[1000];
 gets(str1);
 int string1_len = strlen(str1);
 int stat[26];
  
 for (int idx = 0; idx <= 25; idx++)
 {
   stat[idx] = 0;
 }
  
 for (int idx = 0; idx <= string1_len; idx++)
 {
   if(str1[idx] >= 'a' && str1[idx] <= 'z')
   {
     int offset = str1[idx] - 'a';
     stat[offset]++;
   }
    
   else if(str1[idx] >= 'A' && str1[idx] <= 'Z')
   {
     int offset = str1[idx] - 'A';
     stat[offset]++;
   }
 }
  
  
  
 int is_same = 0;
  
 for (int idx = 0; idx <= 25; idx++)
 {
   int v=97;
   if(stat[idx] > 0)
   {
     v=v+idx;
     printf("%c",v);
     printf("%d ",stat[idx]); 
   } 
      
 }
 return 0;
}