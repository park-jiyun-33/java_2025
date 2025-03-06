package com.company.java010_ex;

class Coffee{ 
	// 멤버 변수
	String name; int num, price;
	//멤버 함수
	void show() {System.out.println("=====커피\n" +  
					"커피명 : " + name + "\n" + 
					"커피잔수 : " + num + "\n" +
					"커피가격 : " + price);
	}// 커피정보생성
	// 생성자 - 사용자가 넣어준 값
	public Coffee(String name, int num, int price) {  // 수동작성
		super();
		this.name = name;
		this.num = num;
		this.price = price;}
	
	public Coffee() { name = "아메리카노"; num = 1; price = 2000;}  // 기본생성자 자동생성취소
	} // E : class
public class ClassEx003 {
	public static void main(String[] args) {
		Coffee a1 = new Coffee("까페라떼" ,2 , 4000);  a1.show();
		Coffee a2 = new Coffee();  a2.show();
		  }
	}
