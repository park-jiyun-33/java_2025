package com.company.java011_ex;
// 클래스 부품객체(멤버변수, 멤버함수)

// ctrl + alt + j = 한줄정리
public class Apple {
		private String name;
		private String order;
		private int num;
		private int price;
		
		public Apple() {}
		
		public String getName() {return name;}
		public void setName(String name) {this.name = name;}
		public String getOrder() {return order;}
		public void setOrder(String order) {this.order = order;}
		public int getNum() {return num;}
		public void setNum(int num) {this.num = num;}
		public int getPrice() {return price;}
		public void setPrice(int price) {this.price = price;}
		
		@Override public String toString() { return "Apple [name=" + name + ", order=" + order + ", num=" + num + ", price=" + price + "]"; }
		public Apple(String name, String order, int num, int price) { super(); this.name = name; this.order = order; this.num = num; this.price = price; }
		
		
		
		

}
