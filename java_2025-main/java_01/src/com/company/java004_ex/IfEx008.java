package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {
	public static void main(String [] args) {
		// 변수
		String name = " ";
		int kor, math, eng, total;
		double avg;
		String result = "불합격";
		String lv = "수";
		String good = " ";
		
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
		avg = total / (double)3;
		
		// 입력
		if (avg >= 60 && kor >= 40 && math >= 40 && eng >= 40) {
			result = "합격";}
		
		// 평균이 95이상이면 장학생 / 90이상이면 수 / 80이상이면 우
		if (avg >= 95) {good = "장학생";} 
		else if(avg >= 90) {lv = "수";} 
		else if(avg >= 80) {lv = "우";} 
		else if(avg >= 70) {lv = "미";} 
		else if(avg >= 60) {lv = "양";}
		else {lv = "가";}
		
		// 출력
		System.out.println("=================================================================================== ");
		System.out.println("학번\t국어\t수학\t영어\t총점\t평균\t합격여부\t레벨\t장학생");
		System.out.println("=================================================================================== ");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\t%s\t%s",name,kor,math,eng,total,avg,result,lv,good);
		
	}
}
