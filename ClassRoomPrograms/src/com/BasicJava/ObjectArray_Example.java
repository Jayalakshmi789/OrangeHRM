package com.BasicJava;

public class ObjectArray_Example {

	public static void main(String[] args) {
				
		// Object array is capable of saving/storing different dataType values
		
		Object array1[] = new Object[4];
		
		array1[0] = "Selenium";
		array1[1] = 101;
		array1[2] = 10.123;
		array1[3] = 'm';
				for(int k=0;k<array1.length;k++)
		{
			System.out.println(array1[k]);
		}
	}
}
