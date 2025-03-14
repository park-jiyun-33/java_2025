package com.company.java019_ex;

import javax.swing.JOptionPane;
// 방법2 Runnable   1) Runnable    2) run 해야하는일   3) start 실행
class QuestionCount2 implements Runnable{
	@Override public void run() { 
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { break; }
		}
	}
}
public class ThreadEx002 {
	public static void main(String[] args) {
		
		Thread count = new Thread(new QuestionCount2()); 
		count.start();
		
		String answer = JOptionPane.showInputDialog("사과알파벳 입력");
		System.out.println(answer);
		if(answer.toLowerCase().equals("apple")) {  // QuestionCount 대소문자 상관없음
				System.out.println("정답입니다!");
				count.interrupt();
		} else {System.out.println("정답이 아닙니다.");
				count.interrupt();}
		System.out.println("main-end");
	}
}	
// 문제점 : 1) 정답말했는데 count 계속 실행   2) main이 끝났는데 다른 프로세스 실행중