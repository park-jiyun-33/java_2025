package com.company.java005_ex;

import java.util.Scanner;

public class Repeat005_3 {
	public static void main(String [] args) {
		// 변수
		int num1 = -1, num2 = -1;
		char ch = ' ';
		double st = ' ';
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		// break (빠져나와) / continue(밑에꺼 skip)
		/* for(;;) { 1.1. 무한반복
		 * #todo1 if(잘못썼으면) {숫자1입력받기}  -> if(!(0 <= num1 && num1 <= 100)) {숫자1입력받기}
		 * #todo2 else if(잘못썼으면) {숫자2입력받고}
		 * #todo3 else if(잘못썼으면) {연산자입력받고}
		 * 1-2.   else{빠져나올조건 - 빠져나오기 break;}
		 */
		for(;;) {
			if(!(0 <= num1 && num1 <= 100)) { // 잘쓴범위가 아니라면 입력시도 / 잘쓴범위면 입력시도 x
				System.out.print("숫자1 입력 : "); num1 = scanner.nextInt();
			}
			else if(0 > num2 || num2 > 100) {
				System.out.print("숫자2 입력 : "); num2 = scanner.nextInt();
			}
			else if(!(ch == '+' || ch == '-' || ch == '*' || ch == '/')) {
				System.out.print("연산자 입력 : "); ch = scanner.next().charAt(0); continue;
			} else {break;} //  num1 잘쓴경우, num2 잘쓴경우 ch 잘쓴경우
		}
		
		
//		for(;;) {
//			System.out.print("1. 숫자를 입력하세요 : ");
//			num1 = scanner.nextInt();
//			if(num1 <= 100 && num1 >= 0) {break;}
//		} // 숫자1 무한반복
//		for(;;) {
//			System.out.print("2. 숫자를 입력하세요 : ");
//			num2 = scanner.nextInt();
//			if(num2 <= 100 && num2 >= 0) {break;}
//		} // 숫자2 무한반복
//		for(;;) {
//			System.out.print("3. 연산자를 하나 입력하세요 : ");
//			ch = scanner.next().charAt(0);
//			if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {break;}
//		} // 연산자 무한반복
//		
//		// 처리
//		if(ch == '+') {st = num1 + num2;}
//		else if(ch == '-') {st = num1 - num2;}
//		else if(ch == '*') {st = num1 * num2;}
//		else if(ch == '/') {st = num1 / (double)num2;}
//		
//		// 출력
//		// 연산자가 '/'이면 소숫점 
//		// ch != '/' ? "" + (int)st : String.format("%.2f", st)
//		System.out.println("" + num1 + ch + num2 + " = " +  
//							(ch != '/' ? "" + (int)st : String.format("%.2f", st)) 
//							);
	
	}
}
