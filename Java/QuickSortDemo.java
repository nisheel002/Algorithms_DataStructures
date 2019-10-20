import java.lang.System;
import java.lang.String;
import java.io.*;
import java.util.Random;

class QuickSort
{

	int w;
	Random rn;

	QuickSort()
	{

		 rn=new Random();
	}
	

	

	
	void quickSort(int a[],int lb,int ub)
	{
			int m;

			if(lb<ub)
			{
				

				m=partition(a,lb,ub);
				quickSort(a,lb,m-1);
				quickSort(a,m+1,ub);


			}


	}

	int partition(int a[],int lb,int ub)
	{


		int w=lb+rn.nextInt(ub-lb+1);

		int pivot=a[w];
		int i=lb;
		int j=ub;
		int pos=w;
		int temp;

		while(i<j)
		{
	
			while(a[i]<pivot)
				i++;

			while(a[j]>pivot)
				j--;


		
			if(a[i]==a[j])
			{

				if(i==j)
					return i;
				
				i++;


			}

		
			else
			{

				if(a[i]==pivot)
					pos=j;

				if(a[j]==pivot)
					pos=i;

			
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;


			}

		}

			return pos;

	}




}


class QuickSortDemo
{

	public static void main(String args[]) throws IOException
	{

		int n,i,a[];

		



		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number of elements");
		n=Integer.parseInt(br.readLine());


		a=new int[n];

		System.out.printf("Enter %d elements\n",n);
		for(i=0;i<n;i++)
		     a[i]=Integer.parseInt(br.readLine());


		QuickSort s=new QuickSort();
		s.quickSort(a,0,n-1);

		System.out.println("Sorted elements");
		for(i=0;i<n;i++)
			System.out.printf("%d ",a[i]);


	
		

		
		


	}



}
