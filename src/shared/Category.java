package shared;

import java.util.ArrayList;
import java.util.List;

public class Category {
	private String name;
	private List<Menu> menus = new ArrayList<>();
	private static ArrayList<Category> categories = new ArrayList<Category>();
	
	public Category(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<Menu> getMenus() {
		return menus;
	}
	
	public void addMenu(Menu menu) {
		menus.add(menu);
	}
	
	public static void addCategories(Category category) {
		categories.add(category);
	}
	
	public static ArrayList<Category> getCategories() {
		return categories;
	}
	
	public static Category getCategoryByName(String name) {
		for (Category category : categories) {
			if (category.getName().equals(name)) return category;
		}
		return null;
	}
	
	public static boolean isContainsCategory(String name) {
		for (Category category : categories) {
            if (category.getName().equals(name)) return true;
        }
		return false;
	}
}
