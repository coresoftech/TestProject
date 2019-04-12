package testing;

import java.util.ArrayList;
import java.util.List;

public class arraylistParameter 
{
	public static List<Integer> arl = new ArrayList<Integer>();
	
		//static int ar[] = {1,4,3,1,3,5,5,6,9,70};
		
		static int eachValue = 0;
		static int sum= 0;
		static int avg;
		 
		
		public static int sum(int a, int b)
		{
			for(int i=0; i<arl.size(); i++)
			{
				eachValue = arl.get(i);
				sum = sum + eachValue;
			}
			System.out.println("sum = "+sum);
			return sum;
		}

		public static int avg(int a, int b)
		{
			for(int i=0; i<arl.size(); i++)
			{
				eachValue = arl.get(i);
				sum= sum+ eachValue;
			}
			avg = sum/arl.size();
			System.out.println("avg = "+avg);
			return avg;
		}
		
		public static int max()
		{
			int maxvalue = arl.get(0);
			
			for(int i=0; i<arl.size(); i++)
			{
				eachValue = arl.get(i);
				if(eachValue > maxvalue)
				{
					maxvalue = eachValue;
				}
			}
			System.out.println("maxvalue = "+maxvalue);
			return maxvalue;
		}
		
		public static int min()
		{
			int minvalue = arl.get(0);
			
			for(int i=0; i<arl.size(); i++)
			{
				eachValue = arl.get(i);
				if(eachValue < minvalue)
				{
					minvalue = eachValue;
				}
			}
			System.out.println("minvalue = "+minvalue);
			return minvalue;
		}
		
		public static int duplicate()
		{
			int duplicatevalue = 0;
			int arCount = arl.size();
			
			for(int i=0; i<arCount; i++)
			{
				for(int j= i+1; j<arCount; j++)
				{
					if(arl.get(i)==arl.get(j))
					{
						duplicatevalue = arl.get(i);
						System.out.println("duplicate value = "+duplicatevalue);
					}
				}						
			}		
			return duplicatevalue;
		}
		
		
		
		
		
		public static void main(String[] args)
		{
			arraylistParameter obj = new arraylistParameter();
			arl.add(1);
			arl.add(3);
			arl.add(6);
			arl.add(4);
			arl.add(90);
			arl.add(8);
			arl.add(4);
			arl.add(6);
			
			sum(9, 10);
			avg(1, 17);
			max();
			min();
			duplicate();			
		}
}
