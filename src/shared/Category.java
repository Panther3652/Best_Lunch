package shared;

import java.util.ArrayList;

public class Category {
	private String name;
	
	public Category() { }
	
	public Category(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	private ArrayList<Category> categories = new ArrayList<Category>();
	
	public void addCategories(Category category) {
		categories.add(category);
	}
	
	public String getCategoryNameByIndex(int index) {
		return categories.get(index).getName();
	}
	
	public boolean isCategoryContains(String name) {
		for (int i = 0; i < categories.size(); i++) {
			if (getCategoryNameByIndex(i) == name) return true;
		}
		return false;
	}
}
