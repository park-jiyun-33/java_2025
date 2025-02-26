package com.company.java007_ex;

public class ArrayEx006_3 {
	public static void main(String[] args) {
		int[][] datas = {{10, 10, 10 ,10}, 
	            		 {20, 20, 20 ,20}, 
	            		 {30, 30, 30 ,30},  
						};  // 3층 4칸 
		int[][] result = new int[datas.length+1][datas[0].length+1];

		for(int ch = 0; ch < datas.length; ch++) {
			for(int kan = 0; kan < datas[ch].length; kan++) {
				result[ch][kan] = datas[ch][kan]; // 1. 데이터 복사해서 넣기
				result[ch][datas[ch].length] += result[ch][kan]; // 2. 가로 데이터 누적
				result[datas.length][kan] += result[ch][kan]; // 3. 세로 데이터 누적
				result[datas.length][datas[ch].length] += datas[ch][kan]; // 4. 총합 데이터 누적
			}
		}
		
		for(int ch = 0; ch < result.length; ch++) {
			for(int kan = 0; kan < result[ch].length; kan++) {
				System.out.print(result[ch][kan] + "\t");
			} System.out.println();
		}
		
	}
}
