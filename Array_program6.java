/*
 * Question 6:
 Write a java program to add the last and first element of a given array.

 Input as: [1,2,3,4,5,6]
 Output as: 7
 */

package com.sai.array_practice;

import java.util.Scanner;

public class Array_program6 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size :");
		int size = sc.nextInt();
		int[] num = new int[size];
		int sum=0;
		System.out.println("enter array "+size+" elements");
		for(int i =0;i<size;i++)
		{
			num[i]=sc.nextInt();	
		}
		
		for(int i=0;i<num.length;i++)
		 sum = num[0]+num[num.length-1];
		System.out.println("first and last array element sum is :"+sum);
		sc.close();
	}

}
