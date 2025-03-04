package com.company.java003_ex;

import java.util.Scanner;

public class Casting002 {
	public static void main(String [] args) {
		// 1. 문자 초기화
		// 문자는 저장시 숫자 | 출력시 문자
		char ch1 = ' '; // 공백 한 개라도 있어야함
		char ch2 = '\u0000';
		
		System.out.println("1 : " +      ch1 + "\t" +      ch2);
		System.out.println("2 : " + (int)ch1 + "\t" + (int)ch2);
		
		char c = 'A';
		System.out.println("3 : " + c + "\t" + (int)c);
		
		// 2. 문자의 연산
		System.out.println("3 : " + c + "\t" + (int)c); // 65
		System.out.println("4 : " + (c + 1));  // 66
		//1)     +     더하기 연산
		//2) 숫자 + 숫자 더하기
		//3) 'A' + 1 = A1  'A'(char | 2byte) + 1(int | 4byte)
		//3) 결과문 int
		System.out.println("5 : " + (char)(c +1));  //B
		// A(65) - B(66) - C(67)
		
		// byte - short(2byte) - char(2byte) - int
		byte ex1 = 1; // byte(1) + int(4)
		//error) byte result1 = ex1 + 10; // byte(1) + int(4)
		//해결) int result1 = ex1 + 10;
		
		//Q1) 대문자 'A'를 소문자 'a'로 변환시키기
		System.out.println("힌트 : " + 'a' + "\t" + (int)'a');
		// A = 65 | a = 97
		System.out.println( 'A' + " -> " + (char)('A' + 32) );

		char q1 = 'A';
		System.out.println('A' + " -> " + (q1 += 32));
		// q1 += 32   +더하기를하고, =대입. q1의 자료형은 char
		
		// 3. 문자열
		// 자료형의 분류는 기본형(값)과 참조형(주소)
		String str1 = "abc";  // 객체 사용시                str1(주소)
		Scanner scanner = new Scanner(System.in);  // scanner(주소)
		
		System.out.println(str1);
		System.out.println(scanner);
		
		System.out.println(str1.charAt(0));  // a
		System.out.println(str1.charAt(1));  // b
		System.out.println(str1.charAt(2));  // c
		
		//char ch = scanner.nextChar(); // x
		String str = scanner.next(); //
		System.out.println("입력한 문자열 : " + str);
		
		// scanner.next() 문자열 입력 charAt(0) 첫번째 문자
		char ch = scanner.next().charAt(0);
		System.out.println("입력한 문자 : " + ch);
		
	}
}
