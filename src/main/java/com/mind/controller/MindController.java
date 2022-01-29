package com.mind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class MindController {

	@RequestMapping(value="/home",method = RequestMethod.GET)
	public ModelAndView MindHomePage()
	{
		ModelAndView model = new ModelAndView();
		model.setViewName("HomePage");
		return model;
	}
}
