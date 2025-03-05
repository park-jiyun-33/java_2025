package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {
	public static void main(String [] args) {
		// 문자 입력
		char ch = ' ';
		String result = "문자를 입력하세요 : ";
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 입력하세요 : ");
		ch = scanner.next().charAt(0);
		
		// 대문자인지 이면 소문자로, 소문자이면 대문자로 변경
//		if (ch >= 'A' && ch <= 'Z') {
//			System.out.println((char)(ch + 32));
//		} else if(ch >= 'a' && ch <= 'z') {
//			System.out.println((char)(ch - 32));
//		}
		
		if (ch >= 'A' && ch <= 'Z') { result = "" +(ch += 32);} 
		else if(ch >= 'a' && ch <= 'z') {result = "" + (ch -= 32);}
		
		System.out.println(result);
		
	}
}
