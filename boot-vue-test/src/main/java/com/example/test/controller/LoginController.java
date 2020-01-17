package com.example.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.test.model.User;
import com.example.test.service.LoginService;
import com.example.test.util.AES256Util;

@Controller
public class LoginController {

	@Autowired //
	private LoginService service; //

	@GetMapping("/login")
	public String login(User user) {
		return "index";
	}

	@PostMapping("/login")
	public String login(User user, HttpSession session, Model model) throws Exception {
		System.out.println(user);
		User loginuser = service.getuser(user.getUserId());
		System.out.println(loginuser);

//		String key = "doyeob - doyeob - do";
//		
		//암호화 - 복호화 테스트
//		AES256Util aes = new AES256Util(key);
//		String a = aes.encrypt(user.getUserPwd());
//		System.out.println(a);
//		System.out.println(aes.decrypt("plLI4uXrRWq51oTlkDerNQ=="));
//		String pass = aes.decrypt(loginuser.getUserPwd());
		if (loginuser == null) {
			// 등록되지 않은 사용자
			return "index";
		} else if (user.getUserId().equals(loginuser.getUserId()) && user.getUserPwd().equals(loginuser.getUserPwd())) {
			// 로그인 성공

			model.addAttribute("user", loginuser);
			return "test";
		} else {
			// 패스워드 불일치
			return "index";
		}
	}

	@PostMapping("/join")
	public String join(User user, Model model) throws Exception{
		System.out.println(user);
		String key = "doyeob - doyeob - do";
		AES256Util aes = new AES256Util(key);
		String hashpass = aes.encrypt(user.getUserPwd());
		user.setUserPwd(hashpass);
		this.service.joinuser(user);
		
		return "index";
	}
}
