package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx001 {
	public static void main(String [] args) {
		
		int num;
		String nu = " ";
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		num = scanner.nextInt();
		
		switch (num) {
		case 3 : System.out.println("봄"); break;
		case 6 : System.out.println("여름"); break;
		case 9 : System.out.println("가을"); break;
		case 12 : System.out.println("겨울"); break;
		}
		
		switch (num) {
		case 3 : nu = "봄"; break;
		case 6 : nu = "여름"; break;
		case 9 : nu = "가을"; break;
		case 12 : nu = "겨울"; break;
		}
		System.out.println(nu);
	}
}
