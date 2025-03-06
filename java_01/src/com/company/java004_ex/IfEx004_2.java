package com.company.java004_ex;

import java.util.Scanner;

public class IfEx004_2 {
	public static void main(String [] args) {
		char ch = ' ';
		String result = "알파벳만 가능합니다.";
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자를 입력하세요 : ");
		ch = scanner.next().charAt(0); 
		
		// 대문자인지 소문자인지 판별
		
		if(ch >= 'A' && ch <= 'Z') {result ="대문자";} 
		else if(ch >= 'a' && ch <= 'z') {result ="소문자";} 
		else {result ="잘못입력하셨습니다.";}
		
		System.out.println(result);
	}
}
