package javaInterview;

import java.util.Scanner;

public class Array 
{
	public static void avgOfFixedNum()
	{		
		//find the average of nos using array
		int numbers[] = new int[6];
		numbers[0] = 2;
		numbers[1] = 4;
		numbers[2] = 7;
		numbers[3] = 1;
		numbers[4] = 8;
		numbers[5] = 2;
		
		int sum = 0;
		for(int i=0; i<numbers.length; i++)
		{
			sum = sum+numbers[i];
			System.out.println(sum);
		}
		System.out.println("sum= "+sum);
		double avg = sum/6;
		System.out.println("avg= " +avg);		
		
	}
	
	public static void avgOfNthNumber()
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
	}

	public static void main(String[] args) {
		
		avgOfFixedNum();
	}
}
