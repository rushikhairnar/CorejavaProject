package spark;

public class bike {
	 int speedlimit=90;
	
	public void run()
	{
		speedlimit=400;
		System.out.println("speedlimit= "+speedlimit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bike b1=new bike();
		b1.run();
	}

}
