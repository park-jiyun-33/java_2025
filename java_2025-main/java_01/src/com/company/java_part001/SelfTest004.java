package com.company.java_part001;

import java.util.Scanner;

public class SelfTest004 {
	public static void main(String[] args) {
		int kor, eng;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어점수를 입력해주세요 : ");
		kor = scanner.nextInt();
		System.out.print("영어점수를 입력해주세요 : ");
		eng = scanner.nextInt();
		
		if(kor < 40) {System.out.println("국어과락");}
		if(eng < 40) {System.out.println("영어과락");}
	}
}
