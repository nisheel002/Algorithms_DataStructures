import java.lang.String;
import java.lang.System;
import java.io.*;

class Permutation
{

	StringBuffer sb;
	BufferedReader br;
	int len;



	Permutation() throws IOException
	{

		br=new BufferedReader(new InputStreamReader (System.in));

		String str;

		System.out.println("Enter the size of String");
		int n=Integer.parseInt(br.readLine().trim());

		sb=new StringBuffer(n);


		System.out.println("Enter the String");
		str=br.readLine().trim();
		len=str.length();
		sb.append(str);


		System.out.println("String Entered:"+sb);


		


	}



	void permute(StringBuffer sb,int lb,int ub)
	{

		int i;

		if(lb==ub)
		{
			System.out.println(sb);
			return;
		}



		for(i=lb;i<=ub;i++)
		{
			swap(sb,lb,i);
			permute(sb,lb+1,ub);
			swap(sb,lb,i);
			

		}


	}


	void swap(StringBuffer sb,int i,int j)
	{
		char temp;
		temp=sb.charAt(i);
		
		sb.setCharAt(i,sb.charAt(j));
		sb.setCharAt(j,temp);

	}


}

class PermutationDemo
{


	public static void main(String args[]) throws IOException
	{


		Permutation p=new Permutation();

		p.permute(p.sb,0,p.len-1);
		


	}

}



