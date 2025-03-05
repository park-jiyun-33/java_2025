package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx003 {
	public static void main(String [] args) {
		// Q2. 대문자 입력 받아서 소문자로 변경 프로그램
		
		// 변수
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.print("대문자를 입력하시오 : ");
		ch = scanner.next().charAt(0);
		//   "A(0)B(1)C(2)D(3)"
		
		// 처리 (1)
		// ch += 32;   // ch = (ch + 32) - 자동형변환
		
		// 처리 (2)
		ch = (char)(ch + 32);  // ch(char:2byte) + 32(int:4byte)
		
		// 출력
		System.out.println(ch);
	}
}
