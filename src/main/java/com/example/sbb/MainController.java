package com.example.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/sbb")
	@ResponseBody
	public String index() {
		return "안녕하세요 우린 우주 햇적단";
	}
	
	@RequestMapping("/")
	public String root() {
		return "redirect:/question/list";
	}
}
