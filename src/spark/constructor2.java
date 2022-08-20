package spark;



	class Cricketer1
	{
		String name;
		String team;
		int age;
		
		public
			Cricketer1()
			{
				name=" ";
				team=" ";
				age=0;
			}
		Cricketer1(String n,String t,int a)
		{
			name=n;
			team=t;
			age=a;
		}
		Cricketer1(String name,int age)
		{
			this.name=name;
			
			this.age=age;
		}
		Cricketer1(Cricketer1 ckt)
		{
			name=ckt.name;
			team=ckt.team;
			age=ckt.age;
		}
		public String toString()
		{
			return "name= " +name +" team= " +team +"age= " +age;
		}
	}
	
	public class constructor2 {
		public static void main(String[] args)
		{
			Cricketer1 c1=new Cricketer1();
			Cricketer1 c2=new Cricketer1("Sachin","india",42);
			Cricketer1 c3=new Cricketer1(c2);
			Cricketer1 c4=new Cricketer1("Dhoni","india",26);
			System.out.println(c2);
			System.out.println(c3);
			System.out.println(c4);
			c1.name="Virat";
			c1.team="india";
			c1.age=32;
			System.out.println(c1);
		}

	}

