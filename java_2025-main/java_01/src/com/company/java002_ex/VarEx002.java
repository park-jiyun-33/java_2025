package com.company.java002_ex;

public class VarEx002 {
	public static void main(String [] args) {
		int a = 10;
		int b = 3;
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " * " + b + " = " + (a * b));
		System.out.println(a + " / " + b + " = " + (a / b));
		
		System.out.printf("%d + %d = %d\n", a, b, a + b);
		System.out.printf("%d - %d = %d\n", a, b, a - b);
		System.out.printf("%d * %d = %d\n", a, b, a * b);
		System.out.printf("%d / %d = %d\n", a, b, a / b);
		
		System.out.printf("%d / %d = %f\n", a, b, a/(float)b);
		
		double b2 = 3;
		System.out.println(a + " / " + b2 + " = " + (a / b2));
		System.out.printf("%d / %f = %f", a, b2, a/b2);
		
	}
}	
