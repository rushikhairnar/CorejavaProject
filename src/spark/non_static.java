package spark;

public class non_static {
	static int x;
	int y;
	
	public void increment()
	{
		x++;
		y++;
		
		System.out.printn(x);
		System.out.printn(y);
		

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		non_static.x=10;
	}

}
