#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int k;
  scanf("%d",&k);
  for(int i=0;i<n-1;i++)
  {
    int minE=arr[i];
    int j=i+1,index=i;
    for(;j<n;j++)
    {
      if(arr[j]<minE)
      {
        minE=arr[j];
        index=j;
      }
    }
    int temp=arr[i];
    arr[i]=arr[index];
    arr[index]=temp;
  }
   //for(int i=0;i<n;i++)
 //   printf("%d ",arr[i]);
 	printf("%d",arr[n-k]);

  return 0;
}