package com.company.java007_ex;

public class Array2Ex007 {
	public static void main(String[] args) {
		
		int[][] arr2 = new int[5][5];
		
		int d = 1;
		for(int ch = 0; ch < arr2.length; ch++) {
			for(int kan = 0; kan < arr2[ch].length; kan++) {
				arr2[ch][kan] = d++;
				System.out.print(arr2[ch][kan] + "\t");
			} System.out.println();
		}
		
	}
}
