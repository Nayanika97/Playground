#include <stdio.h>
int main() {
	int n,firstDigit,lastDigit,sum;
  scanf("%d",&n);
  lastDigit = n% 10;
 
    firstDigit = n;
  while(n >= 10)
    {
        n = n / 10;
    }
    firstDigit = n;

    sum = firstDigit + lastDigit;
 
  printf("%d",sum);
  
	return 0;
}