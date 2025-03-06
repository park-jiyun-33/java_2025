package com.company.java_part001;

import java.util.Scanner;

public class SelfTest003 {
	public static void main(String[] args) {
		// 변수
		String name = "";
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("당신의 이름을 입력하세요 : ");
		name = scanner.next();
		
		// 출력
		System.out.println("당신의 이름은 " + name + "입니다.");
	}
	
	
}
