package spark;
import java.util.*;
public class convert {
	static void convert(float hours)
	{
		float minutes,seconds;
		
		minutes=hours*60;
		seconds=hours*3600;
		
		System.out.println("minutes"+minutes +"hours"+hours);
		System.out.println("seconds"+seconds +"hours"+hours);
	}
	public static void main(String [] args)
	{
		float hours;
		System.out.println("enter the hours: ");
		Scanner obj=new Scanner(System.in);
		hours=obj.nextFloat();
		convert(hours);
		
	}

}
