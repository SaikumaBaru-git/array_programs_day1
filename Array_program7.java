/*Question 7:
 Write a java program to print all even elements and odd elements separately
 from an array.

 Input as  : 1 2 3 4 5 6 7
 Even elements are : 2 4 6
 Odd elements are : 1 3 5 7
 */
package com.sai.array_practice;

import java.util.Scanner;

public class Array_program7 {
	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      System.out.println("enter array size :");
	int size = sc.nextInt();
	int[] num= new int[size];
	System.out.println("enter array "+size+" elements");
	for(int i =0;i<size;i++)
	{
		num[i]=sc.nextInt();	
	}
	int i;
	System.out.println("even numbers are ");
	for( i=0;i<num.length;i++)
	{
	    if(num[i]%2==0)
	    	System.out.print(" "+num[i]);
	}
	    System.out.println("\n odd numbers are ");
		for( i=0;i<num.length;i++)
		{
		    if(num[i]%2!=0)
		    	System.out.print(" "+num[i]);
		 }
	sc.close();
	}
}

