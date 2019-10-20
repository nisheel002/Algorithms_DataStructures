
import java.util.Random;


class ThreadsProgram implements Runnable
{

	String name;
	int time;
	Random rn;

	ThreadsProgram(String name,int time)
	{

		this.name=name;
		this.time=time;
		rn=new Random();
		

	}


	public void run()
	{
		
		int k;

		try
		{

			System.out.printf("Thread %s is executing\n",name);
			k=rn.nextInt(time);
			System.out.printf("Thread %s is sleeping for %d time ...\n",name,k);
			Thread.sleep(k);
			System.out.printf("Thread %s has done!\n",name);


		}

		catch(Exception e)
		{

			System.out.println("exception ! "+e);


		}
	}
	



}



class ThreadsDemo
{

	public static void main(String args[])
	{

		ThreadsProgram tp1=new ThreadsProgram("one",987);
		ThreadsProgram tp2=new ThreadsProgram("two",876);
		ThreadsProgram tp3=new ThreadsProgram("three",567);
		ThreadsProgram tp4=new ThreadsProgram("four",1800);

		Thread t1=new Thread(tp1);
		Thread t2=new Thread(tp2);
		Thread t3=new Thread(tp3);
		Thread t4=new Thread(tp4);
		

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	}


}
