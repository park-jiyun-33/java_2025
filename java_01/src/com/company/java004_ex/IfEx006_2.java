package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006_2 {

	public static void main(String[] args) {
		// 숫자 입력
			int num;
			String result = "여자";
				
			Scanner scanner = new Scanner(System.in);
			System.out.println("숫자를 입력하세요 : ");
			num = scanner.nextInt();
				
		// 홀수면 남자, 짝수면 여자 출력
			if(num %2 == 1) {result = "남자";} 
			
			System.out.println(result);
				
	}

}
