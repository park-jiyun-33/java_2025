package com.company.java005_ex;

public class ForEx003 {
	public static void main(String [] args) {
		// 1~10까지의 합을 구하시오.
		int sum = 0;
		String st = "";
		
		// sum곳에 1누적 / "" 1 출력
		// sum곳에 2누적 / "+" 2 출력
		// sum곳에 3누적 / "+" 3 출력
//			sum += i; System.out.println("" + 1);
//			sum += i; System.out.println("+" + 2);
//			sum += i; System.out.println("+" + 3);
		for(int i = 1; i <= 10; i++)
		{sum += i;
		System.out.print((i == 1? "" : " + ") + i);}
		
		System.out.println(" = " + sum);
		
	} // ctrl + shift + f  -> 정렬
}
