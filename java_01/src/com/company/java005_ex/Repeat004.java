package com.company.java005_ex;

import java.util.Scanner;

public class Repeat004 {
	public static void main(String [] args) {
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.print("1.종료\t 2.반복\t 3.반복\n숫자를 입력하세요 : ");
			a = scanner.nextInt();
			
			if(a == 1) {System.out.println("종료"); break;}
		}
	}
}
