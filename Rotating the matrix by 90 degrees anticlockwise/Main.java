#include<stdio.h>
int main()
{ int n,m,a[100][100],i,j;
  scanf("%d %d",&n,&m);
  for(i=0;i<n;i++){for(j=0;j<m;j++){scanf("%d",&a[i][j]);}}
 for(i=n-1;i>=0;i--){for(j=0;j<m;j++){printf("%d ",a[j][i]);}
                   printf("\n");}
	//Try out your code here
	return 0;
}