#include<stdio.h>
#include<malloc.h>
int main()
{
  //Type your code here
  int n,i,*a,x,y,flag1=0,flag2=0;
  scanf("%d",&n);
  a=(int*)malloc(sizeof(int)*n);
  
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  scanf("%d %d",&x,&y);
  for(i=0;i<n;i++)
  {
    if(a[i]==x)
    {
      printf("%d\n",i);
      flag1++;
    }
    if(a[i]==y)
    {
      printf("%d\n",i);
      flag2++;
    }
  }
  if(flag1==0)
    printf("%d\n",-1);
   if(flag2==0)
    printf("%d\n",-1);
      
  return 0;
}