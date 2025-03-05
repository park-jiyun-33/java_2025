package com.company.java007;

import java.util.Arrays;

public class ArrayEx006 {
	public static void main(String [] args) {
		
		// new 연산자 이용해서 배열만들기
		double[] arr = new double[5];
		
		double a = 1.1;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = a; a += 0.1;
			System.out.print(String.format("%.1f", arr[i])  + "\t");}
		
	}
}
