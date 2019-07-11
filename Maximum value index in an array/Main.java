// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int a[10],n,u,i,v;
  scanf("%d",&n);
  for(i=0;i<n;i++){scanf("%d",&a[i]);}
  u=a[0];
  v=0;
   for(i=1;i<n;i++){if(u<a[i]){v=i;}}
  printf("%d",v);
  // Type your code here 
  
   return 0;
}