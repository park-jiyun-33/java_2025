package com.company.java002;

import java.util.Scanner;

public class DataType003 {
	public static void main(String [] args) {
		// 1. 기본형 - 기본형 / 참조형
		// 2. 기본형 - 논리, 정수(byte:1-short:2-★int:4-long:8), 실수(float-★double)
		
		// gigo - 변수 - 입력 - 처리 - 출력
		// 변수 (7자리 : float / 15자리 : double)
		float pi = 0.0f;
		Scanner scanner = new Scanner(System.in);
		
		
		// 입력
		System.out.print("실수를 입력하세요 : "); 
		pi = scanner.nextFloat();
		
		// 처리
		
		// 출력
		System.out.println("파이값은 " + pi + "입니다.");
		System.out.printf("파이값은 %f입니다.", pi);
		System.out.printf("파이값은 %.2f입니다.", pi);
		System.out.printf("파이값은 %.3f입니다.", pi);
	}
}
