package com.example.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	
	@GetMapping("/jsp/hello")
	public String testJsp() {
		return "hello-Jsp";
	}
}
