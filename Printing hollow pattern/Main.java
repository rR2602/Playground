#include <stdio.h>
int main() {
	// Type your code here
  int i,j,n;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
      if(i>=2&&i<=n-1)
      {
        if(j>=2&&j<=n-1)
        {
          printf(" ");
        }
        else
        {
          printf("*");
        }
      }
      else
      {
        printf("*");
      }
    }
    printf("\n");
  }
	return 0;
}