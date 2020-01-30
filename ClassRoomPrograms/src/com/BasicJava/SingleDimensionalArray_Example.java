package com.BasicJava;

public class SingleDimensionalArray_Example {

	public static void main(String[] args) {
		
		int array1[] = new int[3];
		
		array1[0]=10;
		array1[1]=20;
		array1[2]=30;
		//array1[3]=40;
		//array1[2]="LiveTech";
		
		/*
		System.out.println(array1[0]);
		System.out.println(array1[1]);
		System.out.println(array1[2]);
		*/
		
		//for(int i=0;i<=2;i++)
		//for(int i=0;i<3;i++)
		for(int i=0;i<array1.length;i++)
		{
			System.out.println(i+" " +array1[i]);
		}
	}
}