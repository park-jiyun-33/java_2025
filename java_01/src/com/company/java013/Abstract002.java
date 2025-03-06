package com.company.java013;
/*
			  Shape002{ showArea(int w, int h); showArea(int r); }
      ↑	         ↑           ↑
Rectangie002  Triangle002  Circle002
 */
abstract class Shape002{
	abstract void showArea(int w, int h);  // {}
	abstract void showArea(int r);  // 설계메서드
}

class Rectangie002 extends Shape002{
	@Override void showArea(int w, int h) {System.out.println("사각형의 넓이 : " +w*h);}
	@Override void showArea(int r) {}  // 불필요한 오버라이드	
}
class Triangle002 extends Shape002{
	@Override void showArea(int w, int h) {System.out.println("삼각형의 넓이 : " +(w*h)/2);}
	@Override void showArea(int r) {}  // 불필요한 오버라이드	
}
class Circle002 extends Shape002{
	@Override void showArea(int w, int h) {}  // 불필요한 오버라이드
	@Override void showArea(int r) {System.out.println("원의 넓이 : " + r*r*Math.PI);}  // Math.PI : 3.14
}

public class Abstract002 {
	public static void main(String[] args) {
		
		/////// ver-1
		Shape002 shape = null; // shape = new Shape002(); error
		
		shape = new Rectangie002(); // 부모 = 자식
		shape.showArea(10,3);
	
		shape = new Circle002(); // 부모 = 자식
		shape.showArea(10);
		
		shape = new Triangle002(); // 부모 = 자식
		shape.showArea(10,3);
		
		/////// ver-2
		Shape002 shape2 = null;
		Shape002 []s    = {new Rectangie002() , new Circle002() , new Triangle002()}; 
		//               Circle이니? shape.showArea(10);
		// instanceof - 객체가 어떤클래스인지 어떤클래스를 상속받았는지 확인
		if(s[0] instanceof Circle002 ) {s[0].showArea(10);}
		else  {s[0].showArea(10,3);}
		
		if(s[1] instanceof Circle002 ) {s[1].showArea(10);}
		else  {s[1].showArea(10,3);}
		
		if(s[2] instanceof Circle002 ) {s[2].showArea(10);}
		else  {s[2].showArea(10,3);}
		
		// for 변경
		for(int i = 0; i < s.length; i++) {
			if(s[i] instanceof Circle002 ) {s[i].showArea(10);}
			else  {s[i].showArea(10,3);}
		}
		
		///////////////////////
		Rectangie002 rec = new Rectangie002();
		rec.showArea(10, 10);
		
		Triangle002 tri = new Triangle002();
		tri.showArea(10,10);
		
		Circle002 cir = new Circle002();
		cir.showArea(10);
	}
}
