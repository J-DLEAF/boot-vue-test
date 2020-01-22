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
		session.setAttribute("userid", loginuser.getUserId());

		String key = "doyeob - doyeob - do";
//		
//		암호화 - 복호화 테스트
		AES256Util aes = new AES256Util(key);
		String pass = aes.decrypt(loginuser.getUserPwd());
		if (user.getUserId().equals(loginuser.getUserId()) && user.getUserPwd().equals(pass)) {
			// 로그인 성공
			return "index";
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
	@GetMapping("/test")
	public String test() {
		return "test";
	}
}
