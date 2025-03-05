package com.company.java004_ex;

import java.util.Scanner;

public class IfEx002 {
	public static void main(String [] args) {
		// 숫자 입력
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		num = scanner.nextInt();
		
		// 양수라면 양수 / 음수라면 음수 / 0이라면 zero
		if(num > 0) {
			System.out.println("양수");
		} else if(num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("zero");
		}
	}
}
