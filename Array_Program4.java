/*
 * Question 4:
 Write a Java program to retrieve the value at a specific index from an array.
 Use an array {100, 200, 300, 400, 500} and retrieve the value at index 3.
 */
package com.sai.array_practice;

import java.util.Scanner;

public class Array_Program4 
{
	public static void main(String[] args) 
	{
	int[] num = {100, 200, 300, 400, 500};
	Scanner sc = new Scanner(System.in);
    System.out.println("enter ehich index want with in range :"+num.length+"");
	int i = sc.nextInt();
	System.out.println(i+" index elements is "+num[i]);
	sc.close();
	}
		
	
}
