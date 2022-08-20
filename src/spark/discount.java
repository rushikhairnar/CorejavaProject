package spark;
import java.util.*;
public class discount {
	public static void main(String [] args)
	{
		int unit;
		double tc,dis;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter quantity: ");
		unit=obj.nextInt();
		
		tc=unit*100;
		System.out.println("totalcost= "+tc);
		
		if(tc>100)
		{
			dis=tc*10/100;
			tc=tc-dis;
			System.out.println("totalcost= "+tc);
		}
		else
		{
			System.out.println("Final cost= "+tc);
		}
	}
}
