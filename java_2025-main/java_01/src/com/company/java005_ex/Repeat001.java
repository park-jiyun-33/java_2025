package com.company.java005_ex;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String [] args) {
		
		int a = 0;
		String st = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 하나 입력하세요 : ");
		a = scanner.nextInt();
		
		if(a == 10) {st = "10이다.";}
		else if(a == 20) {st = "20이다.";}
		else if(a == 30) {st = "30이다.";}
		
		System.out.println(st);
	}
	
	
}
