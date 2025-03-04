package com.company.java_part001;

import java.util.Scanner;

public class SelfTest011 {
	public static void main(String[] args) {
	// 변수
	int num;
	Scanner scanner = new Scanner(System.in);
		
	// 처리	
	for(;;) {
		System.out.print("1~100사이를 입력하세요 : ");
		num = scanner.nextInt();
		if(num >= 0 && num <= 100) {System.out.print(num); break;}
	}
	}
}
