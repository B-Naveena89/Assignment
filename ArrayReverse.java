package com.mypackage.arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int []intArr= {12,34,56,54};
		System.out.println("Original Array:");
		for(int i=0;i<intArr.length;i++)
		{
		   System.out.println(intArr[i]);
		   
		}
       System.out.println("\n");
       System.out.println("Reverse Array:");
       for(int i=intArr.length-1;i>=0;i--)
       {
    	   System.out.println(intArr[i]);
       }
	}

}
