package com.example.test.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;

public class RootController implements ErrorController {

	@GetMapping("/error")
	public String redirectRoot() {
		return "index";
	}

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "/error";
	}

}
