package com.methods;

public class Userdefinemethod 

{
	public void test()
	{
		int i=10;
		System.out.println("The value of variable i is :"+ i);
	}

	public static void main(String[] args) 
	
	{
		Userdefinemethod m=new Userdefinemethod();
		m.test();
		m.test1();

	}
	
	public void test1()
	{
		int j=20;
		System.out.println("The value of variable j is :"+ j);
	}

	

}
