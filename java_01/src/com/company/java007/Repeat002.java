package com.company.java007;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		char a = ' ';
		
		System.out.println("문자를 입력하세요 : ");
		a = scanner.next().charAt(0);
		
		switch(a) {
		case 'a' : System.out.println("apple"); break;
		case 'b' : System.out.println("banana"); break;
		case 'c' : System.out.println("coconut"); break;
		}
		
	}
}
