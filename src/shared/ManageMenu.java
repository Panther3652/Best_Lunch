package shared;

public class ManageMenu {
	public void addMenu(String name, String category) {
		if (checkCategory(category) && !checkMenuDuplication(name)) {
			Menu newMenu = new Menu(name, category);
			newMenu.addMenus(newMenu);
			System.out.println("다음 메뉴를 추가하였습니다: " + name);
		} else {
			if (!checkCategory(category)) System.out.println("해당 카테고리는 존재하지 않습니다.");
			else if (checkMenuDuplication(name)) System.out.println("이미 존재하는 메뉴입니다.");
		}
	}
	
	public void editMenu(String oldName, String newName) { }
	
	// 메뉴 중복 여부 확인
	private boolean checkMenuDuplication(String menu) {
		Menu findMenu = new Menu();
		if (findMenu.isMenuContains(menu)) return true;
		else return false;
	}
	
	// 카테고리 존재 여부 확인
	private boolean checkCategory(String category) {
		Category findCategory = new Category();
		if (findCategory.isCategoryContains(category)) return true;
		else return false;
	}
}
