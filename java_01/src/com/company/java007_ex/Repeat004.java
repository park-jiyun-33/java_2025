package com.company.java007_ex;

public class Repeat004 {
	public static void main(String[] args) {
		int[][] arr2 = new int[2][3]; // 2층 3칸
		
		int d = 0;
		for(int ch = 0; ch < arr2.length; ch++) { // 층의 값
			for(int kan = 0; kan < arr2[ch].length; kan++) { // 칸의 값
				arr2[ch][kan] = (d += 10);
				System.out.print(arr2[ch][kan] + "\t");
			} // 층이 끝나고 할일
			d = 40;
			System.out.println();
		}
	
	
	}
}
