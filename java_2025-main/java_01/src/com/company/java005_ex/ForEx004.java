package com.company.java005_ex;

public class ForEx004 {
	public static void main(String [] args) {
		// 1~10까지 3의 배수 갯수를 출력 
		
		// 변수
		int a = 0;
		String result = "3의배수 : ";
		
		// 처리
		// ver 1
		// 만약 1이 3의 배수라면 갯수 카운트   출력구문  3  ,6  ,9
		// 만약 2이 3의 배수라면 갯수 카운트  
		// 만약 3이 3의 배수라면 갯수 카운트  
		// ver 2
		// if(만약 1이 3의 배수라면){갯수 카운트 ,1}
		// if(만약 2이 3의 배수라면){갯수 카운트 ,2}
		// if(만약 3이 3의 배수라면){갯수 카운트 ,3}
		// ver 3
		// if(1%3 == 0) {a++;  result += (a==1?"":",") +1;}
		// if(2%3 == 0) {a++;  result += (a==2?"":",") +2;}
		// if(3%3 == 0) {a++;  result += (a==3?"":",") +3;}
		for(int i = 1; i <= 10; i++ )
		{if(i%3 == 0) {a++; result += (a == 1? "" : ", ") + i;}}
		
		// 출력
		System.out.println(result + "\n갯수 : " + a);
	}
}
