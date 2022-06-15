package com.example.demo;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusicAlert {
	
	@RequestMapping("/home")
	public ModelAndView index() {
		
		Date now = new Date();
		ModelAndView mav = new ModelAndView();
		mav.addObject("nowTime", "<now>" + now);
		
		return mav;
	}
	
	@RequestMapping("/")
	public String start() {
		return "home";
	}
}
