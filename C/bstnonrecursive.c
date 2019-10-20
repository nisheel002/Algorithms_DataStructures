
#include<stdio.h>
#include<stdlib.h>

struct node 
{

	int data;
	struct node *leftc,*rightc;

}*parent,*root=NULL;


struct node *insert(struct node *root,int item)
{


	if(!root)
	{
		root=(struct node *) malloc(sizeof(struct node));

		root->data=item;
		root->leftc=NULL;
		root->rightc=NULL;
	}


	else if(item < root->data)
		root->leftc=insert(root->leftc,item);


	else if(item > root->data)
		root->rightc=insert(root->rightc,item);

	else
		printf("\nduplicate data\n");

	
	return(root);

}


void inorder(struct node *temp)
{

	if(temp)
	{
		inorder(temp->leftc);
		printf("%d ",temp->data);
		inorder(temp->rightc);

	}

}

void preorder(struct node *temp)
{
	if(temp)
	{
		printf(" %d",temp->data);
		preorder(temp->leftc);
		preorder(temp->rightc);

	}

}


void  search(struct node *temp,int val)
{

	if(temp)
	{
		if(temp->data==val)
		{
			printf("..................found....................\n");
			return;
		}

		else if(val > temp->data)
			search(temp->rightc,val);

		else
			search(temp->leftc,val);
			

	}

	else
		printf("\n.....not found..........\n");

}


void delete(struct node *temp,int val)
{

	/*

	if(!temp)
	{
		printf("\n.......................element not found..................................\n");
		return;
	}
	else if(val < temp->data)
		delete(temp->leftc,val,temp,'l');

	else if(val > temp->data)
		delete(temp->rightc,val,temp,'r');

	*/

	
	struct node *prev=root;
	char dir='m';

	while(temp)
	{

		if(val < temp->data)
		{
			prev=temp;
			dir='l';
			temp=temp->leftc;
		
		}

		else if(val > temp->data)
		{

			prev=temp;
			dir='r';
			temp=temp->rightc;
		}

		else
			break;

	}


	


	if(temp)
	{
		if(!temp->leftc && !temp->rightc)
		{
			
			if(temp==root)
			{
				free(root);
				root=NULL;
				return;
			}
	
			
			if(dir=='l')
				prev->leftc=NULL;
			else
				prev->rightc=NULL;

			free(temp);
			
		}


		else if(!temp->rightc)
		{
			if(temp==root)
			{
				free(root);
				root=temp->leftc;
				return;
			}


			if(dir=='l')
				prev->leftc=temp->leftc;
			else
				prev->rightc=temp->leftc;

			free(temp);
			

		}


		else if(!temp->leftc)
		{
			if(temp==root)
			{
				free(root);
				root=temp->rightc;
				return;
			}

			if(dir=='l')
				prev->leftc=temp->rightc;
			else
				prev->rightc=temp->rightc;

			free(temp);
			


		}

		else
		{
			parent=temp;
			prev=temp;

			temp=parent->leftc;

			if(!temp->leftc && !temp->rightc)
			{
				parent->data=temp->data;
				parent->leftc=NULL;
				free(temp);
				return;
			}

			while(temp->rightc)
			{
				prev=temp;
				temp=temp->rightc;
			}


			parent->data=temp->data;

			if(!temp->leftc)			
			{
				prev->rightc=NULL;
				free(temp);
				return;
			}

			prev->rightc=temp->leftc;
			free(temp);
			
		}


	} 	

	else
		printf("\n.............Element not found ....................");
	

	
}





int main()
{

int choice,val;
int n,i;

	do
	{
		printf("\n.............Menu.........................\n");
		printf("\t1-Create\n");
		printf("\t2-Insert\n");
		printf("\t3-Traversal\n");
		printf("\t4-Search\n");
		printf("\t5-Delete\n");
		printf("\t0-Exit\n");


		printf("\nEnter your choice:\n");
		scanf("%d",&choice);

		switch(choice)
		{

			case 0:break;

			case 1:printf("\nenter the number of elements to insert :\n");
			       scanf("%d",&n);
			       printf("\nenter %d elements:\n",n);
			       for(i=1;i<=n;i++)
			       {
					scanf("%d",&val);
			       		root=insert(root,val);
			       }
			       printf("\n");
			       inorder(root);
			       break;

			case 2:printf("\nenter the value to insert :\n");
			       scanf("%d",&val);
			       root=insert(root,val);
			       printf("\n");
			       inorder(root);
			       break;

			case 3:printf("\nin order.........\n");
			       inorder(root);
			       printf("\npre order.........\n");
			       preorder(root);
			       break;

			case 4:printf("\nenter the value to search:\n");
			       scanf("%d",&val);
			       search(root,val);
			       break;


			case 5:printf("\nenter the value to delete:\n");
			       scanf("%d",&val);
			       delete(root,val);
			       printf("\n");
			       inorder(root);
			       break;

			default:printf("\n \t ..........invalid choice !...........");

		}

		
	
	}while(choice);

return 0;
}

