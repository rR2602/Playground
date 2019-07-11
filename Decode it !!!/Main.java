#include<stdio.h>
#include<string.h>
int main()
{
  char str[1000];
  gets(str);
  int key;
  scanf("%d",&key);
  int n=strlen(str);
  for(int i=0;i<n;i++)
  {
    if(str[i]>=65 && str[i]<=90)
    {
      int offset=str[i]-'A';
      offset=(offset-key)%26;
      if(offset<0)
        offset=(offset+26)%26;
      str[i]=offset+'A';
    }
    else if(str[i]>=97 && str[i]<=122)
    {
      int offset=str[i]-'a';
      offset=(offset-key)%26;
      if(offset<0)
        offset=(offset+26)%26;
      str[i]=offset+'a';
    }
  }
  puts(str);
  return 0;
}