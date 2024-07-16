package shared;

public class ManageCategory {
	public void addCategory(String name) {
		if (!checkCategoryDuplication(name)) {
			Category newCategory = new Category(name);
			Category.addCategories(newCategory);
			System.out.println("다음 카테고리를 추가하였습니다: " + name);
		} else {
			System.out.println("이미 존재하는 카테고리입니다.");
		}
	}
	
	// 카테고리 중복 여부 확인
	private boolean checkCategoryDuplication(String category) {
		return Category.isCategoryContains(category);
	}
}
