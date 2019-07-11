// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
#include <string.h>
// Main function
int main()
{
  char str[10000];
  gets(str);
  int count[26];
  for(int i=0;i<26;i++)
    count[i]=0;
  int l=strlen(str);
  for(int i=0;i<l;i++)
  {
    int offset=str[i]-'a';
    count[offset]++;
  }
  for(int i=0;i<26;i++)
  {
    int offset='a'+i;
    if(count[i]==0)
    {
      printf("%c ",offset);
    }
  }
  
  
   return 0;
}