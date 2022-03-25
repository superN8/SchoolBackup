#include<stdio.h>

int main()
{
	int i = 8, *j = &i, **k =&j;
	*j = 20;
	**k = 35;
	printf("%d\n%d\n%d",i,j,k);
	return 0;
}