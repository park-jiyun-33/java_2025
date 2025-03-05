package com.company.java004_ex;

import java.util.Scanner;

public class Switch001 {
	public static void main(String [] args) {
		// 변수
		int a = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.print("숫자 하나 입력 : ");
		a = scanner.nextInt();
		
		// 처리 (if, switch / for, while, do while)
		
		// if
		if (a == 1) {
			System.out.println("1이다.");  // if
		} else if(a == 2) {
			System.out.println("2이다.");  // else 아니라면
		} else if(a == 3) {
			System.out.println("3이다.");
		}
		
		System.out.println();
		System.out.println();
		
		// switch
		// break를 만날때 나옴.
		// sc b
		switch(a) {
		case 1 : System.out.println("1이다."); break; // a == 1
		case 2 : System.out.println("2이다."); break; // a == 2
		case 3 : System.out.println("3이다."); break; // a == 3
		}
		
		// 출력
		
		
	}
}
