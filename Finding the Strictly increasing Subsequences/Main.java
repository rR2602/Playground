#include<stdio.h>
int main()
{
   int n,a[100],i,j,k=0;
  scanf("%d",&n);
  for(i=0;i<n;i++){scanf("%d",&a[i]);}
  for(i=0;i<n;i++){
    k=0;
    for(j=i+1;j<n;j++){
  if(a[i]<a[j]){
    if(k<a[j]){
   printf("%d,%d\n",a[i],a[j]);}
  k=a[j];}}
  }
	//Try out your code here
	return 0;
}