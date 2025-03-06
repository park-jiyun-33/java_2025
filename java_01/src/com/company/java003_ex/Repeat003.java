package com.company.java003_ex;

import java.util.Scanner;

public class Repeat003 {
	public static void main(String [] args) {
		int kor, eng, mash, total;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		kor = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		mash = scanner.nextInt();
		
		total = kor + eng + mash;
		avg = total / 3.0;
		
		System.out.printf("총점 : %d \n평균 : %.2f", total, avg);
	}
}
