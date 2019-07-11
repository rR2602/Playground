#include<stdio.h>
int main()
{
  int n,m ,a[100][100],i,j;
  scanf("%d %d",&n,&m);
  for(i=0;i<n;i++){for(j=0;j<m;j++){scanf("%d",&a[i][j]);}}
  for(i=0;i<m;i++){for(j=0;j<n;j++){printf("%d ",a[j][i]);}
                  printf("\n");}
  //Type your code here
  return 0;
}