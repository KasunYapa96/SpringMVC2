package com.kasun;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeControlller {
	
	@RequestMapping("/form")
	public String sendRequest(@RequestParam("ename") String ename,ModelMap model) {
		
		model.addAttribute("ename",ename);
		
		return "print";
	}
	
	@RequestMapping("/users/{username}")
	public String sendUser(@PathVariable String username,Model model) {
		
		model.addAttribute("username", username);
		
		return "user";
	}
	
}
