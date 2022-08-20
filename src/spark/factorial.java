package spark;

import java.util.*;

public class factorial {

	public static void main(String[] args) 
	{
		int i,n,fact=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter number: ");
		n=obj.nextInt();
		for(i=1;i<=n;i++)
		//while(n!=1)
		{
			fact=fact*i;
		//	n=n-1;
		}
		System.out.println("factorial: "+fact);
	}

}
