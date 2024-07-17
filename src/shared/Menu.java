package shared;

import java.util.ArrayList;

public class Menu {
	private String name;
	private Category category;
	
	public Menu(String name, Category category) {
		this.name = name;
		this.category = category;
		category.addMenu(this);
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
		category.addMenu(this);
	}
}
