#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main() 
{
  int n;
  scanf("%d",&n);
  int *arr=(int*)malloc(n*sizeof(int));
  int top=-1,e;
  char s[100];
  while(n--)
  {
    scanf("%s",s);
    if(strcmp(s,"push")==0)
    {
      scanf("%d",&e);
      arr[++top]=e;
    }
    else if(strcmp(s,"pop")==0)
    {
      if(top!=-1)
      {
        printf("%d\n",arr[top]);
        top--;
      }
    }
    else
    {
      for(int i=0;i<=top;i++)
        printf("%d ",arr[i]);
      printf("\n");
    }
  }
  return 0;
}