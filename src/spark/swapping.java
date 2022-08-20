package spark;
import java.util.*;

public class swapping {
	public static void main(String[] args)
	{
		int a,b;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a= ");
		a=obj.nextInt();
		
		System.out.println("enter b= ");
		b=obj.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
// 		b=a-b;
		
		System.out.println("After swapping a="+a +" b="+b);
		
		
	}

}
