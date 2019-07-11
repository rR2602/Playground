#include<stdio.h>
#include<string.h>
int main()
{
  char str1[100],str2[100],str3[100];
  gets(str1);
  gets(str2);
  gets(str3);
  int l1=strlen(str1);
  int l2=strlen(str2);
  int index;
  int i=0;
  for(;i<=(l1-l2);i++)
  {
    int j=0;
    for(;j<l2;j++)
    {
      if(str1[i+j]!=str2[j])
        break;
    }
    if(j==l2)
    {
      index=i;
      break;
    }
  }
  int l3=strlen(str3),j=0;
  for(i=0;i<index;i++)
    printf("%c",str1[i]);
  for(i=0;i<l3;i++)
    printf("%c",str3[i]);
  for(i=index+l2;i<l1;i++)
    printf("%c",str1[i]);
 
    
  return 0;
}