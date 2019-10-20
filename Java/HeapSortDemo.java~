
/*


*/

import java.lang.System;
import java.lang.String;
import java.io.*;

class HeapSort
{
	
	int size,a[];
	BufferedReader br;

	HeapSort()
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		
	}

	void readElements() throws IOException
	{
		
		int i;

		System.out.println("How many elements?:");
		size=Integer.parseInt(br.readLine().trim());

		a=new int[size+1];

		System.out.println("Enter "+size+" elements:\n");

		for(i=1;i<=size;i++)
			a[i]=Integer.parseInt(br.readLine().trim());

	}

	void heapify()
	{
		

		int i,parent,child,val;

		for(i=2;i<=size;i++)
		{
			val=a[i];

			child=i;
			parent=child/2;

			while( parent>0 && val > a[parent])
			{	
				a[child]=a[parent];
				child=parent;
				parent=child/2;	

			}

			a[child]=val;

		}

	}


	

	void percolateDown(int parent,int n)
	{
		int child,val;

		val=a[parent];
		child=parent*2;

		while(child<=n)
		{

			if(child+1 <=n && a[child+1]>a[child])
				child++;

			if(val >= a[child])
				break;

			a[parent]=a[child];
			
			parent=child;
			child=parent*2;

		}

		a[parent]=val;
	

		
		
		
	
		
	}

	void deleteRoot(int n)
	{

		int temp;

		temp=a[1];
		a[1]=a[n];
		a[n]=temp;
	} 
	

	void sort()
	{

		

		int i;

		heapify();


		i=size;
			
		while(i>1)
		{
			deleteRoot(i);
			i--;
			percolateDown(1,i);
		}



		System.out.println("\nAfter sorting............\n");

		for(i=1;i<=size;i++)
			System.out.print(" "+a[i]);
		
		System.out.println();

	}




}


class HeapSortDemo
{

	public static void main(String args[]) throws IOException
	{
		HeapSort hs=new HeapSort();
		
		hs.readElements();
		hs.sort();


	}


}
