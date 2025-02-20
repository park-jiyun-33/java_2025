package com.company.java004_ex;

import java.util.Scanner;

public class IfEx001 {
	public static void main(String [] args) {
	// 평균 입력	
	int avg; 
	String result = "불합격";
	Scanner scanner = new Scanner(System.in);
	System.out.print("평균을 입력하세요 : ");
	avg = scanner.nextInt();
	
	// 60점 이상이면 합격 / 불합격
	// 1)
	if(avg >= 60) {System.out.println("합격");} 
	else {System.out.println("불합격");}
	// 2)
	if(avg >= 60) {System.out.println("합격");} 
	else if(avg < 60) {System.out.println("불합격");}
	// 3) 불합격 -  조건에 맞으면 합격
	if(avg >= 60) {result = "합격";}
	System.out.println(result);
	
	}
}
