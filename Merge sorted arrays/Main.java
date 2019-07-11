#include <stdio.h>
int main() 
{
	//write your code here
  int n,m,a[10],b[10],i,j,t,c[10];
  scanf("%d %d",&m,&n);
  for(i=0;i<m;i++)
  {
    scanf("%d",&a[i]);
  }
   for(j=0;j<n;j++)
  {
    scanf("%d",&b[j]);
  }
  j=0;
  int k=0;
  for(i=0;i<n+m;i++)
  {
    if (j < m && k < n) {
        
            if (a[j] < b[k]) {            
                c[i] = a[j];
                j++; 
            }
            else {            
                c[i] = b[k];
                k++; 
            }
        }
        
        else if (j == m) {
            for (; i < m + n;) {            
                c[i] = b[k];
                k++;
                i++; 
            }
        }
        
        else {
            for (; i < m + n;) {                
                c[i] = a[j];
                j++;
                i++;
            }
        }
  }

  for(i=0;i<n+m;i++)
  {
    printf("%d ",c[i]);
  }
    
  
	return 0;
}