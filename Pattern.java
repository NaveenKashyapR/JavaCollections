package com.naveen.practise;

public class Pattern {

	public static void main(String[] args) {
		
		int row=5;
		int col=5;
		pattern(row,col);

	}

	private static void pattern(int row, int col) {
		System.out.println(col/2);
		int i,j;
		for( i=0;i<row;i++)
		{for( j=row-i;j>1;j--)
		{
			System.out.print(" ");
		}
			for( j=0;j<=i;j++)
			{
			System.out.print("*");
		}
			
			System.out.println(); 
		}
		}

}
