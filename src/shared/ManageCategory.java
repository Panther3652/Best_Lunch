package shared;

public class ManageCategory {
	public void addCategory(String name) {
		if (!checkCategoryDuplication(name)) {
			Category category = new Category(name);
			Category.addCategories(category);
			System.out.println("다음 카테고리를 추가하였습니다: " + name);
		} else {
			System.out.println("이미 존재하는 카테고리입니다.");
		}
	}
	
	public void editCategoryName(String oldName, String newName) {
		if (checkCategoryDuplication(newName)) {
			System.out.println("새 카테고리 이름이 이미 존재합니다.");
			return;
		}
		
		Category category = Category.getCategoryByName(oldName);
		if (category != null) {
			category.setName(newName);
			updateMenuCategories(oldName, newName);
			System.out.println("카테고리 이름이 수정되었습니다: " + oldName + " -> " + newName);
		} else {
			System.out.println("수정하려는 카테고리가 존재하지 않습니다.");
		}
	}
	
	// 카테고리 이름 변경 시 해당 카테고리 이름을 가지고 있는 모든 메뉴의 카테고리 이름을 신규 카테고리 이름으로 변경
	private void updateMenuCategories(String oldCategoryName, String newCategoryName) {
		Category newCategory = Category.getCategoryByName(newCategoryName);
		for (Menu menu : Menu.getMenus()) {
			if (menu.getCategory().getName().equals(oldCategoryName)) {
				menu.setCategory(newCategory);
			}
		}
	}
	
	// 카테고리 중복 여부 확인
	private boolean checkCategoryDuplication(String category) {
		return Category.isContainsCategory(category);
	}
}
