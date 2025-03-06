package com.company.java010_ex;

import java.util.Scanner;
// 1. 클래스는 부품객체
// 2. 상태(멤버변수) 행위(멤버함수)
class Card{
	//상태-멤버변수  : 채널/볼륨 
	int cardNum; boolean  isMembership;   
	//행위-멤버함수  : x
	// Card(){} 생략되어있음. 컴파일러가 자동생성
	
	
	@Override
	public String toString() {
		return "Card [cardNum=" + cardNum + ", isMembership=" + isMembership + "]";
	}
	// 1. Card() : 생성자오버로딩시 컴파일러가 기본생성자 자동생성 취소 
	// 2. Card() : 기본생성자 많이 사용 기본세팅 - cardNum = 1; isMembership=true; 
	public Card() {this.cardNum = 1; this.isMembership=true;} 
	public Card(int cardNum, boolean isMembership) {super();this.cardNum = cardNum;this.isMembership = isMembership;}
		
	}
public class ClassEx005 {
	public static void main(String[] args) {
		Card  c1= new Card();                                     
		System.out.println(c1);  // Card [cardNum=0, isMembership=true]  
		
		Card c2 = new Card(3, false); 
		System.out.println(c2);
	
	}
}
