package spark;
import java.util.*;

public class Areaofcircle {
	public static void main(String [] args)
	{
		int r;
		double pi= 3.14,n;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter r= ");
		r=obj.nextInt();
		
		n=pi*r*r;
		System.out.println("areaofcircle= "+n);
	}

}
