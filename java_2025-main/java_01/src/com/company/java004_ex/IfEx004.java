package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004 {
	public static void main(String [] args) {
		// 문자 입력
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 입력하세요 : ");
		ch = scanner.next().charAt(0); 
		
		// 대문자인지 소문자인지 판별
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자");
		} else if(ch >= 'a' && ch <= 'z') {
			System.out.println("소문자");
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
}
