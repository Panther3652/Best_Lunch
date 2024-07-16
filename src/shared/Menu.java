package shared;

import java.util.ArrayList;

public class Menu {
	private String name;
	private String category;
	private static ArrayList<Menu> menus = new ArrayList<Menu>();
	
	public Menu() { }
	
	public Menu(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}
	
	public static void addMenus(Menu menu) {
		menus.add(menu);
	}
	
	public static String getMenuNameByIndex(int index) {
		return menus.get(index).getName();
	}
	
	public static boolean isMenuContains(String name) {
		for (Menu menu : menus) {
			if (menu.getName().equals(name)) return true;
		}
		return false;
	}
}
