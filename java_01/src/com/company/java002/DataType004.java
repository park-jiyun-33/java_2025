package com.company.java002;

import java.util.Scanner;

public class DataType004 {
	public static void main(String [] args) {
		// 변수
		int kor, eng, mash, total; double avg;
		Scanner sanner = new Scanner(System.in);
		
		// 입력
		System.out.print("국어 점수를 입력하시오 : ");
		kor = sanner.nextInt();
		System.out.print("영어 점수를 입력하시오 : ");
		eng = sanner.nextInt();
		System.out.print("수학 점수를 입력하시오 : ");
		mash = sanner.nextInt();
		
		// 처리
		total = kor + eng + mash;
		avg = total / 3.0;
		
		//출력
//		System.out.println("총점 : " + total + "\n" + "평균 : " + avg);
		System.out.printf("총점 : %d \n평균 : %.2f", total, avg);
	}
}
