package com.company.java007;

public class Repeat003 {
	public static void main(String [] args) {
		// for
		for(int i = 10; i <= 30; i++) {
			if(i%10 == 0) {System.out.print(i + "\t");}
		}
		
		System.out.println();
		
		// while
		int i = 10; 
		while(i <= 30) {
			if(i%10 == 0) {System.out.print(i + "\t");} i++;}
	
		System.out.println();
		
		// do while
		i = 10; 
		do{if(i%10 == 0) {System.out.print(i + "\t");} i++;} while(i <= 30); 
	}
}
