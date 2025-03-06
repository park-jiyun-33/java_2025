package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx004 {
	/////////////////////////////////////////
	public static void main(String[] args) {
		// 변수
		 String name  = ""; 
	     int kor, eng, math, total ;
	     float avg = 0.0f; 
	     String pass = "";
	     String jang = "";
	     String star= ""; 
	     
	     Scanner scanner = new Scanner(System.in);
	     
	     // 입력
	     System.out.print("이름 입력하세요 : ");
	     name = scanner.next();
	     System.out.print("국어 점수를 입력하세요 : ");
	     kor = scanner.nextInt();
	     System.out.print("영어 점수를 입력하세요 : ");
	     eng = scanner.nextInt();
	     System.out.print("수학 점수를 입력하세요 : ");
	     math = scanner.nextInt();
	     
	     // 처리
	     total = process_total(kor , eng, math);    // 1. 총점처리
	     avg = process_avg(total);    //2.  평균처리
	     pass = process_pass(avg , kor, eng, math);  
	     jang = process_scholar(  avg  ); 
	     star = process_star(avg);  
	     
	     // 출력
	     line();
	     line2();
	     process_show(name, kor, eng, math, total, avg, pass, jang, star);
	     line2();
	}
	/////////////////////////////////////////
	
	public static int process_total(int kor , int eng, int math) {return kor+eng+math;}
	public static float process_avg(int total) { return total/3f;}
	public static String process_pass(float avg , int kor, int eng, int math) {
		return avg < 60? "불합격" : kor < 40 || eng < 40 || math < 40? "재시험" : "합격"; // 제일 작은 조건 먼저 보기!
//		return avg >= 60 && kor >=40 && eng >=40 && math >= 40 ? "합격" : "불합격";
		}
	public static String process_scholar(float avg) {
		return avg < 95 ? " " : "장학생";  // 조건이 작은 걸 먼저 처리하면 경우의 수가 작아짐!
//		return avg >= 95 ? "장학생" : " ";
		}
	public static String process_star(float avg) {
		String star = "";
		for(int i = 0; i < (int)avg/10; i++) {star += "*";} return star;}
	public static void process_show(String name, int kor, int eng, int math, int total, float avg, String pass, String jang, String star) {
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" +  math + "\t" +  total + "\t" + String.format("%.2f", avg) + "\t" +  pass + "\t" +  jang + "\t" +  star);}
	
	public static void line() {System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");}
	public static void line2() {System.out.println("--------------------------------------------------------------------------------------------");}
}
