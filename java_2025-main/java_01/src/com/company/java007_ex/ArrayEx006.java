package com.company.java007_ex;

public class ArrayEx006 {
	public static void main(String [] args) {
		
		int[][] datas = {{10, 10, 10 ,10},   // 00 01 02 03
	            		 {20, 20, 20 ,20},   // 10 11 12 13
	            		 {30, 30, 30 ,30},   // 20 21 22 23
						};                   // 3층 4칸
		
		int[][] result = new int[datas.length+1][datas[0].length+1];
		
// 1. result에 datas데이터 복사하기 : result[0][0] = datas[0][0];

		//for(int ch = 0; ch < datas.length; ch++) {  // 1. 층의 정보
		//	for(int kan = 0; kan < datas[ch].length; kan++) {  // 2. 칸의 정보
		//		result[ch][kan] = datas[ch][kan];
		//	}// E : kan
		//	// 3. 한층이 끝나고 나면 해야할일
		//}// E : ch

		
// 2. 가로방향 누적 데이터 : 
		// 10(00)   10(01)   10(02)   10(03)   40(04)   
		// 20   20   20   20   80   
		// 30   30   30   30   120   
		// 60   60   60   60   240  
		
		//result[0][4] += result[0][0];
		//result[0][4] += result[0][1];
		//result[0][4] += result[0][2];
		//result[0][4] += result[0][3];  
		
		//result[1][4] += result[1][0];
		//result[1][4] += result[1][1];
		//result[1][4] += result[1][2];
		//result[1][4] += result[1][3];  
 
		//for(int kan = 0; kan <4; kan++) {result[0][4] += result[0][kan];}
		//for(int kan = 0; kan <4; kan++) {result[1][4] += result[1][kan];}
		//(int kan = 0; kan <4; kan++) {result[2][4] += result[2][kan];}
		
		
// 3. 세로방향 누적 데이터
		// result[3][0] += result[0][0]  result[3][0] += result[1][0]  result[3][0] += result[2][0]
		// result[3][1] += result[0][1]  result[3][1] += result[1][1]  result[3][1] += result[2][1]
		// result[3][2] += result[0][2]  result[3][1] += result[1][2]  result[3][2] += result[2][2]
		// result[3][3] += result[0][3]  result[3][1] += result[1][3]  result[3][2] += result[2][3]
		
		//for(int ch = 0; ch < result.length; ch++) {
		//	for(int kan = 0; kan < result[ch].length; kan++) {
		//	result[datas.length][kan] += result[ch][kan];  
		//	}
		//}
// 4. 전체 데이터 누적		
		for(int ch = 0; ch < datas.length; ch++) { // 1. 층의 정보 ch < 3
		for(int kan = 0; kan < datas[ch].length; kan++) { // 2. 칸의 정보 kan < 4
			result[ch][kan] = datas[ch][kan]; // 데이터 복사해서 넣기
			result[ch][datas[ch].length] += result[ch][kan]; // 가로방향데이터 더하기
			result[datas.length][kan] += result[ch][kan];  // 세로데이터  datas.length -3
			result[datas.length][datas[ch].length] += datas[ch][kan]; // 전체 데이터 누적
		} // E : kan
			// 3. 한층이 끝나고 나면 해야할일
		}// E : ch


		for(int ch = 0; ch < result.length; ch++) {  // 1. 층의 정보
			for(int kan = 0; kan < result[ch].length; kan++) {  // 2. 칸의 정보
				System.out.print(result[ch][kan] + "\t");
			}// E : kan
			// 3. 한층이 끝나고 나면 해야할일
			System.out.println();
		}// E : ch
	}
}
