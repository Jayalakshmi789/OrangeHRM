package com.BasicJava;

public class MultiDimensionalArray_Example {

	public static void main(String[] args) {
		
		String array1[][] = new String[2][2];
		
		array1[0][0] = "Manual Testing";
		array1[0][1] = " Madhukar";
		
		array1[1][0] = " Automation";
		array1[1][1] = "Srini";
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
			System.out.print(array1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
