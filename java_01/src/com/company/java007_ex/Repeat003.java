package com.company.java007_ex;

public class Repeat003 {
	public static void main(String[] args) {
		int[] arr = new int[3];
	
		int d = 10;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = d; d += 10;
			System.out.print((arr[i]) + "\t");
		} 
		
	}
}
