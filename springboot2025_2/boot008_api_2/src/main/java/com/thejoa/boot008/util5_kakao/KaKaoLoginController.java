package com.thejoa.boot008.util5_kakao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KaKaoLoginController {
	@Autowired   KaKaoLogin api;
	
	@GetMapping("/kakaologin")
	public String login(Model model) { 
		model.addAttribute("url" , api.step1());
		return "login";
	}
}
