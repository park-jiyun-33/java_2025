package com.company.java018_ex;
class Milk{
	//멤버변수    
	private  String name;
	private  int price;
	
	
	public Milk() { this.name = "white"; this.price = 1300; }
	public Milk(String name, int price) { super(); this.name = name; this.price = price; }
	@Override public String toString() { return "Milk [name=" + name + ", price=" + price + "]"; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getPrice() { return price; } public void setPrice(int price) { this.price = price; } 
}
class MilkPrint{
	void show(Milk []milks){ // milks = [1번지, 2번지, 3번지]
		for(int i = 0; i < milks.length; i++) {
		System.out.println("* "+milks[i].getName() + " / "+ milks[i].getPrice()+"\t");
		}
	}
}
public class OOP_Q4 {
	public static void main(String[] args) {
		Milk m1 = new Milk("choco" , 1200);
		System.out.println( m1 );  // 출력된 결과 : choco / 1200
		Milk m2 = new Milk();
		System.out.println( m2 );  // 출력된 결과 : white / 1300
		
		Milk []milks = new Milk[3];        // milks = [null, null, null]
		milks[0] = new Milk("white",1000); // milks[0] = 1번지 {"white",1000}
		milks[1] = new Milk("choco",1200);
		milks[2] = new Milk("banana",1500);
		
		MilkPrint  print = new MilkPrint();   
		print.show(  milks     );	 // 리턴값 메서드명 파라미터
									 // void show(Milk [] milks)   // milks = [1번지, 2번지, 3번지]
		// 출력된 결과 : * white  / 1000 * choco  / 1200 * banana / 1500
	}
}
