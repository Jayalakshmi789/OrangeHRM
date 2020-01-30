package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		List<Object>array1 = new ArrayList<>();
		
		array1.add("Hello");
		array1.add("Chello");
		
		array1.add(123);
		array1.add('M');
		array1.add(123.456);
		array1.add("Pollo");
		
				//for(int i=0;i<3;i++)
		for(int i=0;i<array1.size();i++)
		{
			System.out.println(array1.get(i));
		}
		
		System.out.println(" ########################################### ");
		
		// for each loop 
		for(Object index:array1)
		{
			System.out.println(index);
		}
	}

}
