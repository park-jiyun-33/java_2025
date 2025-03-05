package com.company.java007_ex;

public class Array2Ex006_2 {
	public static void main(String[] args) {
		int[][] datas = {{10, 10, 10 ,10},   // 00 01 02 03
       		 			 {20, 20, 20 ,20},   // 10 11 12 13
       		 			 {30, 30, 30 ,30},   // 20 21 22 23
						};                   // 3층 4칸

		int[][] result = new int[datas.length+1][datas[0].length+1]; // 4층 5칸
	
		/*
		 - 가로 데이터 누적
		 00 01 02 03 += 04
		 [ch]층 [마지막 칸](4)에 누적  -> result[ch][4]  -> result[ch][datas[ch].length]
		 result[ch][datas[ch].length] += result[ch][kan];
		 
		 - 세로 데이터 누적
		 00 10 20 += 30
		 result[마지막 층](3) [kan]칸에 누적  -> result[3][kan]  -> result[datas.length][kan]
		 result[datas.length][kan] += result[ch][kan];
		 
		 - 총합 데이터 누적 (datas 배열의 모든 합)
		 00 01 02 03
		 10 11 12 13
		 20 21 22 23 += [3][4]
		 result[마지막 층](3) [마지막 칸](4)에 누적  -> result[3][4]  ->  result[datas.length][datas[ch].length] 
		 result[datas.length][datas[ch].length] += datas[ch][kan];
		 */
		
		// datas 배열
		for(int ch = 0; ch < datas.length; ch++) {
			for(int kan = 0; kan < datas[ch].length; kan++) {
				result[ch][kan] = datas[ch][kan]; // 1. 데이터 복사해서 넣기
				result[ch][datas[ch].length] += result[ch][kan]; // 2. 가로 데이터 누적
				result[datas.length][kan] += result[ch][kan]; // 3. 세로 데이터 누적
				result[datas.length][datas[ch].length] += datas[ch][kan]; // 4. 총합 데이터 누적
			}
		}
		
		// result 배열
		for(int ch = 0; ch < result.length; ch++) {
			for(int kan = 0; kan < result[ch].length; kan++) {
				System.out.print(result[ch][kan] + "\t");
			}System.out.println();
		}
		
		
	} // E : main
} // E : class
