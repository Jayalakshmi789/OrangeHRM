package com.java;

public class Demo
{
	   public static void main(String args[])
	   {
	      try{
	         int num1=30, num2=0;
	         int output=num1/num2;
	         System.out.println ("Result: "+output);
	      }
	      catch(ArithmeticException e1){
	         System.out.println ("You Shouldn't divide a number by zerooo");
	      }
	      catch(Exception e){
		         System.out.println ("You Shouldn't divide a number by zero");
		      }
	   }
	}