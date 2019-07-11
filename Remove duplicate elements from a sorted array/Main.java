#include <stdio.h>
int main() 
{
    //write your logic here
  int n,i,a[10],j;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(a[i]==a[j])
      {
        break;
      }
    }
  if(i==j)
  {
    printf("%d ",a[i]);
  }
  }
    
	return 0;
}