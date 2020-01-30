package com.array;

public class SingleDimensionalArray {

	public static void main(String[] args) 
	
	{
	int array[]=new int[4];
	
	/*// OUTPUT 
	 * 30
	 * 0
	array[0]=10;
	array[2]=30;
	System.out.println(array[2]);
	System.out.println(array[3]); */

	
	/*OUTPUT
	 * 10
	 * 20
	 * 30
	 * 40
	 * array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=40;
	
	System.out.println(array[0]);
	System.out.println(array[1]);
	System.out.println(array[2]);
	System.out.println(array[3]); */
	
	
	/*//OUTPUT=============Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
	array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=40;
	array[5]=20;*/
	
	array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=40;
	
	/*OUTPUT====================
	 * 10
	 * 20
	 * 30
	 * 40 */
	//for(int i=0;i<=3;i++)
	//for(int i=0;i<4;i++)
	
	for(int i=0;i<array.length;i++)	
	{
		System.out.println(array[i]);
	}
	
	
	}

}
