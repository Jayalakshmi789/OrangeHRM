package com.java;

public class DependentForLoop {

	public static void main(String[] args) 
	{
		
		char i,j;
        for(i = 'D'; i >= 'A'; i--)
        {
        	
        for(j='A'; j<=i;j++)
        {
            System.out.print(j + " ");
	}
        System.out.println();
        }
}
}