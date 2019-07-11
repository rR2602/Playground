#include <stdio.h>
int main() {
	// Type your code here
  int i,j,x=1,y=1,n;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    if(i%2==1)
    {
      for(j=1;j<=n-1;j++)
      {
        printf("%d",x);
      }
      printf("%d",x+1);
    }
    else
    {
      printf("%d",y+2);
      for(j=2;j<=n;j++)
      {
        printf("%d",y+1);
      }
      y=y+2;
    }
  
  printf("\n");
  x=x+1;
  }	return 0;
}