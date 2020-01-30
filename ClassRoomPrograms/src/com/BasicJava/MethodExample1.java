package com.BasicJava;

public class MethodExample1 
{
	
	public void Test1()
	{
		int i=10;
		System.out.println(" The value of the variable i is : "+i);
	}
	
	public static void main(String []args)
	{
	
		// creating an object to the class
		MethodExample1 m = new MethodExample1();
		
		// performing the operation realted to use defined Method
		m.Test1();
		
		m.Test1();
	}
	
	public void Test2()
	{
		int j=20;
		System.out.println(" The value of the variable i is : "+j);
	}

}
