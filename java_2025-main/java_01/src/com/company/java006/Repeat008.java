package com.company.java006;

public class Repeat008 {
	public static void main(String [] args) {
		String st = "";
		// for
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			if(i%3 == 0) { System.out.print(
					st = (i == 3 ? "1~10까지 3의 배수의 합 : " : "+") + i);
					sum += i;}
		}
		System.out.println("=" + sum);
	
		// while
		sum = 0;
		int i = 1;
		while(i <= 10) {if(i%3 == 0) {System.out.print(
				st = (i == 3 ? "1~10까지 3의 배수의 합 : " : "+") + i);
				sum += i;} i++;}
		System.out.println("=" + sum);

		// do while
		sum = 0;
		i = 1;
		do{if(i%3 == 0) {System.out.print(
				st = (i == 3 ? "1~10까지 3의 배수의 합 : " : "+") + i);
				sum += i;} i++;} while(i <= 10);
		System.out.println("=" + sum);
		
	}
}

/*
1~10까지 3의 배수의 합 : 3+6+9=18
*/