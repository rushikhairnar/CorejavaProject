package spark;
import java.util.*;
class student
{
	private
		int rollno;
		String name;
		double marks;
	public
		void accept()
		{
			Scanner obj=new Scanner(System.in);
			System.out.println("enter rollno: ");
			rollno=obj.nextInt();
			System.out.println("enter name: ");
			name=obj.next();
			System.out.println("enter marks: ");
			marks=obj.nextDouble();
		}
	void display()
	{

		System.out.println("rollno: "+rollno);
		System.out.println("name: "+name);
		System.out.println("marks: "+marks);
	}	
}
public class Stud {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student();
		{
			s1.accept();
			s1.display();
		}

	}

}
