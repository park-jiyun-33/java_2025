package com.company.java006;

public class Repeat009 {
	public static void main(String [] args) {
		// for
		// A(65) F(70) K(75) ...
		for(char i = 'A'; i <= 'Z'; i++) 
		{if(i%5 == 0) {System.out.println();} 
			System.out.print(i);}
		
		System.out.println();
		
		// while
		char i = 'A'; 
		while(i <= 'Z') {
			if(i%5 == 0) {System.out.println();} 
			System.out.print(i); i++;}
		
		System.out.println();
		
		//do while
		i = 'A'; 
		do{if(i%5 == 0) {System.out.println();} 
			System.out.print(i); i++;} while(i <= 'Z'); 
	}
}
