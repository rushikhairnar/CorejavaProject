package spark;
class Cricketer
{
	String name;
	String team;
	int age;
	
	public
		Cricketer()
		{
			name=" ";
			team=" ";
			age=0;
		}
	Cricketer(String n,String t,int a)
	{
		name=n;
		team=t;
		age=a;
	}
	Cricketer(Cricketer ckt)
	{
		name=ckt.name;
		team=ckt.team;
		age=ckt.age;
	}
	public String toString()
	{
		return "name= " + name + "team= " +team + "age= " +age;
	}
}
public class constructor {
	public static void main(String[] args)
	{
		Cricketer c1=new Cricketer();
		Cricketer c2=new Cricketer("Sachin","india",42);
		Cricketer c3=new Cricketer(c2);
		System.out.println(c2);
		System.out.println(c3);
		c1.name="Virat";
		c1.team="india";
		c1.age=32;
		System.out.println(c1);
	}

}