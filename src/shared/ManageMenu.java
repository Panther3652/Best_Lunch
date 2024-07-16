package shared;

public class ManageMenu {
	public void addMenu(String name, String categoryName) {
		Category category = Category.getCategoryByName(categoryName);
		if (category != null && !checkMenuDuplication(name)) {
			Menu menu = new Menu(name, category);
			Menu.addMenus(menu);
			System.out.println("다음 메뉴를 추가하였습니다: " + name);
		} else {
			if (category == null) System.out.println("해당 카테고리는 존재하지 않습니다.");
			else if (checkMenuDuplication(name)) System.out.println("이미 존재하는 메뉴입니다.");
		}
	}
	
	public void editMenuName(String oldName, String newName) {
		if (checkMenuDuplication(newName)) {
			System.out.println("새 메뉴 이름이 이미 존재합니다.");
			return;
		}
		
		Menu menu = Menu.getMenuByName(oldName);
		if (menu != null) {
			menu.setName(newName);
			System.out.println("메뉴 이름이 수정되었습니다: " + oldName + " -> " + newName);
		} else {
			System.out.println("수정하려는 메뉴가 존재하지 않습니다.");
		}
	}
	
	public void editMenuCategory(String menuName, String newCategoryName) {
		Category newCategory = Category.getCategoryByName(newCategoryName);
		if (newCategory == null) {
			System.out.println("해당 카테고리는 존재하지 않습니다.");
			return;
		}
		
		Menu menu = Menu.getMenuByName(menuName);
		if (menu != null) {
			menu.setCategory(newCategory);
			System.out.println("메뉴 카테고리가 수정되었습니다: " + newCategory);
		} else {
			System.out.println("수정하려는 메뉴가 존재하지 않습니다.");
		}
	}
	
	// 메뉴 중복 여부 확인
	private boolean checkMenuDuplication(String menu) {
		return Menu.isContainsMenu(menu);
	}
}
