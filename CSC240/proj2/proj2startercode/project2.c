#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include"term.h"
#include"polynomial.h"
#include"basiclist.h"

#define BUFFERLEN 100

/* Parses a string into a term data structure */
term_t * term_from_string(char * buff) {
    term_t * ret = malloc(sizeof(term_t));
    ret->coefficient=atoi(strtok(buff, " "));
    ret->var=*strtok(NULL, " ");
    ret->exponent=atoi(strtok(NULL, " "));
    return ret;
}

/* Reads a text file and adds terms to a basiclist */
void read_objects(node_t ** object_list) {

    FILE *fp;
    char buffer[BUFFERLEN];
    fp = fopen("terms.txt", "r");

    while (fgets(buffer, BUFFERLEN,fp)) {
        term_t * this_term;
        this_term =  term_from_string(buffer);
        list_add(object_list, this_term);
    }
    fclose(fp);
}


int main() {
    /* These variables are for testing your term implementation */
    term_t testterm1 = {1, 'x', 0};
    term_t testterm2 = {2, 'x', 1};
    term_t testterm3 = {3, 'x', 2};
    poly_t * poly1;
    poly_t * poly2;
    node_t * curr;
    node_t * object_list = NULL;

    read_objects(&object_list);

    printf("NAME: SAMPLE OUTPUT\n");

    /* Code to test your polynomial implementation */
    printf("Testing term.c/h:\n");
    printf("testterm1: %s\n", term_to_string(&testterm1));
    printf("testterm2: %s\n", term_to_string(&testterm2));
    printf("testterm3: %s\n", term_to_string(&testterm3));

    /* Add code below to create a new polynomial add the terms in 
     *  object_list to it */

    /* Code to test your polynomial implementation */
    printf("\nTesting polynomial.c/h : \n");
    printf("Original: : ");
    print_polynomial(poly1);
    poly2 = combine_like_terms(poly1);
    printf("\nCombined: : ");
    print_polynomial(poly2);
    printf("\nNAME: SAMPLE OUTPUT\n");
    return 0;
}
