// Find Union data structure

import java.lang.System;
import java.lang.String;
import java.io.*;


class FindUnion
{

	int parent[];
	int size;


	int find(int u) 
	{

		
		if(parent[u] < 0)
			return u;

		return(find(parent[u]));
			


	}

	void union(int u,int v) 
	{


	    

		int m=find(u);
		int n=find(v);
		

		if(m!=n)
		{

			int total=parent[m]+parent[n];

			if(parent[m]<= parent[n])
			{
				parent[n]=m;
				parent[m]=total;
			}

			
			
			else
			{

				parent[m]=n;
				parent[n]=total;


			}

		}


		else
			System.out.println("Both belongs to same Set");

		
		for(int i=1;i<parent.length;i++)
			System.out.print(parent[i]+" ");



	}

	public static void main(String args[]) throws IOException 
	{

		int choice,size;
		String str;
		String numbers[];
		int u,v,m;

		System.out.println("Enter the number of elements in Set:");

		FindUnion fu=new FindUnion();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		size=Integer.parseInt(br.readLine());

		fu.parent=new int[size+1];


		for(int i=1;i<fu.parent.length;i++)
			fu.parent[i]=-1;


		


		do
		{

			System.out.println("\n1-Union\n2-Find\n3-exit");
			System.out.println("\nEnter your chice:");
			choice=Integer.parseInt(br.readLine());

			switch(choice)
			{
				case 1:System.out.println("\nEnter two vertices");
				       str=br.readLine();
				       str=str.trim();
				       u=Integer.parseInt(str);
				       str=br.readLine();
				       str=str.trim();
				       v=Integer.parseInt(str);
				       fu.union(u,v);
				       break;

				case 2:System.out.println("\nEnter one vertex");
				       str=br.readLine();
				       str=str.trim();
				       u=Integer.parseInt(str);
				       m=fu.find(u);
				       System.out.printf("Parent of node %d=%d\n",u,m);
				       break;
				       
				       
				case 3:System.exit(0);

				default: System.out.println("Invalid Choice !!! ");
					 System.exit(0);

			}


		}while(choice != 3);

		
	}


}
