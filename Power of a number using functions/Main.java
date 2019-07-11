#include<stdio.h>
int pow1(int b,int e){
  int d=1,c=0;
while(c!=e){
d=d*b;
  c=c+1;
}
return d;
}
int main(){
 int b,e,g;
scanf("%d %d",&b,&e);
g=pow1(b,e);
printf("%d",g);
    // Type your code here
  	return 0;
}