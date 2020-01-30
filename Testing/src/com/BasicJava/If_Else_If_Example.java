package com.BasicJava;

public class If_Else_If_Example {

	public static void main(String[] args) 
	{
		int x=10;
		int y=30;
		int z=50;
	
		if(x>y && x>z)
		{
			System.out.println("x is greater than y and z");
		}
		
		else if(y>z)
		{
			System.out.println("y greater than x and z");
		}
		
		else
		{
			System.out.println("z is greater than x and y");
		}

	}

}
