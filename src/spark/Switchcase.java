package spark;
import java.util.*;
public class Switchcase {
	public static void main(String [] args)
	{
		int n;
		int ch;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter n= ");
		n=obj.nextInt();
	
		
			int i,j,sum=0;temp=0,a=0,rem;
			System.out.println("1.arm 2.palindrome");
			System.out.println("Enter your choice: ");
			ch=obj.nextInt();
			switch(ch)
			{
//			
			case 1:
				
				
				i=n%10;
				sum=sum+(i*i*i);
				n=n/10;
				break;
			case 2:
				
				
				rem=n%10;
				j=i*10+rem;
				n=n/10;
				break;
				
		}
	}

}
