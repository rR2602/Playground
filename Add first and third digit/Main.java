#include<stdio.h>
int main()
{
  //Type your code here
  int num,first_digit,last_digit,sum;
  scanf("%d",&num);
  last_digit = num%10;
  first_digit=num;
  while(num>10)
  {
    num=num/10;
  }
  first_digit=num;
  sum = first_digit + last_digit;
  printf("%d",sum);
  return 0;
}