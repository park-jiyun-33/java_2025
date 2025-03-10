package com.company.java_oop;

import java.util.Arrays;

class User004{
	char division='A';
	String jumin="123456-1234567";
	
	public User004() {}

	public User004(char division, String jumin) {
		super();
		this.division = division;
		this.jumin = jumin;
	}

	@Override public String toString() { return "User004 [division=" + division + ", jumin=" + jumin + "]"; }

	
}
public class Oop_004 {
	public static void main(String[] args) {
		User004 c1 = new User004('B', "200101-1234567");
		System.out.println(c1);
		
		User004 c2 = new User004();
		System.out.println(c2);
		
		// public > protected > package > private
	}
}
