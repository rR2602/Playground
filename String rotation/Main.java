#include<stdio.h>
#include<string.h>
int  Rotation_check(char *str1, char *str2)
{
  int l=strlen(str1);
  int i;
  
  for(i=0;i<l;i++)
  {
    char temp[20];
    int j=0,index=0;
    for(j=0;j<l;j++)
    {
      int offset=(j+i)%l;
      temp[j]=str1[offset];
    }
    temp[j]='\0';
    if(strcmp(str2,temp)==0)
      break;
  }
  if(i==l)
    return 0;
  return 1;
  
}
  
int main()
{
  char st1[20], st2[20];
  gets(st1);
  gets(st2);
  if(Rotation_check(st1,st2))
    printf("Yes");
  else
    printf("No");
  return 0;
}