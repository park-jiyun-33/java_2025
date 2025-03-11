package com.company.java_oop_re;

import java.util.InputMismatchException;
import java.util.Scanner;
// throws Exception
// try{예외 발생 가능성이 있는 문장들} catch(예외타입1 매개변수명){예외 발생할 경우 처리 문장}
public class Oop10 {
	public static int nextInt() throws InputMismatchException{
		Scanner scanner = new Scanner(System.in);
		System.out.println("1을 입력하세요 : ");
		return scanner.nextInt(); 
	}
	
	public static void main(String[] args) {
		int one = 0;
		while(true) {
			try {
			one = nextInt();
			if(one == 1) {break;}}
			catch(Exception e) {System.out.println("오류!");}
		}
	}
}
