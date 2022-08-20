package spark;
import java.util.*;
public class working {
	public static void main(String args[])
	{
		int age;
		char sex;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the sex: ");
		sex=obj.next().charAt(0);
//		System.out.println("enter age");
//		age=obj.nextInt();
		System.out.println("enter age");
		age=obj.nextInt();
		
		
		if(sex=='f')
		{
			System.out.println("She will work only is urben.");
		}
		
		else if(sex=='m' && age>20 && age<40)
			{
				System.out.println("he will may work anywhere.");
			}	
		
		else if(sex=='m' && age>40 && age<60)
		{
			System.out.println("he will work in urban areas.");
		}
		else
		{
			System.out.println("ERROR");
		}
	}
}
				
	


