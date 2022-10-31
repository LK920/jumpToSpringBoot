package com.example.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellowController {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		
		return "Hello Spring Boot Board";
	}
}
