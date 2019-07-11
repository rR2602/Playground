#include<stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int sod=sum_of_number(n);
  printf("%d",sod); 
}
  int sum_of_number(int m)
  {
    int i,sum=0;
    for(i=1;i<=m;i++)
    {
      sum=sum+i;
    }
  	return sum;
  }
