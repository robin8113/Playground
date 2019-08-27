int gcd(int a, int b) 
{ 
    if (b == 0) 
        return a; 
    return gcd(b, a % b);  
} 
int main() 
{ 
    int a,b,c,d;
    scanf("%d %d",&a,&b,&c);
     d=gcd(a, b); 
  printf("%d",d);
return 0; 
} 