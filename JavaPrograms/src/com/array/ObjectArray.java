package com.array;

public class ObjectArray {

	public static void main(String[] args) 
	
	{
		Object array[]=new Object[4];
		
		array[0]="Hello";
		array[1]=123;
		array[2]=12.567;
		array[3]='A';
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		

	}

}
