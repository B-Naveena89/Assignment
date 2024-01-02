package com.mypackage.arrays;

public class Array12 {

	public static void main(String[] args) {
		int[] element = {1, 9, 27, 28, 48}; 
	       
	    
	        System.out.println("In  array using for loop in Java:");
	       for (int i = 0; i < element.length; i++) {
	            System.out.println(element[i]);
	        } 
	        System.out.println("In array using forEach() loop in Java:");
	        for (int var : element)
	        {
	            System.out.println(var);
	        }
	}

}
