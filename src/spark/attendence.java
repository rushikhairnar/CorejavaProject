package spark;
import java.util.*;
public class attendence {
	public static void main(String []args)
	{
		int x,y,per;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter no of class held x= ");
		x=obj.nextInt();
		System.out.println("enter no of class attend y= ");
		y=obj.nextInt();
		
		per=((y*100)/x);
		
		System.out.println("per= "+per);
		
		if(per>=75)
		{
			System.out.println("you are eligible for exam.");
		}
		else
		{
			System.out.println("you are not eligible for exam.");
		}
	}

}
