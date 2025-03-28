package com.company.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class NaverBook {
	public void getBooks() {
		try { 
		// #1. URL
		String apiurl = "https://openapi.naver.com/v1/search/book.json?query=" 
						+ URLEncoder.encode("경제","UTF-8");
		
		URL url = new URL(apiurl);
		
		// #2. HttpURLConnection
		HttpURLConnection conn = (HttpURLConnection)url.openConnection();		
		
		// #3. 요청파라미터
		conn.setRequestMethod("GET");
		conn.setRequestProperty("X-Naver-Client-Id", "yn1BNUxHZuf3rvjvmgCo");
		conn.setRequestProperty("X-Naver-Client-Secret", "vz_MpKVGzY");
		
		// #4. 응답확인 - 200
		// System.out.println(conn.getResponseCode());
		int code = conn.getResponseCode();
		BufferedReader br;
		if(code == 200) {br = new BufferedReader(new InputStreamReader(conn.getInputStream())); }
		else {br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));}
		
		// #5. 응답데이터 - xml/json/csv
		String line = ""; StringBuffer sb = new StringBuffer();
		while( (line = br.readLine()) != null ) {sb.append(line + "\n");}
		
		System.out.println(sb.toString());
		br.close(); conn.disconnect();
		
		} catch (Exception e) { e.printStackTrace(); }
	}
}
