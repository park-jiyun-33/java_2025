package com.company.java007;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String [] args) {
		char a = ' ';
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자를 하나 입력하세요 : ");
		a = scanner.next().charAt(0);
		
		if(a == 'a') {System.out.println("apple");}
		else if(a == 'b') {System.out.println("banana");}
		else if(a == 'c') {System.out.println("coconut");}
	}
}
