package com.company.java004_ex;

import java.util.Scanner;

public class IfEx007 {
	public static void main(String [] args) {
		int num1, num2;
		char ch = ' ';
		String result = " ";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 하나 입력해주세요 : ");
		num1 = scanner.nextInt();
		System.out.print("정수 하나 입력해주세요 : ");
		num2 = scanner.nextInt();
		System.out.print("연산자를 입력해주세요 : ");
		ch = scanner.next().charAt(0);
		
		if(ch == '+') {result = "" + (num1 + num2);} 
		else if(ch == '-') {result = "" + (num1 - num2);} 
		else if(ch == '*') {result = "" + (num1 * num2);} 
		else if(ch == '/') {result = String.format("%.2f", (num1/(float)num2));}
		
		System.out.println("" + num1 + ch + num2 + " = " + result);
		
		
//		if(ch == '+') {
//		System.out.println("" + num1 + ch + num2 + "=" + (num1 + num2));
//	} else if(ch == '-') {
//		System.out.println("" + num1 + ch + num2 + "=" + (num1 - num2));
//	} else if(ch == '*') {
//		System.out.println("" + num1 + ch + num2 + "=" + (num1 * num2));
//	} else if(ch == '/') {
//		System.out.println("" + num1 + ch + num2 + "=" + 
//		                    String.format("%.2f" , (num1 /(float)num2));
//	}
	
	}
}
