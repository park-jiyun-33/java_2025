package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx002 {
	public static void main(String [] args) {
		int kor, eng, math, total, lv;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 : ");
		kor = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		avg = total / (double)3;
		lv = (int) (avg / 10);
		
		System.out.println("::GOOD IT SCORE::");
//		System.out.printf("국어 : %d 영어 : %d 수학 : %d 총점 : %d 평균 : %.2f 레벨 : %d", kor, eng, math, total, avg, lv);
		System.out.println("국어\t영어\t수학\t총점\t평균\t레벨");
		System.out.printf("%d\t%d\t%d\t%d    %.2f\t%d",kor,eng,math,total,avg,lv);
				
	}
}
