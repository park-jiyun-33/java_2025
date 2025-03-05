package com.company.java007;

import java.util.Arrays;

public class Array2_002 {
	public static void main(String [] args) {
		int [][] arr = new int[2][3];  // 2층 3칸 공간만 빌리기
									   // 00 01 02
									   // 10 11 12
		
//		arr[0][0] = 1; arr[0][1] = 2; arr[0][2] = 3;
//		arr[1][0] = 4; arr[1][1] = 5; arr[1][2] = 6;
		
		int d = 1;
		for(int ch = 0; ch < arr.length; ch++) {  // 층
			for(int kan = 0; kan < arr[ch].length; kan++) {  // 칸
			System.out.print(arr[ch][kan] = d++); 
			}
			System.out.println();
			}
		
		
		System.out.println(Arrays.deepToString(arr));
		
	}
}
