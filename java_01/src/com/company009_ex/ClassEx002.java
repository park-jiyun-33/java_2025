package com.company009_ex;

import java.util.Scanner;

// 1. 클래스는 부품객체이다.
// 2. 클래스는 상태(멤버변수)와 행위(멤버함수)
class MyPrice001{
	// 멤버변수
	 String name;  int price;
	// 멤버함수
	 void input()  { // 입력받는 기능 
	 Scanner scanner = new Scanner(System.in);
	 System.out.print("상품 이름 입력 > "); this.name = scanner.next();
	 System.out.print("상품 가격 입력 > "); this.price = scanner.nextInt();
	 }
	 void show() { // 출력해주는 기능
		 System.out.println("상품 정보입니다\n" +
				 			"상품 이름 : " + this.name + "\t/ "+
				 			"상품 가격 : " + this.price); 
	 }
}// E : class

public class ClassEx002 {
	public static void main(String[] args) {
		 MyPrice001 p1 = new MyPrice001();
		 // 3-1 new 공간빌리기, 객체생성  3-2) MyPrice001() 초기화  3-3) p1 주소
	     p1.input(); 
	     p1.show();
	}
}
/* 클래스(설계도) - 인스턴스화(실제객체) - 객체(인스턴스들,,,,)/인스턴스 p1.name
------------------------------------  [runtime data area]
[method:정보, static, final:공용정보]  MyPrice001.class  /  ClassEx002.class
------------------------------------------------------------------------
[heap:동적]                                 |[stack:잠깐빌리기]
28번째줄 :1번지                               p1.show();  1번지.show     { }
27번째줄 :1번지 {name = apple, price = 1000}  p1.input(); 1번지.input(); { }
25번째줄 :1번지 {name = null, price = 0}      ← p1:1번지
                                           |main
                
------------------------------------------------------------------------
 * */

