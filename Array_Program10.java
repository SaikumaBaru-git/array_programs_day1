/*
 * Question 10:
 Print all elements in reverse order of an Array.
                    
 Input as: 1 2 3 4 5
 Output as: 5 4 3 2 1
 */
package com.sai.array_practice;

import java.util.Scanner;

public class Array_Program10
{
      public static void main(String[] args)
     {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("enter array size :");
    	 int size = sc.nextInt();
    	 int[] num=new int[size];
    	 System.out.println("enter array "+size+" elements");
    	 for(int i=0;i<size;i++)
    	 {
    		 num[i]=sc.nextInt();
    	 }
    	 
    	 int temp=0;
    	 System.out.println(" array is :");
    	 for(int i=0;i<num.length;i++)
    	 {
    		 System.out.print(" "+num[i]);
    	 }
    	 
    	 for(int i=0;i<num.length/2;i++)
    	 { 
    		 temp=num[i];//1
    		 num[i]= num[num.length-i-1];//5
    		 num[num.length-i-1]=temp;//
    	 }
    	 System.out.println("\n sorted  array : ");
    	 for(int i=0;i<num.length;i++)
    	 {
              System.out.print(" "+num[i]);
    	 }
    	  sc.close();
    	  
    	  
    	  
     }
}
