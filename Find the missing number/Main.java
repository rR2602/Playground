#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  int count[n+1];
  for(int i=0;i<=n;i++)
    count[i]=0;
  for(int i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
    if(arr[i]<=n)
      count[arr[i]]++;
  }
  for(int i=1;i<=n;i++)
  {
    if(count[i]==0)
    {
      printf("%d",i);
      break;
    }
  }
  
  return 0;
}