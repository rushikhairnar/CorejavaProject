package spark;
import java.util.*;
class car1
{
	private
		int model;
		String name;
		double price;
	public
		void accept()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("enter model: ");
			model=obj.nextInt();
			System.out.println("enter name: ");
			name=obj.next();
			System.out.println("enter car price: ");
			price=obj.nextDouble();
	}
		void display()
		
	
		{
			System.out.println("model: "+model);
			System.out.println("car name: "+name);
			System.out.println("car price: "+price);
		}
	
}
public class car {
	public static void main(String [] args)
	{
		car1 c1=new car1();
		c1.accept();
		c1.display();
	}

}
