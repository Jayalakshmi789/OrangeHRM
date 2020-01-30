package com.Inherit;

public class Test2 extends Test1 {
	
	
	
	public void method3()
	{
		System.out.println(" Method3 executed Successfully ");
	}

	public static void main(String[] args) {
		
		Test2 t2 = new Test2();
		t2.method1();
		t2.method3();

	}

}
