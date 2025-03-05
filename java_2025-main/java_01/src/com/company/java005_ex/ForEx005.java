package com.company.java005_ex;

public class ForEx005 {
	public static void main(String [] args) {
		// 소문자 a~z까지 모음의 갯수를 출력 : a, e, i, o, u
		int a = 0;
		
		for(char i = 'a'; i <= 'z'; i++)
		{switch(i) {case 'a' : 
					case 'e' : 
					case 'i' : 
					case 'o' : 
					case 'u' : a += 1; break;}}
		
//		{if(i == 'v') {a ++;}
//		else if(i == 'o') {a ++;}
//		else if(i == 'w') {a ++;}
//		else if(i == 'e') {a ++;}
//		else if(i == 'l') {a ++;}}
		
		System.out.println("모음의 갯수 : " + a + "개");
	}
}
