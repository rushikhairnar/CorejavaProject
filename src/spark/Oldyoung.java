package spark;
import java.util.*;
public class Oldyoung {
	public static void main(String []args)
	{
		int age1,age2,age3,max,min;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter age of first person: ");
		age1=obj.nextInt();
		
		System.out.println("Enter age of Second person: ");
		age2=obj.nextInt();
		
		System.out.println("Enter age of third person: ");
		age3=obj.nextInt();
		
		if(age1>age2 && age1>age3)
		{
			System.out.println("First person is oldest");
		}
		else if(age2>age1 && age2>age3)
		{
			System.out.println("Second person is oldest");
		}
		else if(age3>age1 && age3<age2)
		{
			System.out.println("Third person is oldest");
		}
		else
		{
			System.exit(0);
		}
		if(age1<age2 && age1<age3)
		{
			System.out.println("First person is youngest");
		}
		else if(age2<age1 && age2>age3)
		{
			System.out.println("Second person is youngest");
		}
		else if(age3>age1 && age3>age2)
		{
			System.out.println("Third person is youngest");
		}
	}
}
