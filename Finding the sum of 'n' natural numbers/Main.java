#include <stdio.h>
int sum(int n);
int main()
{
  int num;
  scanf("%d",&num);
  printf("%d",sum(num));
}
int sum(int n)
{
  if(n==0)
  {
    return 0;
  }
  else
  {
    return n+sum(n-1);
  }
  
}