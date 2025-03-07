package com.company.java014_ex;
/* ctrl + alt + j (한줄 처리)
   Vehicle {------}
 ↑        ↑
Car   MotorCycle  - {run()} - @Override
 
Driver (사용객체 - MotorCycle , Car)
 */
interface Vehicle {public void run();}

class MotorCycle implements Vehicle{ @Override public void run() { System.out.println("오토바이가 달립니다.");}}
class Car        implements Vehicle{ @Override public void run() { System.out.println("자동차가 달립니다.");}}

class Driver{ void drive(Vehicle v) {v.run();} }

public class InterfaceEx003 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Car       car = new Car();
		MotorCycle mo = new MotorCycle();
		
		driver.drive(car); // 리턴값 메서드명(파라미터)
		driver.drive(mo);  // void drive(Vehicle v)
	}
}	
/*
----------------------------------------------
[method : 정보]  Vehide.class, MotorCycle.class, Car.class, Driver.class, public InterfaceEx003.class // ##1. 설계도
----------------------------------------------
[heap : 동적]					| [stack : 지역(변수_임시)]
							driver.drive(mo)  ▶ 1번지.drive(Vehicle v      ) {             v.run();}
							                          ▶ 1) Vehicle v = mo; 부모 = 자식 ▶2) @Overrdie 자식메서드 mo.run()
							driver.drive(car) ▶ 1번지.drive(Vehicle v      ) {             v.run();}
													  ▶ 1) Vehicle v = car; 부모 = 자식 ▶2) @Overrdie 자식메서드 car.run()
3번지		MotorCycle{run}		← mo     3번지
2번지  	Car       {run}	    ← car    2번지
1번지		Driver  {drive}	    ← driver 1번지
							| main ##2
----------------------------------------------
----------------------------------------------
*/