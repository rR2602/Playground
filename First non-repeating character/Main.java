#include<stdio.h>
#include<string.h>
int main()
{
  int arr[27]={};
  char s[100];
  gets(s);
  int n=strlen(s);
  for(int i=0;i<n;i++)
  {
    int offset=s[i]-'a'+1;
    arr[offset]++;
  }
  int i;
  for(i=0;i<n;i++)
  {
    int offset=s[i]-'a'+1;
    if(arr[offset]==1)
    {
      printf("%c",s[i]);
      break;
    }
  }
  if(i==n)
    printf("All the characters are repetitive");
  return 0;
}