#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int arr[n];
  for(int i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int i=0;
  int c1=0;
  int c2=0;
  while(i<n)
  {
    if(arr[i]==1)
    {
      c2++;
    }
    else
    {
      if(c1<c2)
        c1=c2;
      c2=0;
    }
    i++;
  }
  printf("%d",c1);
      
      
  
  return 0;
}