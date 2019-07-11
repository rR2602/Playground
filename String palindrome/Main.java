#include<stdio.h>
#include<string.h>
int main()
{
  char str[1000],s[1000];
  gets(str);
  int l=strlen(str);
  int index=0;
  for(int i=l-1;i>=0;i--)
    s[index++]=str[i];
  s[index]='\0';
  if(strcmp(s,str)==0)
    printf("%s is a palindrome",str);
  else
    printf("%s is not a palindrome",str);
  return 0;
}