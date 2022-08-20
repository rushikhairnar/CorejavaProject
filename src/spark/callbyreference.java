package spark;

public class callbyreference {
	int x=10;
	int y=20;
	public void callbyreference(callbyreference t)
	{
		t.x=100;
		t.y=50;
	}
	public static void main(String[] args)
	{
		callbyreference ts=new callbyreference();
		System.out.println("Before "+ts.x+" "+ts.y);
		ts.callbyreference(ts);
		System.out.println("After "+ts.x+" "+ts.y);
	}
}
