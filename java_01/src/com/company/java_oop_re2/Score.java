package com.company.java_oop_re2;

public class Score { // 데이터를 받아서 전달하는 기능
	// 멤버변수
	private String name, pass;
	private int kor, eng, math;
	private double avg;
	
	public Score() { super(); }

	public Score(String name,int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return "Score [name=" + name + ", pass=" + pass + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg="
				+ avg + "]";
	}

	public String getName() { return name; }  public void setName(String name) { this.name = name; }
	public String getPass() { return pass; }  public void setPass(String pass) { this.pass = pass; }
	public int getKor() { return kor; }  public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }  public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; }  public void setMath(int math) { this.math = math; }
	public double getAvg() { return avg; }  public void setAvg(double avg) { this.avg = avg; }
	
	
}
