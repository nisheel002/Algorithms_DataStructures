import java.lang.System;
import java.lang.String;
import java.io.*;

class Bfs
{

	int g[][];
	int n;
	int srcv;
	int q[],flag[],front,rear;
	
	Bfs(int n,int srcv)
	{
		this.n=n;
		this.srcv=srcv;
		front=0;
		rear=0;
		
		 q=new int[n];
		 g=new int[n][n];
		 flag=new int[n];		

		q[0]=srcv;
		
		flag[srcv-1]=1;
	}

	void enqueue(int item)
	{

		if(rear==n-1)
		{
			System.out.println("Queue Full");
			return;
		}

		q[++rear]=item;
		flag[item-1]=1;

		

	}

	int dequeue()
	{
		if(front > rear)
		{
			System.out.println("Queue underflow!");
			return -1;
			
		}
		int h=q[front++];
		return(h);

	}

	void bfs()
	{
		
		int j=0;
		int k;
	
		while(rear>=front)
		{
			k=dequeue();
			System.out.print(k+" ");

			for(j=0;j<n;j++)
				if(g[k-1][j]==1 && flag[j]==0)
					enqueue(j+1);

		}

		


	}
	


}


class BfsDemo
{

	public static void main(String args[]) throws IOException
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nEnter the number of vertices");
		int n=Integer.parseInt(br.readLine());
		System.out.println("\nEnter the source vertex");
		int srcv=Integer.parseInt(br.readLine());
		Bfs b=new Bfs(n,srcv);
		
		System.out.println("Enter graph!");
		int i,j,p;

		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				b.g[i][j]=Integer.parseInt(br.readLine());
		

		System.out.println();		 

		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(b.g[i][j]+"\t");
			System.out.println();	
		}
		
		b.bfs();

	}

}
