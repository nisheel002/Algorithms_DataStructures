/* 

	Knuth Morris Pratt String matching Algorithm

		program by NISHEEL S 

*/



import java.lang.System;
import java.lang.String;
import java.io.*;


class KMP
{

	String text;
	String pattern;
	int prefixTable[];
	int m,n;

	BufferedReader br;



	KMP()
	{
		br=new BufferedReader(new InputStreamReader(System.in));

	}

	void getText() throws IOException
	{


		System.out.println("Enter the pattern");
		pattern=br.readLine().trim();


		System.out.println("Enter the text");
		text=br.readLine().trim();


		m=pattern.length();
		n=text.length();

		prefixTable=new int[m];




		//System.out.println("Pattern:"+pattern);
		//System.out.println("Text:"+text);

	}


	void prefix()
	{

		prefixTable[0]=0;

		int k=0;
		int q;


		for(q=1;q<m;q++)
		{

			while( k>0 &&  pattern.charAt(q) != pattern.charAt(k))
				k=prefixTable[k-1];


			if(pattern.charAt(q)==pattern.charAt(k))
				k++;

			prefixTable[q]=k;

		} 


		/*for(q=0;q<m;q++)
			System.out.println(" "+prefixTable[q]);

		*/


	}



	void KMPMatch()
	{


		int k=0;
		int q;


		for(q=0;q<n;q++)
		{

			while( k>0 &&  text.charAt(q) != pattern.charAt(k))
				k=prefixTable[k-1];


			if(text.charAt(q)==pattern.charAt(k))
				k++;

			if(k==m)
			{
				System.out.println("Found  at "+(q-k+2));
				k=prefixTable[m-1];
			}


			

			


		}



	}


	


	

}


class KMPDemo
{

	public static void main(String args[]) throws IOException
	{


		KMP k=new KMP();

		k.getText();
		k.prefix();
		k.KMPMatch();

	}

}
