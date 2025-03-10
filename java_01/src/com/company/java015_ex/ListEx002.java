package com.company.java015_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx002 {
	public static void main(String[] args) {
		//1. 
		ArrayList<String> numbers = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		
		//2. 데이터 추가
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
		//3. 사용자에게 숫자 입력받기
		System.out.println("숫자 입력 : ");
		int num = scanner.nextInt();
		
		//ver1
		if(num == 1) {System.out.println(numbers.get(0));}
		else if(num == 2) {System.out.println(numbers.get(1));}
		else if(num == 3) {System.out.println(numbers.get(2));}
		
		//ver2
		for(int i=1; i <= numbers.size(); i++) {
			if(num == i) {System.out.println(numbers.get(i-1)); break;}}
		
		//ver3
		System.out.println(numbers.get(num-1));
		
	}
}
