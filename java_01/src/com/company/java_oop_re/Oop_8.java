package com.company.java_oop_re;
// abstract
// interface
// 공통점 : 자식객체에서 구현메서드를 작성한다.
// 차이점 : interface가 추상도가 더 높다.

interface Vehicle16{ public void helmet(); public void run();}

class MoterCycle16 implements Vehicle16{
	@Override public void helmet() {System.out.println("헬멧을 착용합니다.");}
	@Override public void run() { System.out.println("오토바이가 달립니다."); }
}
class Car16 implements Vehicle16{
	@Override public void helmet() {  }
	@Override public void run() { System.out.println("자동차가 달립니다."); }
}
class Driver16{
	void drive(Vehicle16 v){ v.helmet(); v.run();}
}
public class Oop_8 {
	public static void main(String[] args) {
		Driver16 driver16 = new Driver16();
		
		MoterCycle16 MoterCycle16 = new MoterCycle16();
		Car16 Car16 = new Car16();
		
		driver16.drive(Car16);
		
		System.out.println("\n\n>>자동차가 고장나서 교통수단을 바꿉니다.");
		
		driver16.drive(MoterCycle16);
	}
}
