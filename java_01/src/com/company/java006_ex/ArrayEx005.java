package com.company.java006_ex;

public class ArrayEx005 {
	public static void main(String [] args) {
		int sum = 0, sum1 = 0;
		char[] ch = {'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		for(int i = 0; i < ch.length; i++) {
			if(ch[i] >= 'a' && ch[i] <= 'z') {sum++;} // sum += 1;
			else {sum1++;}
		};
		System.out.println("대문자 : " + sum1 + "개\n" +"소문자 : " + sum + "개");
		
	}
}
