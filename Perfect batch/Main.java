/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
int main()
{
  int n,a[10],i,j,sum=0,sum1=0,k;
  scanf("%d",&n);
  for(i=0;i<n;i++){
  scanf("%d",&a[i]);}
  for(j=0;j<3;j++){
  sum=sum+a[j];}
  for(k=3;k<6;k++){sum1=sum1+a[k];
                   }
  if(sum==sum1){printf("Perfect Batch");}else{printf("Not a Perfect Batch");}
  //Type your code here
  return 0;
}