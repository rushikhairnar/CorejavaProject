package spark;
import java.util.*;
public class array_multiplication{
	public static void main(String[] args)
	{
		int [][] a=new int[3][3];
		int [][] b=new int[3][3];
		int [][] c=new int[3][3];
		int i,j,k,r1,c1;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter row and column");
		r1=obj.nextInt();
		c1=obj.nextInt();
		
		System.out.println("enter a matrix: ");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		System.out.println("enter b matrix: ");
		for(i=0;i<=r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				b[i][j]=obj.nextInt();
			}
		}
		System.out.println("multiplication: ");
		for(i=0;i<r1;i++)
		{
			for(j=0;i<c1;j++)
			{
				c[i][j]=0;
			
				for(k=0;k<r1;k++)
				
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
					System.out.print("\t"+c[i][j]);
			}
				System.out.print("\n");
			}
		}
	}
	

