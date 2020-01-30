package com.java;

public class Pattern3 {

	public static void main(String[] args) 
	
	{
		for(char i='A';i<='D';i++)
		{
			for(char j='D';j>=i;j--)
			{
				System.out.print(j +" ");
			}
			
			System.out.println();
		}

	}

}
