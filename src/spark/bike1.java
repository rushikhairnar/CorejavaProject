package spark;

final public class bike1 {
	public
		final void run()
		{
			System.out.println("Running");
		}
}
class Honda extends bike1
{
	//public
	void run()
	{
		System.out.println("Running safely with 100 km");
	}
	public static void main(String[] args)
	{
		Honda h1=new Honda();
		h1.run();
	}
}
