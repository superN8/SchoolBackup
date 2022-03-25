#include<stdio.h>

int main()
{
	int p;
	printf("Enter amount of change: ");
	scanf("%d", &p);
	int q = p / 25;
		p %= 25;
	int d = p / 10;
		p %= 10;
	int n = p / 5;
		p %= 5;
	printf("Quarters: %d\nDimes: %d\nNickels: %d\nPennies: %d", q, d, n, p);
	return 0;
}