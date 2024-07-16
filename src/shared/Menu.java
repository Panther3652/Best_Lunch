package shared;

import java.util.ArrayList;

public class Menu {
	private String name;
	private String category;
	
	private Menu(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	public void addMenu(String name, String category) {
		Menu newMenu = new Menu(name, category);
		menus.add(newMenu);
	}
	
	public String getName() {
		return name;
	}
	
	public String getCategory() {
		return category;
	}
	
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	
	public String getMenuNameByIndex(int index) {
		return menus.get(index).getName();
	}
}
