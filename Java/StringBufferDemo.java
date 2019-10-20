
import java.lang.String;
import java.lang.System;


class StringBufferDemo
{

	


	public static void main(String args[])
	{

		StringBuffer sb;

		sb=new StringBuffer();
		sb.append("Hello World 2014 !");

		int i=0;

		while(i < sb.length())
		{ 
			if(sb.charAt(i)=='4')
				sb.setCharAt(i,'5');


			i++;

		}


		System.out.println(sb);
		
	}

}
