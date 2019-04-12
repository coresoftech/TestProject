package testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class array 
{
	static int ar[] = {1,4,3,1,3,5,5,6,9,70};
	
	static int eachValue = 0;
	static int sum=0;
	static int avg;
	 
	
	public static int sum()
	{
		for(int i=0; i<ar.length; i++)
		{
			eachValue = ar[i];
			sum= sum+ eachValue;
		}
		System.out.println("sum = "+sum);
		return sum;
	}

	public static int avg()
	{
		for(int i=0; i<ar.length; i++)
		{
			eachValue = ar[i];
			sum= sum+ eachValue;
		}
		avg = sum/ar.length;
		System.out.println("avg = "+avg);
		return avg;
	}
	
	public static int max()
	{
		int maxvalue = ar[0];
		
		for(int i=0; i<ar.length; i++)
		{
			eachValue = ar[i];
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
		int minvalue = ar[0];
		
		for(int i=0; i<ar.length; i++)
		{
			eachValue = ar[i];
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
		int arCount = ar.length;
		
		for(int i=0; i<arCount; i++)
		{
			for(int j= i+1; j<arCount; j++)
			{
				if(ar[i]==ar[j])
				{
					duplicatevalue = ar[i];
					System.out.println("duplicate value = "+duplicatevalue);
				}
			}						
		}		
		return duplicatevalue;
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		array obj = new array();
		sum();
		avg();
		max();
		min();
		duplicate();
		
	}
}
