#include <stdio.h>
int main() {
int sum=0, num,i;
  scanf("%d",&num);
  
  for(i=1;i<=num;i++)
  {
    sum=sum+i;
  }
  printf("%d",sum);
  
	return 0;
}