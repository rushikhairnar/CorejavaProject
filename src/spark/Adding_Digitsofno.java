//sum of digits&Armstrong no
package spark;
import java.util.*;
public class Adding_Digitsofno {	
	public static void main(String[] args)
	{
		int i,n,sum=0;
		//int temp,sum=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the no ");
		n=obj.nextInt();
		//temp=n;
		//for(i=0;i<=n;i++)
		while(n!=0)
		{
			i=n%10;
			sum=sum+i;
			n=n/10;
		}
		System.out.println("sum of digits= "+sum);
//		if(temp==sum)
//		{
//			System.out.println("no is arm ");
//		}
//		else
//		{
//			System.out.println("no is not arm ");
//		}
	}

}
