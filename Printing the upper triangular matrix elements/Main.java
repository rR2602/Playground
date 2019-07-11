#include<stdio.h>
int main()
{
  int n,m,a[100][100],i,j;
  scanf("%d %d",&n,&m);
  for(i=0;i<n;i++){for(j=0;j<m;j++){scanf("%d",&a[i][j]);}}
  for(i=0;i<n;i++){for(j=0;j<m;j++){if(i==j){printf("%d ",a[i][j]);}}}
  for(i=0;i<n;i++){for(j=0;j<m;j++){if(i+1==j){printf("%d ",a[i][j]);}}}
  for(i=0;i<n;i++){for(j=0;j<m;j++){if(i+2==j){printf("%d ",a[i][j]);}}}
	//Try out your code here
	return 0;
}