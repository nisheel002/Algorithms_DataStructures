
/* Rabin Karp String matching algorithm, program  by Nisheel S */

import java.lang.System;
import java.lang.String;
import java.io.*;


class RabinKarp
{

	String pattern;
	String text;

	int n,m,h;
	int ptnvalue,tempvalue;

	BufferedReader br;

	final int prime=10007;


	RabinKarp()
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		ptnvalue=0;
		tempvalue=0;
		h=1;

	}




	boolean getText() throws IOException
	{

		System.out.println("Enter Pattern");
		pattern=br.readLine().trim();

		System.out.println("Enter Text");
		text=br.readLine().trim();


		n=text.length();
		m=pattern.length();

		if(n>=m)
			return true;

		else
			return false;

	}


	void preProcess()
	{


		

		int i,b;
		
		for(i=0;i<m;i++)
		{
			b=(int)pattern.charAt(i);
			ptnvalue=(ptnvalue*128+b)%prime;
			//ptnvalue=(ptnvalue*128+b);
			
			b=(int)text.charAt(i);
			tempvalue=(tempvalue*128+b)%prime;
			//tempvalue=(tempvalue*128+b);


		}



	/*

		for(i=0;i<m-1;i++)
			h=(h*128)%prime;
			//h=(h*128);
	*/

		h=repeatedSquareMultiply(128,m-1,prime);
	
	}


	int repeatedSquareMultiply(int a,int b,int n)
	{
		int d=1,p=a;
		
		while(b>0)
		{
			if((b&1) == 1)
				d=(d*p)% n;
			
			p=(p*p) % n;

			b>>=1;

		}

		return d;
	}


	void stringMatch()
	{


		int i,w;

		boolean flag;

		w=n-m;

		

		for(i=0;i<=w;i++)
		{

			flag=true;

			if(tempvalue==ptnvalue)
			{
				int k;

				for(k=0;k<m;k++)
				{
					if(text.charAt(i+k) != pattern.charAt(k))
					{
						flag=false;
						break;

					}

				}
			
				if(flag)
					System.out.println("Found at: "+(i+1));

			}

			if(i<w)
			{
				int k=(int)text.charAt(i);

				tempvalue=(  (tempvalue-k*h)*128  +  (int)text.charAt(i+m) ) %prime;
				//tempvalue=( (tempvalue-k*h)*128 + (int)text.charAt(i+m) );

				
			}


			if(tempvalue < 0)
				tempvalue+=prime;


		}


	}


}


class RabinKarpDemo
{

	public static void main(String args[]) throws IOException
	{

		RabinKarp rk=new RabinKarp();

		if(rk.getText())
		{
			rk.preProcess();
			rk.stringMatch();		
		}
	}



}
