package com.company.java_oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Oop010{
	public static int nextInt() throws InputMismatchException{
		Scanner scanner = new Scanner(System.in);
		System.out.print("1을 입력하세요 : ");
		return scanner.nextInt(); // a
	}

	public static void main(String[] args) {
		int one = 0;
		while(true) {
			try {
			one = nextInt(); 
			if(one==1) {break;}
			}catch(Exception e) {System.out.println("오류!");}
			}
	}

}
