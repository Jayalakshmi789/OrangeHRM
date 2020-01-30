package com.java;

public class Pattern1 {

	public static void main(String[] args) 
	
	{
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"  ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}

	}

}
