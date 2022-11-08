package com.coding_with_chandra;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@GetMapping("/load")
	public ModelAndView loadJsp() {
		
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("index");
		
		return mv;
	}

}
