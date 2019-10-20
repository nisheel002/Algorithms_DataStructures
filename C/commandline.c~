#include<stdio.h>
#include<string.h>
#include<stdlib.h>


void displayText()
{

	printf("\nPrinting after executing the program\n");
}



int main(int argc,char *argv[],char *envp[])
{


	int i=0;

	// printing enviornment process in system
	while(envp[i]!=NULL)
		printf("%s\n",envp[i++]);




	printf("\n");

	// printing content of argc , argv




	for(i=0;i<argc;i++)
		printf("argv[%d]=%s\n",i,argv[i]);


	// use our own commands

	printf("\n");


	if(!strcmp("listfiles",argv[1]))
		system("ls");	


	if(!strcmp("clearmyscreen",argv[1]))
		system("clear");



	printf("\n");
	// execute another program from main

		system("./multtable");


	printf("\n");

	atexit(displayText);

	printf("hai  ...........\n");



	





}
