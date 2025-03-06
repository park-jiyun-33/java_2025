package com.company.java005;

import java.util.Scanner;

public class RepeatEx006 {
	public static void main(String [] args) {
	
		////// 메뉴판 만들기
		// RepeatEx006 - 무한반복을 하는데 9를 입력받으면 종료
		
		// 변수
		int num = -1;
		
		Scanner scanner = new Scanner(System.in);
		
		// 기능1) 2. 입력 3. 처리 4. 출력
		
		for(;;) {  // # 1-1 무한반복
			System.out.println("메뉴판입니다 \n9. 종료 > ");
			num = scanner.nextInt();
			if(num == 9) {break;}  // # 1-2 빠져나올조건
		}
		
	}
}
