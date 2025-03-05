package com.company.java006_ex;

public class ArrayEx005_2 {
	public static void main(String [] args) {
		// 대소문자 변경 -+ 32
		char[] ch = {'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] >= 'a' && ch[i] <= 'z') {System.out.print((char)(ch[i] - 32));}
			else {System.out.print((char)(ch[i] + 32));}
		};
	}
}
