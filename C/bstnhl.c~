#include<stdio.h>
#include<stdlib.h>


struct node
{

	int data;
	struct node *leftc,*rightc;

}*temp,*root=NULL;




void insert(struct node *parent,struct node *child,int val,int dir)
{

	if(child==NULL)
	{
		temp=(struct node *) malloc(sizeof(struct node *));

		temp->data=val;
		temp->leftc=NULL;
		temp->rightc=NULL;

			if(root==NULL)
			{
				root=temp;
				return;
			}

			else
			{
				if(dir==0)
					parent->leftc=temp;

				else
					parent->rightc=temp;

			}


		return;

	}




	if(val < child->data)
		insert(child,child->leftc,val,0);

	else if(val > child->data)
		insert(child,child->rightc,val,1);

	else
	{

		printf("duplicate element!");
			return;
	}

	


}


void search(struct node *root,int val)
{

	if(root==NULL)
	{
		printf("\n Not found");
		return;
		
	}

	if(val < root->data)
		search(root->leftc,val);

	else if(val > root->data)
		search(root->rightc,val);

	else
	{
		printf("\nFound");
		return;
	}

}


void traversal(struct node *current)
{

	if(current==NULL)
		return;
	
	traversal(current->leftc);
	printf("%d ",current->data);
	traversal(current->rightc);

}


void delete(struct node *parent,struct node *child,int val,int dir)
{

		if(child==NULL)
		{
			printf("\nitem do not exist");
			return;
		}


		
		else if(val < child->data)
			delete(child,child->leftc,val,0);

		else if(val > child->data)
			delete(child,child->rightc,val,1);

		else
		{


			if(child->leftc == NULL && child->rightc == NULL)
			{

				if(child == root)
				{		
						free(root);
						root=NULL;
						return;
				}

				if(dir == 0)
					parent->leftc=NULL;
					
				else 
					parent->rightc=NULL;
					
					free(child);
					return;
			}


			else if(child->rightc == NULL)
			{
				if(child == root)
				{
					temp=root;
					root=root->leftc;
					free(temp);
					return;

				}

				
				if(dir==0)
					parent->leftc = child->leftc;


				else
					parent->rightc = child->leftc;	


					free(child);
					return;		
				

				


			}
				



			else if(child->leftc == NULL)
			{

				if(child == root)
				{
					temp=root;
					root=root->rightc;
					free(temp);
					return;

				}

				


				if(dir==0)
					parent->leftc = child->rightc;


				else
					parent->rightc = child->rightc;	


					free(child);
					return;		
				



			}


			

			else
			{

				temp=child->leftc;
				struct node *tempp=temp;




				if(child->leftc->leftc == NULL && child->leftc->rightc==NULL)
				{
					child->data=child->leftc->data;
					free(child->leftc);
					child->leftc=NULL;
					return;

				}

				else if(child->leftc->rightc ==NULL)
				{
					child->data=temp->data;
					child->leftc=temp->leftc;
					free(temp);
					return;	

				}

				else
				{
					temp=tempp->rightc;
					while(temp->rightc!=NULL)
					{
						temp=temp->rightc;
						tempp=tempp->rightc;
					}


					child->data=temp->data;
					tempp->rightc=temp->leftc;
					free(temp);
					return;
					

				}

			}

		}
			
}


int main()
{

int choice,val;
int yn;

	do
	{
		printf("\nMenu:\n");
		
		printf("1-Insert\n");
		printf("2-Traversal\n");
		printf("3-Search\n");
		printf("4-Delete\n");


		printf("\nEnter your choice:\n");
		scanf("%d",&choice);

		switch(choice)
		{
			case 1:printf("\nenter the value to insert :\n");
			       scanf("%d",&val);
			       insert(NULL,root,val,0);
			       break;

			case 2:traversal(root);
			       break;

			case 3:printf("\nenter the value to search:\n");
			       scanf("%d",&val);
			       search(root,val);
			       break;


			case 4:printf("\nenter the value to delete:\n");
			       scanf("%d",&val);
			       delete(NULL,root,val,0);
			       break;

			default:printf("\n invalid choice");

		}

		printf("\nDo you want to continue? yes-1 no-0\n");
		scanf("%d",&yn);
	
	}while(yn == 1);




return 0;
}
