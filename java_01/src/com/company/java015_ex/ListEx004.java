package com.company.java015_ex;

import java.util.ArrayList;
import java.util.Scanner;

class Fruits{
	private int no;   private  String name; private  int price;

	public Fruits() { super(); }

	public Fruits(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override public String toString() { return "Fruits [no=" + no + ", name=" + name + ", price=" + price + "]"; }


	public int getNo() { return no; } 
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }
}
public class ListEx004 {
	public static void main(String[] args) {
		//1. fruits ArrayList 만들기
		ArrayList<Fruits> fruits = new ArrayList<>();
		
		//2. 데이터 넣기
		fruits.add( new Fruits(1, "apple" , 2000));
		fruits.add( new Fruits(2, "banana" , 2500));
		fruits.add( new Fruits(3, "coconut" , 4500));
		
		//3-1. for+size 이용해서 데이터 출력
		/*for(int i = 0; i < fruits.size(); i++) {
			Fruits temp = fruits.get(i);
			System.out.println(temp.getNo() + ", " + temp.getName() + ", " + temp.getPrice());}
		*/
		//3-2. 향상된 for 이용해서 데이터 출력
		for(Fruits temp : fruits) {System.out.println(temp.getNo() + ", " + temp.getName() + ", " + temp.getPrice());}
		
		//4. 1,2,3 과일정보를 입력하시오. - 번호을 입력받으면 해당하는 과일정보의 자료출력
		Scanner scanner = new Scanner(System.in);
		String [] fruitinfo = {"사과는 빨갛다" , "바나나는 노랗다" , "코코넛은 코코하다"};
		System.out.print("번호 입력 : ");
		int num = scanner.nextInt();
		
		//System.out.println(fruitinfo[num-1]);
		
		int find = -1;
		//5. 과일 꺼내오기 -> 과일번호 == 입력한값
		//if(fruits.get(0).getNo() == num) {find =0;}
		//if(fruits.get(1).getNo() == num) {find =1;}
		//if(fruits.get(2).getNo() == num) {find =2;}
		for(int i = 0; i < fruits.size(); i++) {
			if(fruits.get(i).getNo() == num) {find =i; break;};} // 찾았다면 나오기
		
		System.out.println("번호 : " + fruits.get(find).getNo());
		System.out.println("이름 : " + fruits.get(find).getName());
		System.out.println("가격 : " + fruits.get(find).getPrice());
		System.out.println(fruitinfo[find]);
	}
}
