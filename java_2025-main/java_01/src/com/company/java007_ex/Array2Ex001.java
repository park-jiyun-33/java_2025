package com.company.java007_ex;

public class Array2Ex001 {
	public static void main(String [] args) {
		int[][] arr2={{100,200,300},{400,500,600}};
		
		System.out.println("층의 갯수 : " + arr2.length);    // 2층
		System.out.println("칸의 갯수 : " + arr2[0].length); // 3칸
		
		for(int ch = 0; ch<arr2.length; ch++) {  // 1. 몇층? int ch = 0; ch <2; ch++
			for(int kan = 0; kan < arr2[ch].length; kan++) {  // 2. 몇칸
				System.out.print(arr2[ch][kan] + "\t");
			} System.out.println(); // 한층이 끝나고 나면 해야할일
		} // E : ch
		
		
//		for(int ch = 0; ch < 2; ch++) {
//			for(int kan = 0; kan < 3; kan++) {
//				System.out.print(arr2[ch][kan] + "\t");
//		}System.out.println();
//		}
	}
}
