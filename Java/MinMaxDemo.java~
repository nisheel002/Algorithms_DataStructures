import java.lang.System;
import java.lang.String;
import java.io.*;

class MinMax
{

	int min;
	int max;

}


class MinMaxProgram
{

	MinMax findMinMax(int a[],int lb,int ub)
	{

		 MinMax mm=new MinMax();
		
		if(lb==ub)
		{
			mm.min=a[lb];
			mm.max=a[lb];
			return mm;
		}

		int mid=(lb+ub)/2;

		
		MinMax mm1=new MinMax();
		MinMax mm2=new MinMax();


		mm1=findMinMax(a,lb,mid);
		mm2=findMinMax(a,mid+1,ub);


		
		if(mm1.min <= mm2.min)
		{
			if(mm2.max >= mm1.max)
				mm1.max=mm2.max;

			return mm1;

		}
		

		else
		{
			if(mm1.max >= mm2.max)
				mm2.max=mm1.max;

			return mm2;

		}
		


		


	}



}


class MinMaxDemo
{

	public static void main(String args[]) throws IOException
	{


		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		

		System.out.println("Enter the number of elements");
		int n=Integer.parseInt(br.readLine());

		int a[]=new int[n];

		System.out.printf("Enter %d elements:\n",n);
		for(int i=0;i<n;i++)
			a[i]=Integer.parseInt(br.readLine());
	
	
		MinMaxProgram mmp=new MinMaxProgram();

		MinMax mm=new MinMax();
		mm=mmp.findMinMax(a,0,n-1);

		System.out.printf("Minimum=%d \t Maxinum=%d\n",mm.min,mm.max);

	}

}
