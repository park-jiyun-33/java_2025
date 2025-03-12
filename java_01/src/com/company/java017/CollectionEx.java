package com.company.java017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;

class Milk{
	private int no; 
	private String name;
	private int price;
	
	public Milk() { super(); }
	public Milk(int no, String name, int price) { super(); this.no = no; this.name = name; this.price = price; }
	@Override public String toString() { return "Milk [no=" + no + ", name=" + name + ", price=" + price + "]"; }
	public int getNo() { return no; }  public void setNo(int no) { this.no = no; }
	public String getName() { return name; }  public void setName(String name) { this.name = name; }
	public int getPrice() { return price; }  public void setPrice(int price) { this.price = price; }
	
	@Override
	public int hashCode() {
		return Objects.hash(name, no, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Milk other = (Milk) obj;
		return Objects.equals(name, other.name) && no == other.no && price == other.price;
	}

	static void show() {System.out.println("\n=============================\n"+
									"NO\tNAME\tPRICE\n"+
									"=============================");}
}

public class CollectionEx {
	public static void main(String[] args) {
		// List : 기차 | index O | 중복허용 O / add , get, size, remove, contains
		ArrayList<Milk> list = new ArrayList<>();
		list.add(new Milk (1, "white", 1000));
		list.add(new Milk (2, "choco", 1200));
		list.add(new Milk (3, "banana", 1300));
		
		Milk.show();
		
		Iterator <Milk> li = list.iterator(); // 1. 모으기
		while(li.hasNext()) { // 2. 처리대상 확인
			Milk m = li.next(); // 3. 꺼내오기
			System.out.println(m.getNo() + "\t" + m.getName() + "\t" + m.getPrice());
		}
		
		//////////////////////////////////////////////
		//Set : 주머니 | index X | 중복허용 X / add , get(X), size, remove, contains
		HashSet<Milk> set = new HashSet<>();
		set.add(new Milk (1, "white", 1000));  // new Milk - heap area
		set.add(new Milk (2, "choco", 1200));  // add (주소값)
		set.add(new Milk (3, "banana", 1300)); // 1) hashCode (Milk)  2) equals
		set.add(new Milk (3, "banana", 1300)); // 3개
		//System.out.println(set.size());	  // 4개 -> 3개 : 1) hashCode (Milk)  2) equals
		
		Milk.show();
		
		Iterator <Milk> se = set.iterator();
		while(se.hasNext()) {
			Milk m2 = se.next();
			System.out.println(m2.getNo() + "\t" + m2.getName() + "\t" + m2.getPrice());
		}
		
		//////////////////////////////////////////////
		//Map : 사전 | Key:객체 - Value:객체 / put , get(key), size, remove, contains
		HashMap<Integer, Milk> map = new HashMap<>();
		map.put(1, new Milk ( 1, "white", 1000));  // key Integer i = 1; Wrapper - boxing
												   // Value Milk ( 1, "white", 1000); Wrapper - boxing
		map.put(2, new Milk ( 2, "choco", 1200));
		map.put(3, new Milk ( 3, "banana", 1300));
		
		Milk.show();
		
		Iterator <Entry <Integer, Milk>> ma = map.entrySet().iterator(); // 1. 모으기
		while(ma.hasNext()) { // 2. 처리대상 확인
			Entry <Integer, Milk> im = ma.next();  // 3. 꺼내오기
			//System.out.println(im.getValue().getNo()+ "\t" + im.getValue().getName() + "\t" + im.getValue().getPrice());
			Milk temp = im.getValue();
			// Milk temp = map.getkey();  map에서 key를 넣으면 값이 나옴
			System.out.println(temp.getNo() + "\t" + temp.getName() + "\t" + temp.getPrice());
		}
	}
}
