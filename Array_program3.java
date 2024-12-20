/*
 * Question 3:
 Create a program that accepts the size of an array from the user,
 initializes the array with random numbers between 1 and 100, and 
 prints the array.
 */
package com.sai.array_practice;

import java.util.Scanner;

public class Array_program3 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size :");
		int size = sc.nextInt();
		int s2[] = new int[size];
		System.out.println("enter array "+size+" elements");
		for(int i=0;i<size;i++ )
		{
			s2[i]=sc.nextInt();	
		}
		for (int i = 0; i < s2.length; i++) 
	    {
			
			if(s2[i]>=1&&s2[i]<=100)
		{
			System.out.print(" "+s2[i]);
		}
	       
	    }
		
		sc.close();

	}

}
