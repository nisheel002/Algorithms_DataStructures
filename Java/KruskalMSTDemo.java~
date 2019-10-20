/*



*/


import java.lang.System;
import java.lang.String;
import java.util.*;
import java.io.*;



class Edges
{
	
	int end1;
	int end2;
	int cost;


	Edges(int end1,int end2,int cost)
	{
		this.end1=end1;
		this.end2=end2;
		this.cost=cost;

	}	
	

}


class KruskalMST
{


	int parent[];
	int graph[][];
	int size;

	
	ArrayList<Edges> e;

	BufferedReader br;
	
	KruskalMST()
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		e=new ArrayList<Edges>();

	}


	void getGraph() throws IOException
	{

		System.out.println("Enter size of graph:");
		size=Integer.parseInt(br.readLine().trim());

		graph=new int[size][size];
		parent=new int[size];

		System.out.println("Enter adjacency matrix for graph:\n");


		int i,j;


		for(i=0;i<size;i++)
		{

			
			parent[i]=-1;

			for(j=0;j<size;j++)
			{
				
				graph[i][j]=Integer.parseInt(br.readLine().trim());

				if(j < i && graph[i][j] > 0)
				{
				   	 Edges k= new Edges(i,j,graph[i][j]);
					 e.add(k);
				}   

			}
		}



	}

	void sortEdges()
	{

		int u;
		u=e.size()-1;

		quickSort(e,0,u);
	}


	void quickSort(ArrayList<Edges> e,int lb,int ub)
	{
		if(lb < ub)
		{
			int m=partition(e,lb,ub);
			quickSort(e,lb,m-1);
			quickSort(e,m+1,ub);

		}
	}


	int partition(ArrayList<Edges> e,int lb,int ub)
	{
		Edges k;

		int mid=(lb+ub)/2;

		k=e.get(mid);

		int key=k.cost;
		int pos=mid;

		int i=lb;
		int j=ub;


		
		while(i<j)
		{
			while(e.get(i).cost < key)
				i++;

			while(e.get(j).cost > key)
				j--;


			if(e.get(i).cost==e.get(j).cost)
			{
				if(i==j)
					return i;

				i++;

			}


			if(e.get(i).cost==key)
				pos=j;

			if(e.get(j).cost==key)
				pos=i;


		/*


		Edges temp,temp1,temp2;

		temp1=e.get(i);
		temp2=e.get(j);



		temp=temp1;
		temp1=temp2;
		temp2=temp;


		*/



		int end1,end2,cost;

		end1=e.get(i).end1;
		end2=e.get(i).end2;
		cost=e.get(i).cost;


		e.get(i).cost=e.get(j).cost;
		e.get(i).end1=e.get(j).end1;
		e.get(i).end2=e.get(j).end2;


		e.get(j).end1=end1;
		e.get(j).end2=end2;
		e.get(j).cost=cost;
	
		}


		return pos;



	}

	int find(int u)
	{
		if(parent[u] < 0)
			return u;

		return (find(parent[u]));

	}

	void union(int u,int v)
	{

		int m,n;
		
		m=find(u);
		n=find(v);


		if(parent[m] <= parent[n])
		{
			
			parent[m]=parent[m]+parent[n];
			parent[n]=m;

		}

		else
		{

			parent[n]=parent[n]+parent[m];
			parent[m]=n;

		}


	}


		

	void constructMST()
	{

		int r,s;

		System.out.println();		

		for(Edges m:e)
		{
			r=find(m.end1);
			s=find(m.end2);

			if(r!=s)
			{
				System.out.println("Egge ( "+m.end1+","+m.end2+" )  :"+m.cost);
				union(m.end1,m.end2);


			}


		}

	}


}


class KruskalMSTDemo
{

	public static void main(String args[]) throws IOException
	{

		KruskalMST kmst=new KruskalMST();

		kmst.getGraph();
		kmst.sortEdges();
		kmst.constructMST();

	}

}

