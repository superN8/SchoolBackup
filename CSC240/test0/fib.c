#include<stdio.h>

int fib(int num)
{
	if (num > 1)
	{
		return fib(num-1) + fib(num-2);
	}
	else if(num == 1)
	{
		return 1;
	}
	return 0;
}

int main()
{
	int in;
	printf("Enter term of fibbonaci: ");
	scanf("%d", &in);
	int d = fib(in);
	printf("%d term of fibbonaci: %d", in, d);
	
	return 0;
}