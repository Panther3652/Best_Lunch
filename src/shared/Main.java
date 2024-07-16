package shared;

/* ToDo List
 * Manage Class 구현
 *  - 메뉴, 카테고리 추가 / 수정 / 삭제
 *  - Menu, Category 객체 이용
 * - 미설정 카테고리 이외 카테고리 및 메뉴 하드 코딩 X
 *  
 * View Class 구현
 *  - 카테고리 별 메뉴 조회
 *  - 
 */

public class Main {
	public static void main(String[] args) {
		ViewMenu menu = new ViewMenu();
		menu.Menu();
	}
}