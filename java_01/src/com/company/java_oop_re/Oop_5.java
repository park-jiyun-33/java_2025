package com.company.java_oop_re;

import com.company.java_oop_re2.*;

// 접근자의 범위
// public(아무데서나) > protected(extends) > package(폴더내) > private(클래스내, getters/setters)

public class Oop_5 {
	public static void main(String[] args) {
		Score[]std = new Score[3];
		std[0] = new Score("아이언맨", 100, 100, 100);
		std[1] = new Score("헐크", 90, 60, 80);
		std[2] = new Score("블랙팬서", 20, 60, 90);
		
		ScoreProcess process = new ScoreProcess();
		process.process_avg(std);
		process.process_pass(std);
		
		ScorePrint print = new ScorePrint();
		print.show(std);
	}
}
