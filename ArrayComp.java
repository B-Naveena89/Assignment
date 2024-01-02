package com.mypackage.arrays;

public class ArrayComp {

	public static void main(String[] args) {
	    int arr1[]= {12,34,67,12};
	    int arr2[]=arr1;
	    int arr3[]= {12,53,90};
	    
	    if (arr1==arr2)
	    {
	    	System.out.println("Both are same");
	    }
	    else
	    {
	    	System.out.println("Both are not same");
	    }
	    if(arr3==arr2)
	    {
	    	System.out.println("Both arrays are equal");
	    }
	    else
	    {
	    	System.out.println("Both arrays are  not equal");
	    }

	}

}
