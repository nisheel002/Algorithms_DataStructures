import java.lang.String;
import java.lang.System;
import java.util.*;
import java.io.*;

class StackDemo
{

	 


	public static void main(String args[]) throws IOException
	{

		int ch,y=1,item;

		Integer k;

		Stack<Integer> st;


		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		st=new Stack<Integer>();


		while(y==1)
		{

			System.out.println("Menu");
			System.out.println("1-Push");
			System.out.println("2-Pop");
			System.out.println("3-Peek");
			System.out.println("4-Search");
			System.out.println("5-Display");
			System.out.println("6-Exit");


			System.out.println("\nEnter your choice:");
			ch=Integer.parseInt(br.readLine().trim());


			switch(ch)
			{
	
				case 1: System.out.println("Enter item to push");
					item=Integer.parseInt(br.readLine().trim());
					st.push(item);
					System.out.println(st);
					break;

				case 2: System.out.println("poppig item");
					k=st.pop();
					System.out.println(st);
					break;

				case 3: System.out.println("peek");
					k=st.peek();
					System.out.println(k);
					System.out.println(st);
					break;
					
				case 4: System.out.println("Enter item to search");
					item=Integer.parseInt(br.readLine().trim());
					int w=st.search(item);
					if(w==-1)
						System.out.println("Not found!");

					else
						System.out.println("Item found at: "+w);
						
					break;

				case 5:System.out.println("Stack Contents :");
				       System.out.println(st);
				       break;


				case 6: break;

				default: System.out.println("Invalid Choice :");
				        



			}
			
			

				System.out.println("Do you want to continue yes-1,no-0 ?");
				y=Integer.parseInt(br.readLine().trim());





		}


		
		


	}


}
