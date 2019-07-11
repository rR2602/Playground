#include<stdio.h>
#include<string.h>
int main()
{
  char s1[10000],s2[10000],ch1,ch2;
  int i,j,l1,l2,count;
  gets(s1);
  gets(s2);
  l1=strlen(s1);
  l2=strlen(s2);
  count=0;
  for(i=0;i<=(l1-l2);i++)
  {
    j=0;
    while(j<l2)
    {
      if(s1[i+j]>=65 && s1[i+j]<=90)
      {
        ch1=s1[i+j];
        ch2=s1[i+j]+32;
      }
      if(s1[i+j]>=97 && s1[i+j]<=122)
      {
        ch1=s1[i+j];
        ch2=s1[i+j]-32;

      }
      if(ch1!=s2[j] && ch2!=s2[j])
      {
        break;
      }
      j++;
    }
    if(j==l2)
      count++;
  }
  printf("%d",count);
  
  
  return 0;
}