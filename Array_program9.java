/*
 * Question 9:
 Find Average of Array Elements.
 Input as: 1 2 3 4 5
 Output as: 3
 */
package com.sai.array_practice;

import java.util.Scanner;

public class Array_program9 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size ");
		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.println("enter array "+size+" elements");
		for(int i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			System.out.print(" "+num[i]);
			sum+=num[i];
		}
		System.out.println("\n array average is  : "+sum/num.length);
		
		sc.close();
	}

}
