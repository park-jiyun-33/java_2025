package com.company.java019_ex;

import javax.swing.JOptionPane;
// 방법3 익명객체

public class ThreadEx003 {
	public static void main(String[] args) {
		// 실행1
		Thread count = new Thread(new Runnable() {
			@Override public void run() {
				for(int i = 10; i >= 1; i--) {
					System.out.println(i);
					try { Thread.sleep(1000); } 
					catch (InterruptedException e) { break; }
				}
			}
		}); 
		count.start();
		
		// 실행2
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