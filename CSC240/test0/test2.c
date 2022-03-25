#include<stdio.h>

int main()
{
	int num = 2;
	int * addy = &num;
	*addy = 4;
	int ** addy2 = &addy;
	**addy2 = 6;
	printf("%d hello", num);
	printf("\n%d", addy2);
	return 0;
}