package com.company.java018;

public class JavaIO006_String_StringBuffer {
	public static void main(String[] args) {
		// #1. String 문자열 누적
		String str = "ABC";							// 925858445
		System.out.println("1. str의 주소 > " + str + " " + System.identityHashCode(str) );
		
		str += "D";									// 989110044
		System.out.println("2. str의 주소 > "  +str + " " + System.identityHashCode(str) );
		
		
		// #2. StringBuffer 문자열 누적
		StringBuffer sb = new StringBuffer();
		sb.append("ABC");								// 142257191
		System.out.println("3. sb의 주소 > "  +sb + " " + System.identityHashCode(sb) );
		
		sb.append("D");									// 142257191
		System.out.println("4. sb의 주소 > "  +sb + " " + System.identityHashCode(sb) );
	}
}
