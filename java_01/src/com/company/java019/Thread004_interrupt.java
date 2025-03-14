package com.company.java019;

import java.util.Scanner;
// 카운트 멈추기
class Count extends Thread{
	@Override public void run() { 
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { break; } // #2
		}
	}
}
public class Thread004_interrupt {
	public static void main(String[] args) {
		Thread count = new Count(); count.start();
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("count stop?  y/n");
		if(scanner.next().equals("y")) {
			System.out.println("count를 멈춥니다.");
			count.interrupt();   // #1
		}
		System.out.println("> main end....");
		
	}
}
