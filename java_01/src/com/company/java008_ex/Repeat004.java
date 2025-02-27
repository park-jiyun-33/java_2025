package com.company.java008_ex;

public class Repeat004 {
	public static void main(String[] args) {
		
		char[] arr = new char[3];
		
		char data = 'a'; 
		for(int i = 0; i < arr.length; i++) {
			arr[i] = data++;
			System.out.print(arr[i] + "\t");
		}
	}
}
