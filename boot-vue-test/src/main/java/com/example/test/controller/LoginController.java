package com.example.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.test.model.User;
import com.example.test.service.LoginService;

@Controller
public class LoginController {

	@Autowired //
	private LoginService service; //

	@GetMapping("/test")
	public String getUser(Model model) {
//		List<User> user = service.getuserlist();
//		User user = service.getuser();
//		model.addAttribute("user", user);
		return "test";
	}

	@GetMapping("/login")
	public String login(User user) {
		return "index";
	}

	@PostMapping("/login")
	public String login(User user, HttpSession session, Model model) {
		User loginuser = service.getuser(user.getUserId());
		System.out.println(loginuser +"!!!"+ user);
		if(loginuser==null) {
			// 등록되지 않은 사용자
			return "index";
		}
		else if(user.getUserId().equals(loginuser.getUserId()) && user.getUserPwd().equals(loginuser.getUserPwd())){
			//로그인 성공
			
			model.addAttribute("user",loginuser);
			return "test";
		}
		else {
			//패스워드 불일치
			return "index";
		}
	}
}
