package com.company.java007;

public class ArrayEx008 {
	public static void main(String [] args) {
		// 변수
		String[] arr = {"아이언맨","헐크","캡틴","토르","호크아이"};
		int[] kor = {100,20,90,70,35};   
	    int[] eng = {100,50,95,80,100};
	    int[] mat = {100,30,90,60,100};
	    int[] aver = new int[5];
	    String[] pass = new String[5];
	    String[] jang = new String[5];
	    int[] rank = new int[5];
	    String[] star = new String[5];
	    String st = "";

	    // 입력 + 처리
	    for(int i = 0; i < arr.length; i++) 
		// 1. 평균 배열
	    {aver[i] = (kor[i] + eng[i] + mat[i]) /3;
	    
		// 2. 합격-불합격 배열
	    if(aver[i] >= 60) {pass[i] = "합격";}
	     else {pass[i] = "불합격";} 
	    
	    // 3. 장학생
	    if(aver[i] >= 95) {jang[i] = "장학생";}
	    else {jang[i] = "----";}
	    
	    // 점수에 따라 별
	    // System.out.println(aver[i]/10);
	    int s = aver[i]/10;
	    star[i] = "";
	    for(int j = 0; j < s; j++) {
	    	star[i] += "*";}
	    	
	    } // E : for
	    
	    // 4. 등수
	   for(int i = 0; i < aver.length; i++) {
	   int a = 1;
	   for(int j = 0; j < aver.length; j++) {
	    		if(aver[i] < aver[j]) {
	    			a++;}}
	    rank[i] = a ;
	   }
	    
	    // 출력
	    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	    System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부\t장학생\t등수\t별");
	    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	    for (int i = 0; i < arr.length; i++) {
	    	System.out.println(arr[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + mat[i] + "\t" +  aver[i] + "\t" + pass[i] + "\t" + jang[i] + "\t" + rank[i] + "\t" + star[i]); 
	    }
	    System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	
	    
	}	    
}
