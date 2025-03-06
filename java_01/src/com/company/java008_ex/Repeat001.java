package com.company.java008_ex;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		char ch = ' ';
		String st = "";
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자를 하나 입력하세요 : ");
		ch = scanner.next().charAt(0);
		
		if(ch == 'j') {st = "java";}
		else if(ch == 'h') {st = "html";}
		else if(ch == 'c') {st = "css";}
		else {st = "잘못입력하셨습니다.";}
		
		System.out.print(st);
	}
}
