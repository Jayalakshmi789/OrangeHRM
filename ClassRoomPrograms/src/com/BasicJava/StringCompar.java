package com.BasicJava;

public class StringCompar {

	public static void main(String[] args) {
		
		String var1="LiveTech";
		String var2="LiveTech";
		
		if(var1.equals(var2))
		{
			System.out.println(" Both var1 and var2 are Equal ");
		}
		else
		{
			System.out.println( " Both the variables are not Equal ");
		}
		
		System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ");
		
		
		String var3="Livetech";
		String var4="LiveTech";
		
		if(var3.equalsIgnoreCase(var4))
		{
			System.out.println(" Both variables are Equal ");
		}
		else
		{
			System.out.println( " Both the variables are not Equal ");
		}
		
		System.out.println(" ******************************* ");
		
		String var5=" Livetech";
		String var6="LiveTech";
		
		if(var5.equalsIgnoreCase(var6))
		{
			System.out.println(" Both variables are Equal ");
		}
		else
		{
			System.out.println( " Both the variables are not Equal ");
		}
		
		System.out.println(" &&&&&&&&&&&&&&&&&&&&&&&&&&&&& ");
		
		int var5Lenght=var5.length();
		System.out.println(" The length of var5 variable is : "+var5Lenght);
		
		System.out.println(" ------------------------------------ ");
		
		String var7="Live";
		String var8="LiveTech";
		
		if(var7.contains(var8))
		{
			System.out.println(" String existing ");
		}
		else
		{
			System.out.println(" String No existing ");
		}
		
		System.out.println(" =================================== ");
		
		int var9=var5.length();
		int var10=var6.length();
		
		/*if(var9>var10)
		{
			System.out.println(" Var9 is greater than Var10 ");
		}
		else
		{
			System.out.println("Var10 is greater than Var9 ");
		}*/
		
		if(var5.length()>var6.length())
		{
			System.out.println(" Var9 is greater than Var10 ");
		}
		else
		{
			System.out.println("Var10 is greater than Var9 ");
		}
		
	String	var11=var5.toUpperCase();
	System.out.println(var11);
	String var12=var5.toLowerCase();
	System.out.println(var12);
	}
}
