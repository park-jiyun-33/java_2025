package com.company.java_part001;

import java.util.Scanner;

public class SelfTest007 {
	public static void main(String[] args) {
		// 변수
		char ch;
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("a,b,c중에 입력해주세요 : ");
		ch = scanner.next().charAt(0);
		// 처리
		switch(ch) {
		case 'a' : case 'A' : System.out.println("apple"); break;
		case 'b' : case 'B' : System.out.println("banana"); break;
		case 'c' : case 'C' : System.out.println("coconut"); break;
		}
	}
}
