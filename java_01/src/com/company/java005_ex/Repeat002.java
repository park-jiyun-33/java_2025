package com.company.java005_ex;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String [] args) {
		int a = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 하나 입력하세요 : ");
		a = scanner.nextInt();
		
		switch(a) {
		case 10 : System.out.println("10이다."); break;
		case 20 : System.out.println("20이다."); break;
		case 30 : System.out.println("30이다."); break;
		}
	}
}
