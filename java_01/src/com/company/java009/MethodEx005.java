package com.company.java009;

import java.util.Arrays;

public class MethodEx005 {
	
	public static void upper(char []ch) { // 주소값 -> 참조해서 값을 변경
		System.out.print("2. upper. 배열의 주소 : " + System.identityHashCode(ch));
		// 대문자로 변경 [A, B, C]
		for(int i = 0; i < ch.length; i++) {ch[i] -= 32;} 
	} 
	
	///////////////////////////////////////////
	public static void main(String[] args) {
		 char[] ch = {'a','b','c'};
		    upper(ch);   
		    System.out.println("main. 배열값 : "+ Arrays.toString(ch));
	}
	
}
