package spark;

class library1 {
	String bname;
	String bauthor;
	double bprice;
	
	public
		library1()
		{
			bname="java";
			bauthor="rushi";
			bprice=354;
		}
		library1(String n,String s,int p)
		{
			bname=n;
			bauthor=s;
			bprice=p;
		}
		library1(String name,int price)
		{
			this.bname=name;
			this.bprice=price;
		}
		library1(library1 lbr)
		{
			bname=lbr.bname;
			bauthor=lbr.bauthor;
		}
		public String toString()
		{
			return "bname= " + bname + "bautor= " +bauthor + "bprice= " +bprice;
		}
}
public class library {
		public static void main(String[] args)
			{
				library1 l1=new library1();
				library1 l2=new library1("python","richie",4245);
				library1 l3=new library1(l2);
				library1 l4=new library1("java",5675);
				System.out.println(l1);
				System.out.println(l2);
				System.out.println(l3);
				System.out.println(l4);
			}

}


