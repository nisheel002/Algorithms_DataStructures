import java.lang.String;
import java.lang.System;


class Permutation
{


	int count=0;

	void permute(StringBuffer sb,int lb,int ub)
	{

		int i;


		if(lb==ub)
		{
			System.out.println(sb);
			count++;
			return;

		}

		for(i=lb;i<=ub;i++)
		{
			//swap(sb,lb,i);
			shiftBackward(sb,lb,i);
			permute(sb,lb+1,ub);
			shiftForward(sb,lb,i);
			//swap(sb,lb,i);
		}


	}


	void swap(StringBuffer sb,int i,int j)
	{

		char temp;

		temp=sb.charAt(i);

		sb.setCharAt(i,sb.charAt(j));
		sb.setCharAt(j,temp);

	}

	void shiftBackward(StringBuffer sb,int i,int j)
	{
		char temp=sb.charAt(j);
		

		while(j>i)
		{
			sb.setCharAt(j,sb.charAt(j-1));
			j--;
		}

		sb.setCharAt(i,temp);

	}

	void shiftForward(StringBuffer sb,int i,int j)
	{

		char temp=sb.charAt(i);
		

		while(i<j)
		{
			sb.setCharAt(i,sb.charAt(i+1));
			i++;
		}

		sb.setCharAt(j,temp);

	}



	public static void main(String args[])
	{

		StringBuffer sb=new StringBuffer();

		sb.append("abcd");

		Permutation p=new Permutation();

		p.permute(sb,0,sb.length()-1);

		System.out.println("total count="+p.count);

	}





}



