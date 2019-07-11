#include<stdio.h>
#include<malloc.h>
int main()
{
  int n,i,index=0,*arr,input,count=0;
  scanf("%d",&n);
  arr=(int*)malloc(sizeof(int)*n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&input);
    if(input==0)
      count++;
    else
      arr[index++]=input;
  }
  for(i=n-count;i<n;i++)
    arr[i]=0;
  for(i=0;i<n;i++)
    printf("%d ",arr[i]);

 
  return 0;
}