package spark;

public class ST_employee {
	int eid;
	String ename;
	static String company_name="Spark";
	
	public
		void show()
		{
			System.out.println(eid+ " "+ename+" "+company_name);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ST_employee se1=new ST_employee();
		se1.eid=104;
		se1.ename="Abhijeet";
		se1.show();
		
		ST_employee se2=new ST_employee();
		se2.eid=108;
		se2.ename="Rushi";
		se2.show();
		
	}

}
