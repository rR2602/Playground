#include<stdio.h>
#include<malloc.h>
void rightRotate(int *arr,int n,int k)
{
  int i,temp;
  while(k--)
  {
    temp=arr[n-1];
    for(i=n-1;i>0;i--)
      arr[i]=arr[i-1];
    arr[i]=temp;
  }
}
void leftRotate(int *arr,int n,int k)
{
  int i,temp;
  while(k--)
  {
    temp=arr[0];
    for(i=0;i<n-1;i++)
      arr[i]=arr[i+1];
    arr[i]=temp;
  }
}

int main()
{
  int n,num,i,j,odd=0,even=0,*arrOdd,*arrEven,input;
  scanf("%d",&n);
  arrOdd=(int*)malloc(sizeof(int)*n);
  arrEven=(int*)malloc(sizeof(int)*n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&input);
    if(i%2!=0)
      arrEven[even++]=input;
    else
      arrOdd[odd++]=input;
  }
  scanf("%d",&num);
  rightRotate(arrOdd,odd,num);
  leftRotate(arrEven,even,num);
  for(i=0,j=0;i<odd || j<even;i++,j++)
  {
    if(i<odd)
      printf("%d ",arrOdd[i]);
    if(j<even)
      printf("%d ",arrEven[j]);
  }
  return 0;
}