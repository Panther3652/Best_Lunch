package shared;

import java.util.ArrayList;

public class Menu {
	private String name;
	private String category;
	
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
	
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	
	public void addMenus(Menu menu) {
		menus.add(menu);
	}
	
	public String getMenuNameByIndex(int index) {
		return menus.get(index).getName();
	}
	
	public boolean isMenuContains(String name) {
		for (int i = 0; i < menus.size(); i++) {
			if (getMenuNameByIndex(i) == name) return true;
		}
		return false;
	}
}
