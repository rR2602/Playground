#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int arr2[n];
  for(int i=0;i<n;i++)
    arr2[i]=-1;
  int k=0;
  for(int i=0;i<n;i++)
  {
    arr2[i]=arr[i];
    for(int j=i;j>0;j--)
    {
      if(arr2[j]<arr2[j-1])
      {
        int temp=arr2[j];
      	arr2[j]=arr2[j-1];
      	arr2[j-1]=temp;
      }
    }
  }
    for(int i=0;i<n;i++)
      printf("%d\n",arr2[i]);
    
  
  
  return 0;
}