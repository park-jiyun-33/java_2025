package com.company.java018_ex;

import java.io.File;
import java.io.IOException;

public class OOP_Q10 {
	public static void main(String[] args) {
		// #1. 경로
		String folder_rel = "src/com/company/java018_ex/";
		String file_rel = "JavaIO002.txt";

		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		// #2. 폴더와 파일만들기
		try {
		if(!folder.exists()) {folder.mkdir();}  // exists - 존재
		if(! file.exists()) {file.createNewFile();}
		System.out.println("폴더/파일 준비완료!");
		}catch(Exception e){e.printStackTrace();}
	}
}
