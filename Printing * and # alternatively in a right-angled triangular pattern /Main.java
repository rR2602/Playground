#include <stdio.h>
int main()
{
  int n,i,j,num=0;
  char c[2];
  c[0]='*';
  c[1]='#';
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      printf("%c",c[num]);
      num=(num+1)%2;
    }
    printf("\n");
  }
  	return 0;
}