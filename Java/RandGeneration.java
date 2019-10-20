import java.util.Random;

class RandGeneration
{

	public static void main(String args[])
	{
		Random r=new Random();

		//int num;

		for(int i=0;i<15;i++)
			System.out.println(r.nextInt(20));

	}


}