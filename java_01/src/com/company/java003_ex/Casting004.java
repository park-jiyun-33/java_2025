package com.company.java003_ex;

public class Casting004 {
	public static void main(String [] args) {
		short sh1 = 1;  // sh1 [1]
		short sh2 = 2;  // sh2 [2]
		//short result = sh1 + sh2;
		short result = (short)(sh1 + sh2);
		// byte(1) < short(2) /char(2) < int
		// 연산시) 1(int) + 2(int)
	}
}
