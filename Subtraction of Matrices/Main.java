#include<stdio.h>
int main()
{int n,m ,a[100][100],i,j,b[100][100],c[100][100];
  scanf("%d %d",&n,&m);
  for(i=0;i<n;i++){for(j=0;j<m;j++){scanf("%d",&a[i][j]);}}
  for(i=0;i<n;i++){for(j=0;j<m;j++){scanf("%d",&b[i][j]);}}
  for(i=0;i<n;i++){for(j=0;j<m;j++){c[i][j]=a[i][j]-b[i][j];}}
 for(i=0;i<n;i++){for(j=0;j<m;j++){printf("%d ",c[i][j]);}
                 printf("\n");}
 
	//Try out your code here
	return 0;
}