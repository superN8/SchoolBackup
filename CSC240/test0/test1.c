#include<stdio.h>

int main()
{
	int num=0;
	long double n = 1;
	printf("Enter number: "); 
	scanf("%d", &num);
	do
	{
		n *= num; 
		num--;
	}
	while(num > 1);
	printf("%Lf", n);
	return 0;
}