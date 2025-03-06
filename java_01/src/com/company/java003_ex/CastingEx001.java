package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {
	public static void main(String [] args) {
		int num1, num2;
		double result;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요1 : ");
		num1 = scanner.nextInt();
		System.out.print("숫자를 입력하세요2 : ");
		num2 = scanner.nextInt();
		
		result = num1 / (double)num2;
		 
		System.out.printf("%d / %d = %.2f \n",num1, num2, result);           
		System.out.println(num1 + " / " + num2 + " = " + String.format("%.2f", result));
													   //String.format("출력서식", 처리할값);
	}
}
