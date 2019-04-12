package coreJava;

public class Multidimensional 
{
	public static void main(String[] args) {
		
		int a[] [] = new int [3] [3];
		
		a[0] [0] = 2;
		a[0] [1] = 4;
		a[0] [2] = 5;
		a[1] [0] = 3;
		a[1] [1] = 7;
		a[1] [2] = 4;
		a[2] [0] = 0;
		a[2] [1] = 9;
		a[2] [2] = 6;
		
		
		//System.out.println(a[1] [0]);
		
		//int b[] [] = {{2,4,5}, {3,4,7}, {5,2,1}, {8,9,6}};
		
		//System.out.println(b[2] [1]);
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0;j<3; j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		
	}

}
