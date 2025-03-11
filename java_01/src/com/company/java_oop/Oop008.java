package com.company.java_oop;

//abstract 과 interface 의 공통점과 차이점
//공통점 : 자손객체를 통해서 코드를 구현한다.
//차이점 : interface 가 추상화정도가 더 높다.

//+ abstract - 공통 기능 / 인스턴스변수 인스턴스메서드 사용가능
//+ interface - 상수(public static final) + 추상메서드(public abstract)
/*
	   Vehicle16 (run)
	↑             ↑
MotorCycle16    Car16 (run) @Override

Driver16
*/
interface Vehicle16{ 
	//public void helmet(); 
	public void run();}

class MotorCycle16 implements Vehicle16{
	//@Override
	public void helmet() { System.out.println("헬멧을 착용합니다."); }
	@Override public void run() { System.out.println("오토바이가 달립니다."); }
}
class Car16 implements Vehicle16{
	//@Override public void helmet() {	}
	@Override public void run() { System.out.println("자동차가 달립니다."); }
}
class Driver16{
	void drive(Vehicle16 v){
		// v.helmet(); 
		if(v instanceof MotorCycle16) {((MotorCycle16)v).helmet();}
		v.run();}
}
public class Oop008 {
	public static void main(String[] args) {
		Driver16 driver16 = new Driver16();
		
		MotorCycle16 MotorCycle16 = new MotorCycle16();
		Car16 Car16 = new Car16();
		
		driver16.drive(Car16); // 리턴값 메서드명(파라미터)
								// void drive(Car)
								// void drive(MotorCycle16)
		
		System.out.println("\n\n>>자동차가 고장나서 교통수단을 바꿉니다!");
		
		driver16.drive(MotorCycle16);
	}
}
