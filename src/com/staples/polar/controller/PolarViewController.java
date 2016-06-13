package com.staples.polar.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/view/")
public class PolarViewController {
	
	@RequestMapping(value="menu", method = RequestMethod.GET)
	public String getMenuPage(){
		return "menu";
	}
}
