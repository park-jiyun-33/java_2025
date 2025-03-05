package com.company.java_part001;

public class SelfTest016 {
	public static void main(String[] args) {
		int[][] arr2 = new int[2][3];
		
		int d = 100;
		for(int ch = 0; ch < arr2.length; ch++) {
			for(int kan = 0; kan < arr2[ch].length; kan++) {
				arr2[ch][kan] = d++;
				System.out.print(arr2[ch][kan] + "\t");
			} d = 200;
			System.out.println();
		}
	}
}
