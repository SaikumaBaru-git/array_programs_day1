/*
 * Question 2:
 Write a program to store array dynamically by reading the size 
 and elements from the user.
 Input as: 
 Enter size of the array:6
 Enter 6 elements: 1 2 3 4 5 6
 Output is: 
 Array elements are: 1 2 3 4 5 6
 */
package com.sai.array_practice;

import java.util.Scanner;

public class Array_program2 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size ");
		
		int size= sc.nextInt();
		int[]s1=new int[size];
		System.out.println("enter array "+size+" elements");
		for(int i=0;i<size;i++)
		{
			s1[i]=sc.nextInt();
			
     	}
		System.out.print("array elements are :");
		for (int i = 0; i < s1.length; i++) 
	    {
	        System.out.print(s1[i] + " ");
	    }
		sc.close();
	}
}
