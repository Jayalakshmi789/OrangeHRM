package com.array;

public class MultiDimensionalArray {

	public static void main(String[] args) 
	
	{

     String array1[][]=new String[2][2];
     
     array1[0][0]="ManualTesting";
     array1[0][1]="Madhukar";
     
     array1[1][0]="Automation";
     array1[1][1]="Srini";
     
    /* for(int i=0;i<2;i++)
     {
    	 for(int j=0;j<2;j++)
    	 {
    		 System.out.print(array1[i][j]+ " ");
    	 }
    	 System.out.println();
     }*/
     
     
     
     /*OUTPUT================
 ManualTesting  Madhukar  
     Automation  Srini*/
     
     
for(int i=0;i<=1;i++)
{
	for(int j=0;j<=1;j++)
	{
		System.out.print(array1[i][j]+ "  ");
	}
	
	System.out.println();
}
	}

}
