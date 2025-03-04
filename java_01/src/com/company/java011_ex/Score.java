package com.company.java011_ex;
// 1. 클래스는 부품객체이다
// 2. 상태와(멤버변수) 행위(멤버함수)
public class Score {
// 멤버변수
	private String name;
	private int kor, eng, math , total;
	private double aver;
	private String p  , s  , rank;
	
// 멤버함수
	public Score(String name, int kor, int eng, int math) {
		this();
		this.name = name; this.kor = kor; this.eng = eng; this.math = math; // 사용자들에게 입력받은 다음에 셋팅
		// 1-2. this(); // error Score()
	} // 1. new 메모리, 객체생성  2. Score()초기화  3. a1번지
	
// 기본생성자
	public Score() {this.name=this.p=this.s=this.rank = "";}
	
// toString
		@Override public String toString() {
			return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
					+ ", aver=" + aver + ", p=" + p + ", s=" + s + ", rank=" + rank + "]";}
	
	public static void info(){
			 System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\r\n"
				 		+ "이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹\r\n"
				 		+ ":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		}
	public void show() {
		this.total = this.kor+this.eng+this.math;
		 this.aver = this.total/3.0;
		 this.p = this.aver<60? "불합격" : "합격";
		 this.s = this.aver>=95? "장학생" : "";
		 for(int i = 1; i <= (int)this.aver/10; i++) {rank += "*";}
			 System.out.println(this.name+ "\t" +this.kor+ "\t" +this.eng+ "\t" +this.math+ "\t" +this.total+ "\t" + String.format("%.2f",this.aver) + "\t" +this.p+ "\t" +this.s+ "\t" +this.rank);
		}

// private - getters/setters (alt + shift + s)
	public String getName() {return name;} public void setName(String name) {this.name = name;}
	public int getKor() {return kor;} public void setKor(int kor) {this.kor = kor;}
	public int getEng() {return eng;} public void setEng(int eng) {this.eng = eng;}
	public int getMath() {return math;} public void setMath(int math) {this.math = math;}
	public int getTotal() {return total;} public void setTotal(int total) {this.total = total;}
	public double getAver() {return aver;} public void setAver(double aver) {this.aver = aver;}
	public String getP() {return p;} public void setP(String p) {this.p = p;}
	public String getS() {return s;} public void setS(String s) {this.s = s;}
	public String getRank() {return rank;} public void setRank(String rank) {this.rank = rank;}
	
}
