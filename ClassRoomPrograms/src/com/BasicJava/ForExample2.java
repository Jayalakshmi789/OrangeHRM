package com.BasicJava;

public class ForExample2 {

	public static void main(String[] args) {
		
		for(int a=1;a<=3;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
		System.out.println(" @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ ");
		
		for(int x=0;x<=2;x++)
		{
			for(int p=0;p<=x;p++)
			{
				System.out.print(p+1+" ");
			}
			System.out.println();
		}
		
		System.out.println(" $$$$$$$$$$$$$$$$$$$$ ");
		
		for(int i=4;i>=2;i--)
		{
			//for(int j=4;j>=i;j--)
			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
