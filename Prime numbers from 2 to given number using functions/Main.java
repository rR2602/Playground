#include<stdio.h>
void prime(int n){
int i,j,c;
  for(i=2;i<=n;i++){
    c=1;
  for(j=2;j<=i;j++){
  if(i%j==0){
c=c+1;
  }
  }
    if(c<=2){
    printf("%d\n",i);
    }
  }
}
int main(){
  int n;
  scanf("%d",&n);
  prime(n);
    // Type your code here
    return 0;
}