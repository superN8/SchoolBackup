#include<stdio.h>
 
int main()
{
  int n = 0,
	 i,
	 num;
  do
  {
    printf("Enter a number less than 10: ");
    scanf("%d", &n);
  }
  while((n < 1) || (n > 10));
  int array[n];
  for(i = 0; i < n; i++)
  {
    num = 0;
    printf("Input a number for index[%d]: ",i);
    scanf("%d", &num);
    array[i] = num;
  }
  printf("Even numbers: ");
  for(i = 0; i < n; i++)
  {
	if(array[i]%2 == 0) 
    {
	  printf("%d ",array[i]);
	}
  }
  return 0;
}