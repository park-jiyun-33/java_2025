package com.company.java_part001;

import java.util.Scanner;

public class SelfTest005 {
	public static void main(String[] args) {
		// 변수
		int age = 0;
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.println("당신의 나이를 입력하세요 : ");
		age = scanner.nextInt();
		// 처리 출력
		if(age < 19) {System.out.println("당신은 미성년자입니다.");}
		else {System.out.println("당신은 성인입니다.");}
	}
}
