#include<stdlib.h>
#include<stdio.h>
#include<string.h>

int main()
{
  int n;
  scanf("%d",&n);
  int *arr=(int*)malloc(n*sizeof(int));
  char s[100];
  int front=-1,back=-1,e;
  while(n--)
  {
    scanf("%s",s);
    if(strcmp(s,"enqueue")==0)
    {
      if(front==-1 && back==-1)
      	front++;
      scanf("%d",&e);
      arr[++back]=e;
      
    }
    else if(strcmp(s,"dequeue")==0)
    {
      printf("%d\n",arr[front]);
      front++;
    }
    else
    {
      for(int i=front;i<=back;i++)
        printf("%d ",arr[i]);
      printf("\n");
    }
  }
  free(arr);
  return 0;
}