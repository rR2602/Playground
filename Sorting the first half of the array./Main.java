#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int t=n/2;
  for(int i=0;i<t-1;i++)
  {
    for(int j=0;j<(t-1-i);j++)
    {
      if(arr[j]>arr[j+1])
      {
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
      }
    }
  }
  for(int i=0;i<n;i++)
    printf("%d ",arr[i]);
  
  return 0;
}