
/*					*/


import java.lang.System;
import java.lang.String;
import java.io.*;

class Node
{
	int data;
	Node right;

	Node(int item)
	{
		data=item;
		right=null;

	}

}



class LinkedList
{



	Node head,tail;

	int choice;
	char yn;

	BufferedReader br;


	


	LinkedList()
	{
		head=null;
		tail=null;
		yn='y';
		br=new BufferedReader(new InputStreamReader(System.in));
	}

	
	public void insertData(int item)
	{
		Node n=new Node(item);
		
		if(tail==null)
		{
			head=tail=n;
			return;
		}	


		tail.right=n;
		tail=n;
	}


	public void searchData(int item)
	{
			Node temp=head;

			while(temp!=null)
			{
				if(temp.data==item)
				{
					System.out.println("Found");
					return;
				}

				temp=temp.right;

			}

			if(temp==null)
				System.out.println("Not found!");

	}


	public void deleteData(int item)
	{

		Node temp=head.right;
		Node prev=head;
		Node del;



		if(head==null)
			return;


		else if(head.data==item)
		{
			del=head;
			head=head.right;
			del=null;
			return;
		}



		


		else
		{

			while(temp!=null)
			{
				if(temp.data==item)
				{
					
						del=temp;

						prev.right=temp.right;

							if(del==tail)
								tail=prev;
						del=null;


					
					return;
				}

				temp=temp.right;
				prev=prev.right;

			}

			if(temp==null)
				System.out.println("item Not found!");

		}
	}


	public void traverseList()
	{

		Node temp=head;

			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.right;

			}

	}


	public void displayMenu() throws IOException
	{

		int item;


		while(yn!='n')
		{

			System.out.println("Enter the choice");
	
			System.out.println("1-Insert \n2-Delete\n3-Search\n4-Traversal\n");

			choice=Integer.parseInt(br.readLine());


			switch(choice)
			{

				case 1:System.out.println("Enter the data to insert");
				       item=Integer.parseInt(br.readLine());
				       insertData(item);
				       break;	

				case 2:System.out.println("Enter the data to delete");
				       item=Integer.parseInt(br.readLine());
				       deleteData(item);
				       break;

				case 3:System.out.println("Enter the data to search");
				       item=Integer.parseInt(br.readLine());
				       searchData(item);
				       break;


				case 4:traverseList();
				       break;

				default:System.out.println("Invalid Choice");

			}


			System.out.println("\nDo you wish to continue?yes-any key ,no-n\n");
			yn=br.readLine().charAt(0);

		
		
		}


	}


	public static void main(String args[]) throws IOException
	{
		LinkedList ll=new LinkedList();
		ll.displayMenu();
	}	
}
