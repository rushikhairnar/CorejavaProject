package spark;

public class calculate {
	
		void sum(int a,int b)
		{
			System.out.println("sum is= "+(a+b));
		}
		void sum(float a,float b)
		{
			System.out.println("sum is= "+(a+b));
		}
		public static void main(String[] args)
		{
			calculate c1=new calculate();
			c1.sum(7,8);
			//c1.sum(2.4f),(1.5f);
			c1.sum(2.4f, 1.5f);
		}
	}


