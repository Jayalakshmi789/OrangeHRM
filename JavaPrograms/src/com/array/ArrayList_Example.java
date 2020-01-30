package com.array;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Example {

	public static void main(String[] args)
	
	{

   /* List<Integer> array=new ArrayList<>();
    
    array.add(1);
    array.add(2);
    array.add(3);
    
    for(int i=0;i<array.size();i++)
    {
    	System.out.println(array.get(i));
    }
    
    System.out.println("*******************");
    
    for(Integer index:array)
    {
    	System.out.println(index);
    }*/

   /* List<String> array=new ArrayList<>();
    
    array.add("hello");
    array.add("qwerty");
    
    for(int i=0;i<array.size();i++)
    {
    	System.out.println(array.get(i));
    }
    
    System.out.println("*******************");
    
    for(String index:array)
    {
    	System.out.println(index);
    
	}*/
		List<Object> array=new ArrayList<>();
		array.add("hello");
		array.add(123);
		array.add(34.567);
		array.add('A');
		array.add("asdfg");
		
		System.out.println(array);
		
		
		System.out.println("****************************");
		
		for(int i=0;i<array.size();i++)
	    {
	    	System.out.println(array.get(i));
	    }
	    
	    System.out.println("*******************");
	    
	    for(Object index:array)
	    {
	    	System.out.println(index);
	    }
		
	}

}
