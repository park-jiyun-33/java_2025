package com.company.java006;

public class Repeat007 {
	public static void main(String [] args) {
		// 1. for 
		for(int i = 1; i <= 5; i++) {System.out.print(i + "\t");} System.out.println();
		// 1. while
		int i = 1;
		while(i <= 5) {System.out.print(i + "\t"); i++;} System.out.println();
		// 1. do while
		i = 1;
		do{System.out.print(i + "\t"); i++;} while(i <= 5); System.out.println();
		
		
		// 2. for
		for(int e = 5; e >= 1; e--) {System.out.print(e + "\t");} System.out.println();
		// 2. while
		int e = 5;
		while( e >= 1) {System.out.print(e + "\t"); e--;} System.out.println();
		// 2. do while
		e = 5;
		do{System.out.print(e + "\t"); e--;} while( e >= 1); System.out.println();
		
		
		// 3. for
		for(int a = 1; a <= 3; a++) {System.out.print("JAVA" + a + "\t");} System.out.println();
		// 3. while
		int a = 1;
		while(a <= 3) {System.out.print("JAVA" + a + "\t"); a++;} System.out.println();
		// 3. do while
		a = 1;
		do{System.out.print("JAVA" + a + "\t"); a++;} while(a <= 3); System.out.println();
	}
}
