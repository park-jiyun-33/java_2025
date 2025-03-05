package com.company.java004_ex;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String [] args) {
		int a;
		String st = " ";
		
		Scanner sn = new Scanner(System.in);
		
		System.out.print("숫자를 하나 입력하세요 : ");
		a = sn.nextInt();
		
		if(a == 1) {st = "1이다.";}
		else if(a == 2) {st = "2이다.";}
		else if(a == 3) {st = "3이다.";}
		
		System.out.println(st);
		
	}
}
