package com.BasicJava;

public class MethodExample2 {
	int i=50;
	int j=30;
	
	public void add()
	{
		int c;
		int z=i+j;
		
		System.out.println(" The value of z is: "+ z);
	}
	public static void main(String[] args) {
		
		int i=10;
		int j=20;
		System.out.println(i);
		System.out.println(j);
		int c;
		c=i+j;
		System.out.println(" Main Method c value is :"+c);
		
		MethodExample2 m = new MethodExample2();
		m.add();

	}

}
