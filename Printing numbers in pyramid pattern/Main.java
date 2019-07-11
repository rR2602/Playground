#include <stdio.h>
int main() {
	// Type your code here
  int i,n,j,k,t=1;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(k=1;k<=n-i;k++)
    {
      printf(" ");
    }
    for(j=1;j<=i;j++)
    {
      printf("%d ",t);
      t++;
    }
    printf("\n");
  }
	return 0;
}