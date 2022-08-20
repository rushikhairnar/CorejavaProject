package spark;
import java.util.*;
public class Array5add2matrix {
	public static void main(String args[])
	{
		int[][]		a=new int[3][3];
		int[][]		b=new int[3][3];
		int[][]		c=new int[3][3];
		int i,j;
		
		Scanner obj=new Scanner (System.in);
		
		System.out.println("enter a matrix:");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("enter b matrix: ");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				b[i][j]=obj.nextInt();
			}
		}
		System.out.println("Addition: ");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print("\t "+c[i][j]);
			}
			System.out.print("\n");
		}
		
	}

}
