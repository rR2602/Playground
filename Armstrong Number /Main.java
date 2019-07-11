#include <stdio.h>
#include<math.h>
int main() {
	//Type your code
  int n,i,a,m,s=0,c=0,t,b;
  scanf("%d",&n);
  m=n;
  t=n;
  while(n!=0)
  {
    a=n%10;
    c++;
    n=n/10;
  }
  while(m!=0)
  {
    b=m%10;
    s=s+pow(b,c);
    m=m/10;
  }
  if(s==t)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
  
	return 0;
}