#include<stdio.h>
#include<string.h>
int main()
{
  char ch[10000];
  gets(ch);
  char str[10000];
  int arr[1000];
  int l=strlen(ch);
  int count=0;
  arr[count++]=0;
  for(int i=0;i<l;i++)
  {
    if(ch[i]==' ')
      arr[count++]=i;
  }
  arr[count]=l;
  for(int i=count-1;i>=0;i--)
  {
    int j;
    if(i==0)
      j=arr[i];
    else
      j=arr[i]+1;
    for(;j<arr[i+1];j++)
      printf("%c",ch[j]);
    printf(" ");
  }
  return 0;
}
    
