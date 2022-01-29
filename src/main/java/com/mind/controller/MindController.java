package com.mind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MindController {

	@RequestMapping(value="/home")
	public ModelAndView MindHomePage()
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("HomePage");
		return model;
	}
}
