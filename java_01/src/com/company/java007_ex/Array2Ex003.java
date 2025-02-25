package com.company.java007_ex;

public class Array2Ex003 {
	public static void main(String [] args) {
		int[][] arr = new int[2][3];  // 00 01 01
									  // 10 11 12
		
		/*
		 arr[0][0] = 101;
		 arr[0][1] = 102;
		 arr[0][2] = 103;
		 
		 arr[1][0] = 104;
		 arr[1][1] = 105;
		 arr[1][2] = 106;
		 */
		
		int d = 101;
		for(int ch = 0; ch < arr.length; ch++) {
			for(int kan = 0; kan < arr[ch].length; kan++) {
				System.out.print((arr[ch][kan] = d++) + "\t");
			} System.out.println();
		}
		
	}
}
