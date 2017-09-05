class Mythread extends Thread
{
		public void run()
		{
			for(int i=0;i<10;i++)
			  System.out.println("HI Fool");

		}
}
class Mythread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		  System.out.println("Hello Idiot");

	}
}
class Main
{
	public static void main(String args[])
	{
		Mythread m =new Mythread();
		Mythread2 m1=new Mythread2();
		m1.start();
		m.start();
	}
}