package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008_2 {
	public static void main(String [] args) {
		// 변수
		String name = " ";
		int kor, math, eng, total;
		float avg = 0.0f;
		String pass = "불합격", jang = "", lv = "가";
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("학번을 입력하세요 : ");
		name = scanner.next().concat(name);
		System.out.print("국어 점수를 입력하세요 : ");
		kor = scanner.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		math = scanner.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng = scanner.nextInt();
		
		// 처리
		total = kor + math + eng;
		avg = total / 3.0f;
		
		// 입력
		if (avg >= 60 && kor >= 40 && math >= 40 && eng >= 40) {pass = "합격";}
		
		// 평균이 95이상이면 장학생 / 90이상이면 수 / 80이상이면 우
		if (avg >= 95) {jang = "장학생";} 
		
		lv = (avg >= 90)? "수" : 
			 (avg >= 80)? "우" :
			 (avg >= 70)? "미" :
			 (avg >= 60)? "양" : "가";
		
		// 출력
		System.out.println("=================================================================================== \r\n"
				+ "학번\t국어\t수학\t영어\t총점\t평균\t합격여부\t레벨\t장학생\r\n"
				+ "=================================================================================== \r\n"
				+ "");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s",name,kor,math,eng,total,avg,pass,lv,jang);
		
	}
}
