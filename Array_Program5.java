
/*Question 5:
 Write a java program to find the middle elements of a given array. 
 If array is odd then print only the middle element, if array is even then
 print both the middle elements.
 */
package com.sai.array_practice;

import java.util.Scanner;

public class Array_Program5 
{
	public static void main(String[] args)
	{
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size :");
		int size = sc.nextInt();
		int[] num = new int[size];
		System.out.println("enter array "+size+" elements");
				for(int i =0;i<size;i++)
				{
					num[i]=sc.nextInt();	
				}
		if(size%2==0)
		{
		    System.out.println("array size is even then middele elements are :");
		    System.out.println(num[(size/2)-1]+","+num[(size/2)]);
		}
		else if(size%2!=0)
		{
			System.out.println("array size is odd then miidele element are :");
			System.out.println(num[(size/2)]);
		}
		sc.close();
		}

}
