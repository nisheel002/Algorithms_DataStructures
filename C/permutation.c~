#include<stdio.h>
#include<string.h>

int total=0;

void swap(char a[],int p,int q)
{
	char temp;

	temp=a[p];
	a[p]=a[q];
	a[q]=temp;
}

void permute(char a[],int lb,int ub)
{

	int i;

	

	if(lb==ub)
	{
		printf("\n%s",a);
		total++;
		return;
	}



	



		for(i=lb;i<=ub;i++)
		{
			if(lb!=i && a[lb]==a[i])
				continue;

			swap(a,lb,i);
			permute(a,lb+1,ub);
			swap(a,lb,i);	
		}

	


	

}




int main()
{

	char a[20];



	printf("\nEnter a string \n");
	scanf("%[^\n]",a);

	int n=strlen(a);

	printf("\n\n");
	permute(a,0,n-1);
	printf("\n\n");

	printf("\ntotal count=%d",total);

	printf("\n\n");

}


