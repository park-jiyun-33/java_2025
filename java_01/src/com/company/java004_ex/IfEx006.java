package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006 {
	public static void main(String [] args) {
		// 숫자 입력
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		num = scanner.nextInt();
		
		// 홀수면 남자, 짝수면 여자 출력
		if(num %2 == 0) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		
	}
}
