package com.staples.polar.service;

import java.util.ArrayList;
import java.util.List;

import com.staples.polar.common.entity.Menu;


public class MenuService {

	public List<Menu> getMenuItems() {
		
		List<Menu> menuList = new ArrayList<>();
		
		menuList.add(new Menu(1,"Sales1","1231"));
		menuList.add(new Menu(2,"Sales2","1232"));
		menuList.add(new Menu(3,"Sales3","1233"));
		menuList.add(new Menu(4,"Sales4","1234"));
		menuList.add(new Menu(5,"Sales5","1235"));
		
		
		return menuList;
	}
	
}
