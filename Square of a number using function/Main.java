#include<stdio.h>
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
  int sod=square(n);
  printf("%d",sod);
} 
  int square(int num)
  {
    int product=num*num;
    return product;
  }
  