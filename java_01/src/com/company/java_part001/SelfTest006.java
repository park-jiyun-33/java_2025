package com.company.java_part001;

import java.util.Scanner;

public class SelfTest006 {
	public static void main(String[] args) {
		// 변수
		int kor;
		String st = "";
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("국어점수를 입력해주세요 : ");
		kor = scanner.nextInt();
		// 처리
		if(kor >= 90) {st = "수";}
		else if(kor >= 80) {st = "우";}
		else if(kor >= 70) {st = "미";}
		else if(kor >= 60) {st = "양";}
		else {st = "가";}
		// 출력
		System.out.println(st);
		
	}
}
