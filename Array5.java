package com.mypackage.arrays;

public class Array5 {

	public static double computeVolume(int[] dimensions)
    {
 
        int l = dimensions[0];
        int b = dimensions[1];
        int h = dimensions[2];
         return (l * b * h);
    }
	public static void main(String[] args) {
		double volume= computeVolume(new int[] {2,6,7});
	    System.out.println(volume);

	}

}
