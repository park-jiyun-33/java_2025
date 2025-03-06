package com.company.java005_ex;

import java.util.Scanner;

public class Repeat005_2 {
	public static void main(String [] args) {
		// 변수
		int num1, num2;
		char ch = ' ';
		double st = ' ';
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		for(;;) {
			System.out.print("1. 숫자를 입력하세요 : ");
			num1 = scanner.nextInt();
			if(num1 <= 100 && num1 >= 0) {break;}
		} // 숫자1 무한반복
		for(;;) {
			System.out.print("2. 숫자를 입력하세요 : ");
			num2 = scanner.nextInt();
			if(num2 <= 100 && num2 >= 0) {break;}
		} // 숫자2 무한반복
		for(;;) {
			System.out.print("3. 연산자를 하나 입력하세요 : ");
			ch = scanner.next().charAt(0);
			if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {break;}
		} // 연산자 무한반복
		
		// 처리
		if(ch == '+') {st = num1 + num2;}
		else if(ch == '-') {st = num1 - num2;}
		else if(ch == '*') {st = num1 * num2;}
		else if(ch == '/') {st = num1 / (double)num2;}
		
		// 출력
		// 연산자가 '/'이면 소숫점 
		// ch != '/' ? "" + (int)st : String.format("%.2f", st)
		System.out.println("" + num1 + ch + num2 + " = " +  
							(ch != '/' ? "" + (int)st : String.format("%.2f", st)) 
							);
		
	}
}
