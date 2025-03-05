package miniporject;

import java.util.Scanner;

public class Bank {
	public static void main(String [] args) {
		// 변수
		int num, age = 1, n;
		String id = "", ps = "";
		
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		//무한 반복
		for(;;) {
			System.out.print("1.추가\n2.조회\n3.입금\n4.출금\n5.삭제\n9.종료\n입력 :  ");
			num = scanner.nextInt();
			switch(num) {
			case 1 : 
//			System.out.print("추가기능입니다.");
			System.out.print("id : ");
			id = scanner.next().concat(id);
			System.out.print("pass : ");
			ps = scanner.next().concat(ps);
			System.out.print("나이 : ");
			age = scanner.nextInt();
			System.out.print("잔액 : ");
			n = scanner.nextInt();
			break;
			case 2 : 
			System.out.println("조회기능입니다."); 
			
			break;
			case 3 : System.out.println("입금기능입니다."); break;
			case 4 : System.out.println("출금기능입니다."); break;
			case 5 : System.out.println("삭제기능입니다."); break;
			case 9 : break;
			}
		}
		
		// 처리
		// 출력
		
		
		
		
		
	}
}
