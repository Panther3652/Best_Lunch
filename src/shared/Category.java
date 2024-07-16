package shared;

import java.util.ArrayList;

public class Category {
	private String name;
	
	private Category(String name) {
		this.name = name;
	}
	
	public void addCategory(String name) {
		Category newCategory = new Category(name);
		categories.add(newCategory);
	}
	
	public String getName() {
		return name;
	}
	
	private ArrayList<Category> categories = new ArrayList<Category>();
	
	public String getCategoryNameByIndex(int index) {
		return categories.get(index).getName();
	}
}
