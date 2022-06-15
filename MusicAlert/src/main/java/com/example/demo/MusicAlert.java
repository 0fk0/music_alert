package com.example.demo;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MusicAlert {
	
	@RequestMapping("/")
	public String start() {
		return "first";
	}
	
	@RequestMapping("/home")
	public ModelAndView nowTime() {
		
		Date now = new Date();
		ModelAndView mav = new ModelAndView();
		mav.addObject("nowTime", "<now>" + now);
		
		return mav;
	}
	
	
	@RequestMapping("/afterSetting")
	public ModelAndView post(@RequestParam("alertTime") String time,
				             @RequestParam("url") String link) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("setTime", time);
		mav.addObject("url", link);
		return mav;
	}
	
}
