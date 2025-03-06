package com.company.java007_ex;

public class Array2Ex004 {
	public static void main(String [] args) {
		
		char[][] arr = new char[2][3];
		
		/*
		A B C 
		B C D  
		*/
		
		char d = 'A';
		for(int ch = 0; ch < arr.length; ch++) { // 층 
			for(int kan = 0; kan < arr[ch].length; kan++) { // 칸
				System.out.print((arr[ch][kan] = d++) + "\t");
			} d ='B';    // 칸이 끝나고 할일
			System.out.println();
		}
		
		
	}
}
