package com.company.java008_ex;

public class Repeat006 {
	// 1단계) 구조
	public static void hi() { System.out.println("hi");}
	// 2단계) 파라미터-재료
	public static void hi(int a) { System.out.println("hi " + a + "님!");}
	// 3단계) return
	public static String hi(String str) {return "hi " + str;}
	
	public static void main(String[] args) {
		 hi();   // hi 출력
		 hi(1);   // hi 1 님! 출력
		 System.out.println( hi("sally") );   // hi sally 출력

	}
}

