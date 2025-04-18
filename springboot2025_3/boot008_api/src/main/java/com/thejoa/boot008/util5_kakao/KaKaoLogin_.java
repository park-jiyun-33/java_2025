package com.thejoa.boot008.util5_kakao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


@Component
public class KaKaoLogin_ {
	@Value("${kakao_redirect_url}")
	private String kakao_redirect_url;
	
	// 1. login - 인증(사용자 신원확인) - 인가(접근권한)
	@Value("${kakao_api}")
	private String kakao_api;
	
	public String  step1() {
		return  "https://kauth.kakao.com/oauth/authorize?response_type=code&client_id="
					+ kakao_api
				    + "&redirect_uri="
					+ kakao_redirect_url;
	}
	
	// 2. 인가코드를 토큰
	public List<String> step2(String code) { // code
		
		System.out.println("....... STEP1) " + code);
		String  tokenUrl="https://kauth.kakao.com/oauth/token";
		tokenUrl +=  "?grant_type=authorization_code" +"&client_id=" + kakao_api 
					 +"&redirect_uri=" + kakao_redirect_url +"&code=" + code;
		
		URL url = null;   
		HttpURLConnection conn = null;
		BufferedReader br = null;
		String line = "";  StringBuffer buffer=new StringBuffer();
		String resultToken="";
		
		try {
			url = new URL(tokenUrl);
			conn = (HttpURLConnection) url.openConnection(); 
			conn.setRequestMethod("POST");
			conn.setDoInput(true); conn.setDoOutput(true);
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
			
			if(conn.getResponseCode() == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));	
			}else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			while( (line = br.readLine()) != null ) { buffer.append(line); }
			br.close();
			conn.disconnect();  //연결끊기
			
			resultToken = buffer.toString();
			System.out.println("................" + resultToken);
			
		} catch (MalformedURLException e) { 
			e.printStackTrace(); 
		} catch (IOException e) {
			e.printStackTrace();
		}
		JsonObject job = JsonParser.parseString(resultToken).getAsJsonObject();
		String token = job.get("access_token").getAsString();
		
		System.out.println("......." + token);
	
		
		
		
		return step3(token);  // ## 마지막 수정
	}
	// 사용자정보 가져오기
	// nickname, profile_img
	public List<String> step3(String token) {
		
		System.out.println("....... STEP2) " + token);
		List<String> userinfos = new ArrayList<>();
		
		/*
		curl -v -X POST "https://kapi.kakao.com/v2/user/me" \
    	-H "Content-Type: application/x-www-form-urlencoded;charset=utf-8" \
    	-H "Authorization: Bearer ${ACCESS_TOKEN}" \   ##공백 확인!!
    	--data-urlencode 'property_keys=["kakao_account.email"]'
		 */
		String  userUrl="https://kapi.kakao.com/v2/user/me";
		
		URL url = null;   
		HttpURLConnection conn = null;
		BufferedReader br = null;
		String line = "";  StringBuffer buffer=new StringBuffer();
		String result="";
		
		try {
			url = new URL(userUrl);
			conn = (HttpURLConnection) url.openConnection(); 
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
			conn.setRequestProperty("Authorization", "Bearer " + token ); // ##"Bearer "공백 확인!!
			
			if(conn.getResponseCode() == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));	
			}else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream())); }
			while( (line = br.readLine()) != null ) { buffer.append(line); }
			br.close();
			conn.disconnect();  //연결끊기
			
			
			
		} catch (MalformedURLException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace(); }
		
		result = buffer.toString(); System.out.println("......." + result);
		JsonObject job = JsonParser.parseString(result).getAsJsonObject();
		userinfos.add(job.getAsJsonObject("properties").get("nickname").getAsString());
		userinfos.add(job.getAsJsonObject("properties").get("profile_image").getAsString());
		System.out.println(".............." + userinfos);
		
		return userinfos;  // ## 마지막 수정
	}
}

/*
curl -v -X POST "https://kauth.kakao.com/oauth/token" \
    -H "Content-Type: application/x-www-form-urlencoded;charset=utf-8" \
    -d "grant_type=authorization_code" \
    -d "client_id=${REST_API_KEY}" \
    --data-urlencode "redirect_uri=${REDIRECT_URI}" \
    -d "code=${AUTHORIZE_CODE}"
 */





