package com.company.java007;

import java.util.Scanner;

public class Repeat000 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		char ch = ' ';
		
		System.out.println("문자를 입력하세요 : ");
		ch = scanner.next().charAt(0);
		if(ch >= 'A' && ch <= 'Z') {System.out.println("대문자");}
		else {System.out.println("소문자");}
		
		int a = 0;
		
		System.out.println("숫자를 입력하세요 : ");
		a = scanner.nextInt();
		
		if(a >= 0 && a <= 100) {System.out.println(a);}
		else {System.out.println("다시 입력해주세요");}
	}
}
