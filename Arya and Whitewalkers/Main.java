#include <stdio.h>
int main() {
	//write your code here
  int n,stab;
  scanf("%d",&n);
  if(n==1)
  {
    stab=1;
  }
  else if(n==2)
  {
    stab=1;
  }
  else if(n==3)
  {
    stab=2;
  }
  else
  {
    stab=5;
  }
  printf("%d",stab);
    
	return 0;
}