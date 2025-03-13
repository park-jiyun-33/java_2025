package com.company.java018_ex;
class Milk2{
	//멤버변수    
	private  String name;
	private  int price;
	
	
	public Milk2() { this.name = "white"; this.price = 1300; }
	public Milk2(String name, int price) { super(); this.name = name; this.price = price; }
	@Override public String toString() { return "Milk [name=" + name + ", price=" + price + "]"; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getPrice() { return price; } public void setPrice(int price) { this.price = price; } 
}
public class OOP_Q3 {
	public static void main(String[] args) {
		Milk2 m1 = new Milk2("choco" , 1200);
		System.out.println( m1 );  // 출력된 결과 : choco / 1200
		Milk2 m2 = new Milk2();
		System.out.println( m2 );  // 출력된 결과 : white / 1300
	}
}
