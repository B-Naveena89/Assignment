package com.mypackage.arrays;

public class Array10 {

	public static void main(String[] args) {
		int a[][]= {{1,2},{3,5}};
		int b[][]= {{2,1},{4,5}};
		int c[][]= new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
				
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println("\n");
		}
		
			
	}

}
