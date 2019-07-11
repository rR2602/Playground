#include<stdio.h>
int main()
{
  int n,k,a[100];
  scanf("%d",&n);
  scanf("%d",&k);
  int count[k+1];
  for (int i=1;i<=k;i++)
    count[i]=0;
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
    count[a[i]]++;
    
  }
  for(int i=1;i<=k;i++){
    printf("%d %d\n",i,count[i]);
  }
    

  return 0;
}