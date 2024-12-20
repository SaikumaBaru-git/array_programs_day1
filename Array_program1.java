/*
 * Question 1:
 Write a Java program to create an integer array of size 5.
 Initialize the array with the numbers 10, 20, 30, 40, and 50,
 and display all the elements using a for loop.
 */
package com.sai.array_practice;

public class Array_program1 
{

	public static void main(String[] args) 
	{
		int[] num = { 10,20,30,40,50};
		System.out.print("array is ");
		for(int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+" ");
	    }
	}
}
