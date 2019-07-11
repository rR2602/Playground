#include <stdio.h>
int main() {
	int num,i=1,temp,count;
  scanf("%d",&num);
  for(count=0;temp<num ;count++)
  {
    
    if(i%2!=0)
    {
      printf("%d\n",i);
      temp++;
    }
    i++;
  }
	return 0;
}