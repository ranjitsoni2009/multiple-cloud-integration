package com.suvibe.code.challenge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/callback")
public class CongnitoCallbackController {
	
	@GetMapping("/sign-in")
	public String signInCallback(@RequestParam("code") String code) {
		return "Welcome to Cloud App :: code : "+code;
	}
	
	@GetMapping("/sign-out")
	public String signOutCallback() {
		return "Bye-Bye, Thanks for Visit";
	}
	
}
