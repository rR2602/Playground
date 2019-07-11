#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int maxSum=0;
  for(int i=0;i<n;)
  {
    int sum=arr[i],j;
    for(j=i;j<n-1;j++)
    {
      if(arr[j]<arr[j+1])
        sum+=arr[j+1];
      else
      {
        break;
      }
    }
    if(sum>maxSum)
      maxSum=sum;
    i+=(j+1);
  }
  printf("%d",maxSum);
      
  return 0;
}