package com.company.java007;

public class ArrayEx007 {
	public static void main(String [] args) {
		
		char[] arr = new char[5];  // 공간만 빌리기
		
		char a = 'A';
		for(int i = 0; i < arr.length; i++) {
			arr[i] = a; a++;
			
			System.out.print(arr[i] + "\t");
		}
		
	}
}
