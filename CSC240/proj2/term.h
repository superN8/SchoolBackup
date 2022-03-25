#ifndef TERM_H_
#define TERM_H_

typedef struct term
{
	int co;
	char var;
	int exp;
} term_t;

char * term_to_string(const term_t * term);

#endif