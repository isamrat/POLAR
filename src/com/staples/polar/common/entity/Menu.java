package com.staples.polar.common.entity;

 
public class Menu{
	
	private int menuId;
	private String menuName;
	private String link;

	public Menu() {
	}
	public Menu(int menuId, String menuName, String link) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.link = link;
	}
	public int getMenuId() {
		return menuId;
	}
	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
}
