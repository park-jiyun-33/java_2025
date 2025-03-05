package com.company.java007;

import java.util.Arrays;

public class Array2_001 {
	public static void main(String [] args) {
		
		int[][] arr = { {1, 2, 3},   // 00 01 02
						{4, 5, 6}    // 10 11 12
					  };
		System.out.println(Arrays.toString(arr));  // 주소 [[I@372f7a8d, [I@2f92e0f4]
		System.out.println(Arrays.deepToString(arr));  // 값 [[1, 2, 3], [4, 5, 6]]
		
		// ver-1 : 눈에 보이는대로
		System.out.println(arr[0][0] + "\t" + arr[0][1] + "\t" + arr[0][2]);
		System.out.println();
		
		System.out.println(arr[1][0] + "\t" + arr[1][1] + "\t" + arr[1][2]);
		System.out.println();
		
		// ver-2 : 칸 정리
		for(int kan = 0; kan < 3; kan++) {System.out.print(arr[0][kan] + "\t");}
		System.out.println();
		
		for(int kan = 0; kan < 3; kan++) {System.out.print(arr[1][kan] + "\t");}
		System.out.println();
		
		// ver-3 : 층 정리
		for(int ch = 0; ch <2; ch++) {
		for(int kan = 0; kan <3; kan++) {System.out.print(arr[ch][kan] + "\t");}
		System.out.println();
		}
		// 이중 for 완성!
		
	}
}
