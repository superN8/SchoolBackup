#include"term.h"
#include <stdio.h>
int main()
{
	term_t num = {2,'x',2};
	term_t * newNum = &num;
	char * s = term_to_string(newNum);
	printf("%s", s);
	return 0;
}

char * term_to_string(const term_t * term)
{
	
	/*char * i = &term->co;*/
	/*char * v = term->var;*/
	/*char * e = term->exp;*/
	char * str[] = {(char*) term->var};
	return str;
}