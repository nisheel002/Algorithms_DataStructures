
import java.lang.System;
import java.lang.String;
import java.io.*;

class Dfs
{
	
	int n;
	int g[][];
	int flag[];


	Dfs(int n)
	{

		this.n=n;
		flag=new int[n];
		g=new int[n][n];

		int j=0;
		for(j=0;j<n;j++)
			flag[j]=0;		

	}

	void dfs(int v)
	{

		System.out.print(v+" ");
		flag[v-1]=1;
		
		
		int j;

		for(j=0;j<n;j++)
			if(g[v-1][j]==1 && flag[j]==0)
				dfs(j+1);
			
			
		

		

	}



}


class DfsDemo
{

	public static void main(String args[]) throws IOException
	{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("\nEnter the number of vertices");
		int n=Integer.parseInt(br.readLine());

		System.out.println("\nEnter the source vertex");
		int srcv=Integer.parseInt(br.readLine());


		Dfs d=new Dfs(n);

		System.out.println("\nEnter the graph!");

		int i,j;

		for(i=0;i<n;i++)
			for(j=0;j<n;j++)
				d.g[i][j]=Integer.parseInt(br.readLine());


		System.out.println("\ngraph!");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
				System.out.print(d.g[i][j]+"\t");

			System.out.println();

		}

		

		System.out.println();

		d.dfs(srcv);
		

				


		

	}

}
