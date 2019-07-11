#include<stdio.h>
#include<limits.h>
int main()
{
  int n,i,*a,max=INT_MIN;
  scanf("%d",&n);
  a=(int*)malloc(sizeof(int)*n);
  
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  for(i=0;i<n;i++)
  {
    if(a[i]>max)
      max=a[i];
  }
  printf("%d",max);
  return 0;
}