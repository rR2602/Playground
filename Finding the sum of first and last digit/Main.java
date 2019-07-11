#include <stdio.h>
int main() {
	int num,f,l;
  scanf("%d",&num);
  l=num%10;
  while(num>0)
  {
     f=num%10;
    num/=10;
  }
  printf("%d",(l+f));
	return 0;
}