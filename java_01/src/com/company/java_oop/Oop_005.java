package com.company.java_oop;

class Score{
	// 데이터를 받아서 (전달하는) 기능
	// 멤버변수
	String name, pass;
	int kor, eng, math;
	double avg;
	
	public Score() { super(); }

	@Override public String toString() { return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]"; }

	public String getName() { return name; }  
	public void setName(String name) { this.name = name; }
	public String getPass() { return pass; }  
	public void setPass(String pass) { this.pass = pass; }
	public int getKor() { return kor; }  
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }  
	public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; }  
	public void setMath(int math) { this.math = math; }
	public double getAvg() { return avg; }  
	public void setAvg(double avg) { this.avg = avg; }
	
	
	
}

class SocreProcess extends Score{
	// 멤버함수
	public void process_avg(Score[]std) { // 평균을 구해주는 기능
		
	}
	public void process_pass(Score[]std) { // 합격여부를 구해주는 기능
		
	}
	
}
class ScorePrint{ // 클래스를 넘겨받아 출력해주는기능
	public void show(Score[]std) {
		
	}
	public void show(Score[]std) {
		
	}
	public void show_title() {
		
	}
}

public class Oop_005 {
	public static void main(String[] args) {
		Score[] std = new Score[3];
		std[0] = new Score("아이언맨", 100, 100, 100);
		std[1] = new Score("헐크" , 90, 60, 80);
		std[2] = new Score("블랙팬서" , 20, 60, 90);
		
		SocreProcess process = new SocreProcess();
		process.process_avg(std);
		process.process_pass(std);
		
		ScorePrint print = new ScorePrint();
		print.show(std);
	}
}
