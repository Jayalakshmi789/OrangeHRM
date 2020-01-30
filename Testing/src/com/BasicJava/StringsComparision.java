package com.BasicJava;

public class StringsComparision {

	public static void main(String[] args)
	
	{
		String var1="Jaya";
		String var2="Jaya";
		
		if(var1.equals(var2))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
		String var3="jaya";
		String var4="Jaya";
		
		if(var3.equalsIgnoreCase(var4))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
		String var5=" Jaya";
		String var6="jaya";
		
		if(var5.equalsIgnoreCase(var6))
		{
			System.out.println("both are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		
		int var5length=var5.length();
		
		System.out.println("the length of var5 is:"+var5length);
		
		String var7="jaya";
		String var8="jayalakshmi";
		
		if(var8.contains(var7))
		{
			System.out.println("string contains");
		}
		else
		{
			System.out.println("not contains");
		}
		
		if(var7.length()>var8.length())
		{
			System.out.println("var7 is greater than var8");
		}
		else
		{
			System.out.println("var8 is greater than var7");
		}

	}

}
