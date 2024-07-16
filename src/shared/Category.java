package shared;

import java.util.ArrayList;

public class Category {
	private String name;
	private static ArrayList<Category> categories = new ArrayList<Category>();
	
	public Category() { }
	
	public Category(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public static void addCategories(Category category) {
		categories.add(category);
	}
	
	public static String getCategoryNameByIndex(int index) {
		return categories.get(index).getName();
	}
	
	public static boolean isCategoryContains(String name) {
		for (Category category : categories) {
            if (category.getName().equals(name)) return true;
        }
		return false;
	}
}
