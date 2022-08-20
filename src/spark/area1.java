package spark;

public class area1 {
	void find(int l,int b)
	{
		System.out.println("Area is: "+(l*b));
	}
	void find(int l,int b, int h)
	{
		System.out.println("Area is: "+(l*b*h));
	}
	public static void main(String[] args)
	{
		area1 ar=new area1();
		ar.find(8,5);
		ar.find(4,5,6);
	}
}
