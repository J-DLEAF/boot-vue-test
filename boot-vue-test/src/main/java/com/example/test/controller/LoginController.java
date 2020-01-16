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
		User user = service.getuser();
		model.addAttribute("user", user);
		return "test";
	}

	@GetMapping("/login")
	public String login(User user) {
		return "index";
	}

	@PostMapping("/login")
	public String login(User user, HttpSession session, Model model) {
		System.out.println("!!!!!!!!!!");
		return "index";
	}
}
