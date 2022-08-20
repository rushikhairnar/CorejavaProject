package spark;

public class callbyvalue {
	public void callbyval(int x)
	{
		x=100;
	}
	public static void main(String[] args)
	{
		int x=50;
		callbyvalue c1=new callbyvalue();
		c1.callbyval(x);
		System.out.println(x);
	}

}
