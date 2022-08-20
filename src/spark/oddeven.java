package spark;
import java.util.*;
public class oddeven {
	public static void main(String []args)
	{
		int n;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter n= ");
		n=obj.nextInt();
		
		if(n%2==0)
		{
			System.out.println("no is odd");
		}
		else
		{
			System.out.println("no is even");
		}
	}

}
