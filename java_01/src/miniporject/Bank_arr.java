package miniporject;

import java.util.Arrays;
import java.util.Scanner;

public class Bank_arr {
	public static void main(String[] args) {
		// 변수
		int num = -1; // 기능 번호
		int p = 0;
		int m = 0;
		char yn = ' ';
		
		String [] id = new String[3];
		String [] pass = new String [3];
		int [] age = new int[3];
		int [] bal = new int[3];
		
		Scanner scanner= new Scanner(System.in);
		
		// 메뉴판 무한 반복 
		for(;num != 9;) {
			System.out.println(Arrays.toString(id)); System.out.println(Arrays.toString(pass)); System.out.println(Arrays.toString(age)); System.out.println(Arrays.toString(bal));
			System.out.println("\n=======BANK=======\n" + "1.추가\n2.조회\n3.입금\n4.출금\n5.삭제\n9.종료\n입력 : ");
			num = scanner.nextInt();
// 종료기능 : 9				
			if(num == 9) {System.out.println("종료기능입니다."); continue;}
			
// 추가기능 : 1			
			if(num == 1) {System.out.println("추가기능입니다.");
			// 배열 번호 변수
			int find = -1;

			// 빈칸이라면 입력받기
			for(int i = 0; i < id.length; i++) {
				if(id[i] == null) {find = i; break;
				}
			}
			if(find == -1){System.out.println("더이상 가입이 불가합니다.");continue;}
			
			System.out.print("ID : "); id[find] = scanner.next();
			System.out.print("PASS : "); pass[find] = scanner.next();
			System.out.print("AGE : "); age[find] = scanner.nextInt();
			System.out.print("BALANCE  : "); bal[find] = scanner.nextInt();
			} // E : 추가기능 	
			
			// 배열 번호 변수
			int find = -1;
// 로그인기능		
			if(num == 2 || num == 3 || num == 4 || num == 5) {
			System.out.print("ID :"); String temp_id = scanner.next();
			System.out.print("PASS :"); String temp_pass = scanner.next();
			for(int i = 0; i < id.length; i++) {
				if(id[i] != null && temp_id.equals(id[i]) && temp_pass.equals(pass[i])) {
					find = i; break;}
				}
			if(find == -1){System.out.println("로그인에 실패했습니다.");continue;}
			} // E : 로그인기능
			
// 조회기능 : 2				
			if(num == 2) {
			System.out.println("조회에 성공했습니다!\nID :" + id[find] + "\nPASS : " + pass[find] + "\nAGE : " + age[find] + "\nBALANCE : " + bal[find]);
			} // E : 조회기능
			
// 입금기능 : 3
			if(num == 3) {
				System.out.print("입금 : ");p = scanner.nextInt();
				if(p > 0) {
				System.out.println("입금에 성공했습니다! \nID :" + id[find] + "\nPASS : " + pass[find]  + "\nBALANCE : " + (bal[find] += p));}
				else {System.out.println("입금에 실패했습니다!");}
			} // E : 입금기능
			
// 출금기능 : 4	
			if(num == 4) {
				System.out.print("출금 : "); m = scanner.nextInt();
				if(bal[find] >= m) {
					System.out.println("출금에 성공했습니다! \nID :" + id[find] + "\nPASS : " + pass[find]  + "\nBALANCE : " + (bal[find] -= m));
				}else {System.out.println("출금에 실패했습니다!");}
			} // E : 출금기능
			
// 삭제기능 : 5	
			if(num == 5) {
				System.out.print("계좌를 삭제하시겠습니까?  (y/n) : "); yn = scanner.next().charAt(0);
				if(yn == 'y') {System.out.print("삭제 처리 완료했습니다."); id[find] = null; pass[find] = null; age[find] = 0; bal[find] = 0;}
				else if(yn == 'n') {System.out.print("취소 처리 되었습니다.");}
			} // E : 삭제 기능
		}// E : 메뉴판
	}
}
