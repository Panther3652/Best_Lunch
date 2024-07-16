package shared;

import java.util.ArrayList;

public class Menu {
	private String name;
	private Category category;
	private static ArrayList<Menu> menus = new ArrayList<Menu>();
	
	public Menu(String name, Category category) {
		this.name = name;
		this.category = category;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public static void addMenus(Menu menu) {
		menus.add(menu);
	}
	
	public static ArrayList<Menu> getMenus() {
		return menus;
	}
	
	public static Menu getMenuByName(String name) {
		for (Menu menu : menus) {
			if (menu.getName().equals(name)) return menu;
		}
		return null;
	}
	
	public static boolean isContainsMenu(String name) {
		for (Menu menu : menus) {
			if (menu.getName().equals(name)) return true;
		}
		return false;
	}
}
