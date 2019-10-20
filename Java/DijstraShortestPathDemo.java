



import java.lang.System;
import java.lang.String;
import java.io.*;


class TableField
{

int vertex;
int path;
int cost;

}


class DijkstraShortestPath
{

	int graph[][];
	int size;
	int source;
	int pQueue[];
	TableRow tr[];
	int pQSize;
	

	BufferedReader br;

	DijkstaShortestPath()
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		pQSize=0;	

	}
	


	void readData() throws IOException
	{
		int i,j;

		System.out.println("\nEnter size of Graph\n");
		size=Integer.parseInt(br.readLine().trim());


		graph=new int[size][size];
		pQueue=new Node[size+1];

		tr=new TableRow[size];

		System.out.println("\nEnter Graph\n");

		for(i=0;i<size;i++)
		{
			tf[i].vertex=i;
			tf[i].cost=-1;

			for(j=0;j<size;j++)
			{
				graph[i][j]=Integer.parseInt(br.readLine().trim());

			}
		}

		System.out.println("Enter Source Vertex\n");
		source=Integer.parseInt(br.readLine().trim());

		tr[source].cost=0;
		tr[source].path=source;

		
	}



	void pickEdge()
	{
		
		int distance,node,j;

		node=deleteMin();

				

		for(j=0;j<size;j++)
		{
			if(graph[node][j] > 0)
			{

				distance= tr[node].cost + graph[node][j];

				if(tr[j].cost==-1)
				{
					insertNode(j,distance,node);
					continue;
				}
				
				if(distance < tr[j].cost )
					updateNode(j,distance,node);
			}

		}

	}


	void updateNode(int vertex,int priority,int path)
	{
		
	}

	void insertNode(int vertex,int priority,int path)
	{
	
		pQueue[++pQSize]=vertex;
		tr[vertex].cost=priority;
		tr[vertex].path=path;


		int parent,child,val;

		child=pQSize;
		parent=child/2;
		val=priority;

	
		while(parent > 0 && tr[parent].cost > val)
		{
			tr[child].cost=tr[parent].cost;
			child=parent;
			parent=child/2;
		}

		

		
		


		


			


	}


	int deleteMin()	
	{

	}

	void search()
	{

	}

	


}



class DijkstraShortestPathDemo
{


	public static void main(String args[]) throws IOException
	{


	}


}
