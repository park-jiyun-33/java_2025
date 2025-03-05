package com.company.java_part001;

import java.util.Scanner;

public class SelfTest012 {
	public static void main(String[] args) {
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~100사이를 입력하세요 : ");
		num = scanner.nextInt();
		
		while(!(num >= 0 && num <= 100)) {
			System.out.print("1~100사이를 입력하세요 : ");
			num = scanner.nextInt();
		}
		System.out.print(num);
	}
}
