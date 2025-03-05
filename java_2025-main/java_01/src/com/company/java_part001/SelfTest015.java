package com.company.java_part001;

public class SelfTest015 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		int d = 1;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = d++;
			System.out.print(arr[i] + "\t");
		}
	}
}
