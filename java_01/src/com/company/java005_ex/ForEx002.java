package com.company.java005_ex;

import java.util.Scanner;

public class ForEx002 {
	public static void main(String [] args) {
		// 구구단
		int a;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요 : ");
		a = scanner.nextInt();
		
		
		for(int i = 1; i <= 9; i++)
		{System.out.println(a + "*" + i + "=" + (a*i));}
		
	}
}
