/*Question 8:
 Calculate Sum of Array Elements.
 Input as: 1 2 3 4 5
 Output as: 15
 */
package com.sai.array_practice;

import java.util.Scanner;

public class Array_program8 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("enter array size : ");
		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.println("enter array "+size+" elements");
		for(int i =0;i<size;i++)
		{
			num[i]=sc.nextInt();	
		}		
	    System.out.print("array elements are :");
	    for(int i =0;i<num.length;i++)
	    {
	    	System.out.print(" "+num[i]);
	    	sum+=num[i];
	    }
	    System.out.println("\n array elemensts sum is :"+sum);
	    sc.close();
	}

}
