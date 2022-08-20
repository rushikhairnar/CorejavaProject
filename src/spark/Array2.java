package spark;
import java.util.*;
public class Array2 {
	public static void main(String [] args)
	{
		int[] a=new int[5];
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter array elements");
		for(i=0;i<=4;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Display array: ");
		for(i=4;i>=0;i--)
		{
			System.out.print("\t "+a[i]);
		}
	}

}
