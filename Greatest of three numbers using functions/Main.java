#include <stdio.h>
int greater(int n1,int n2,int n3){
if(n1>n2){
if(n1>n3){
return n1;
}
  else{
  return n3;
  }
}
  else{
  if(n2>n3){
  return n2;
  }
    else{
    return n3;
    }
  }
}
int main(){
  int n1,n2,n3,k;
  scanf("%d %d %d",&n1,&n2,&n3);
  k=greater(n1,n2,n3);printf("%d",k);
	// Type your code here
  	return 0;
}