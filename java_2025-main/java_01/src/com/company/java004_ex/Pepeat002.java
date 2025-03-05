package com.company.java004_ex;

import java.util.Scanner;

public class Pepeat002 {
	public static void main(String [] args) {
		int a;
//		String s = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 하나 입력하세요 : ");
		a = scanner.nextInt();
		
		switch(a) {
		case 1 : System.out.print("1이다."); break; 
		case 2 : System.out.print("2이다."); break; 
		case 3 : System.out.print("3이다."); break; 
		}
		
//		switch(a) {
//		case 1 : s = "1이다."; break; 
//		case 2 : s = "2이다."; break; 
//		case 3 : s = "3이다."; break; 
//		}
//		
//		System.out.println(s);
	}
}
