package com.thejoa.boot008.util5_kakao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class KaKaoLogin {
	@Value("${kakao_redirect_url}")
	private String kakao_redirect_url;
	
	@Value("${kakao_api}")
	private String kakao_api;
	
	public String  step1() {
		return  "https://kauth.kakao.com/oauth/authorize?response_type=code&client_id="
					+ kakao_api
				    + "&redirect_uri="
					+ kakao_redirect_url;
	}
}
