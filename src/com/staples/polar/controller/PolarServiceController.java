package com.staples.polar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.staples.polar.common.entity.Menu;
import com.staples.polar.service.MenuService;


@RestController
@RequestMapping("/service/")
public class PolarServiceController {

	@Autowired
	MenuService menuService;

	@RequestMapping(value="menu", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Menu> getMenuDetails(){
		return menuService.getMenuItems();
	}
}
