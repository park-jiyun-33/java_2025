package com.company.java_oop_2;

public class ScorePrint extends SocreProcess{ // 클래스를 넘겨받아 출력해주는기능
	public void show(Score std) { // 멤버함수 클래스 한개를 받아서 출력해주는 기능
		
	}
	public void show(Score[]std) { // 한개씩 꺼내오기 : 3개의 묶음 // 클래스배열을 받아서 출력해주는 기능
		show_title();
		for(int i = 0; i < std.length; i++) {
		System.out.println(std[i].getName()+"\t"+std[i].getKor()+"\t"+std[i].getEng()+"\t"+std[i].getMath()+"\t"+ String.format("%.2f",std[i].getAvg()) +"\t"+std[i].getPass());
	}}
	public void show_title() { // 타이틀을 출력해주는 기능
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::\n" +
							"이름\t국어\t영어\t수학\t평균\t합격여부\n" +
				"::::::::::::::::::::::::::::::::::::::::::::::::");
	}
	public ScorePrint() {super();}
	
}
