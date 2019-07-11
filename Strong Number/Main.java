#include <stdio.h>
int main() {
	//Type your code
  int n,n1,i,a1,s,a=0;
  scanf("%d",&n);
  n1=n;
  while(n>0)
  {
  a1=n%10;
    s=1;
    for(i=a1;i>=1;i--)
    {
    s=s*i;
    }
    a=a+s;
    n=n/10;
  }
  if(a==n1)
  {
  printf("Yes");
  }
  else{
  printf("No");
  }
	return 0;
}