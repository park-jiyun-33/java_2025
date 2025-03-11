package com.company.java_oop_re;

class User004{
	final char division;
	final String jumin;
	
	public User004() { division='A'; jumin="123456-1234567";}

	public User004(char division, String jumin) {
		super();
		this.division = division;
		this.jumin = jumin;
	}
	@Override
	public String toString() {
		return "User004 [division=" + division + ", jumin=" + jumin + "]";
	}
}

public class Oop_4 {
	public static void main(String[] args) {
		User004 c1 = new User004('B', "200101-1234567");
		System.out.println(c1);
		User004 c2 = new User004();
		System.out.println(c2);
	}
}
