#include <stdio.h>
int gcd(int n1,int n2,int n3){
  int k,i,b;
if(n1<n2){
if(n1<n3){
k=n1;
}
  else{
  k=n3;
  }
}
  else{
  if(n2<n3){
  k=n2;
  }
    else{
    k= n3;
    }
  }
  for(i=1;i<k;i++){
  if(n1%i==0&&n2%i==0&&n3%i==0){
  b=i;
  }
  }
  return i;
}
int main() {
  int n1,n2,n3,c;
  scanf("%d %d %d",&n1,&n2,&n3);
  c=gcd(n1,n2,n3);
  printf("%d",c);
	//Type your code here
	return 0;
}