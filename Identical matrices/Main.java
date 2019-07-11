#include<stdio.h>
int main()
{int n,m,a[100][100],b[100][100],i,j,k=0,u;
  scanf("%d %d",&n,&m);
  for(i=0;i<n;i++){for(j=0;j<m;j++){scanf("%d",&a[i][j]);}}
 for(i=0;i<n;i++){for(j=0;j<m;j++){scanf("%d",&b[i][j]);}}
 for(i=0;i<n;i++){for(j=0;j<m;j++){
 u=a[i][j]-b[i][j];
 if(u!=0){k=1;}}}
 if(k==1){printf("No");
        }else{printf("Yes");}
	//Try out your nocode here
	return 0;
}