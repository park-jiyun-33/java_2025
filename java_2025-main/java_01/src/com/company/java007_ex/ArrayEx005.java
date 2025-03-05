package com.company.java007_ex;

public class ArrayEx005 {
	public static void main(String [] args) {
		int[][] arr = {
				   { 1, 1, 1,},  // 00 01 02
				   { 2, 2, 2,},  // 10 11 12
				   { 3, 3, 3,},  // 20 21 22
				   { 4, 4, 4,},  // 30 31 32
				   };

		int total=0;  double avg=0.0;
		
		
		// 총점에 00의 데이터 누적 ... total += arr[0][0];  total += arr[0][kan];
		// 총점에 01의 데이터 누적 ... total += arr[0][1];  total += arr[0][kan];
		// 총점에 02의 데이터 누적 ... total += arr[0][2];  total += arr[0][kan];
		for(int ch = 0; ch < arr.length; ch++) { // 층의 정보 4
			for(int kan = 0; kan < arr[ch].length; kan++) {  // 칸의 정보 3
				total += arr[ch][kan];		
			} //avg = total / (double)(arr.length * ch);  // 한층이 끝날때 처리해야할일
		}
		avg = total / (double)(arr.length * arr[0].length);  // 평균 = total /갯수(층갯수 * 칸갯수)
		
		System.out.println("총점 : " + total + "\n" +
						   "평균 : " + avg );

	}
}
