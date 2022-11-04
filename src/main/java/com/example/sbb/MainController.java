package com.example.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/sbb")
	public String index() {
		return "question_list";
	}
	
	@RequestMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
		
}
