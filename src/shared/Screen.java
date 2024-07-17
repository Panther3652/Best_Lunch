package shared;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Random;
import java.util.List;

public class Screen {
	private StringTokenizer token;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	// 메인 메뉴
	public void screenMain() throws IOException {
		while (true) {
			System.out.println("----------------------------------");
			System.out.println("| 1. 메뉴 보기 / 2. 메뉴 관리 / 0. 종료 |");
			System.out.println("----------------------------------");
			
			int select = Integer.parseInt(reader.readLine());
			
			if (select == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			switch (select) {
				case 1:
					screenView();
					break;
				case 2:
					screenManage();
					break;
				default:
					System.out.println("잘못된 입력입니다.");
			}
		}
	}
	
	/* View 메뉴
	 * 메뉴 확인
	 * 메뉴 추천
	 */
	public void screenView() throws IOException {
		while (true) {
			System.out.println("-------------메뉴 보기 / 추천------------");
			System.out.println("| 1. 메뉴 보기 / 2. 메뉴 추천 / 0. 뒤로가기 |");
			System.out.println("-------------------------------------");
			
			 int select = Integer.parseInt(reader.readLine());
	         
	         switch (select) {
	         	case 1:
	         		screenViewMenu();
	         		break;
	         	case 2:
	         		screenRecommendMenu();
	         		break;
	         	case 0:
	         		return;
	         	default:
	         		System.out.println("잘못된 입력입니다.");
	         		break;
	         }
		}
	}
	
	public void screenViewMenu() throws IOException {
		System.out.println("-----------메뉴 목록-----------");
		// 모든 Category 가져오기
        for (Category category : Category.getCategories()) {
            System.out.println("카테고리: " + category.getName());
            // Category 내 모든 Menu 가져오기
            for (Menu menu : category.getMenus()) {
                System.out.println("  메뉴: " + menu.getName());
            }
        }
        System.out.println("------------------------------");
	}
	
	public void screenRecommendMenu() throws IOException {
		Random random = new Random();
		
		System.out.println("---------------------------------카테고리 목록--------------------------------");
		for (int i = 0; i < Category.getCategories().size(); i++) {
			System.out.println("| " + (i + 1) + ". " + Category.getCategories().get(i).getName() + " |");
		}
		System.out.println("--------------------------------------------------------------------------");
		
		System.out.println("카테고리 번호를 입력하세요: ");
		int categoryIndex = Integer.parseInt(reader.readLine()) - 1;
		
		// 선택한 Category 존재 여부 확인
		if (categoryIndex >= 0 && categoryIndex < Category.getCategories().size()) {
			Category selectedCategory = Category.getCategories().get(categoryIndex); // Index 번호로 카테고리 선택
			List<Menu> menus = selectedCategory.getMenus(); // Category 내 모든 Menu 가져와서 menus List에 저장
			
			// menus 공백 여부 확인
			if (!menus.isEmpty()) {
				int menuIndex = random.nextInt(menus.size()); // java.util의 Random 이용하여 추천 메뉴 Index 번호 선택
				Menu recommendMenu = menus.get(menuIndex); // 해당 Index 번호의 메뉴 가져오기
				System.out.println("오늘의 추천 메뉴: " + recommendMenu.getName());
			} else {
				System.out.println("선택한 카테고리에 메뉴가 없습니다.");
			}
		} else {
			System.out.println("잘못된 카테고리 번호입니다.");
		}
	}
	
	/* Manage 메뉴
	 * 메뉴 추가 / 수정 / 삭제
	 * 카테고리 추가 / 수정 / 삭제
	 * 메뉴, 카테고리 저장 / 불러오기
	 */
	public void screenManage() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("-------------------------------------------------------------메뉴 / 카테고리 관리-------------------------------------------------------------");
			System.out.println("| 1. 메뉴 추가 / 2. 메뉴 수정 / 3. 메뉴 삭제 / 4. 카테고리 추가 / 5. 카테고리 수정 / 6. 카테고리 삭제 / 7. 메뉴, 카테고리 저장 / 8. 메뉴, 카테고리 불러오기 / 0. 뒤로가기 |");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
			
			int select = Integer.parseInt(reader.readLine());
			
			switch (select) {
				case 1:
					screenManageAddMenu();
					break;
				case 2:
					screenManageEditMenu();
					break;
				case 3:
					screenManageRemoveMenu();
					break;
				case 4:
					screenManageAddCategory();
					break;
				case 5:
					screenManageEditCategory();
					break;
				case 6:
					screenManageRemoveCategory();
					break;
				case 7:
					screenManageSave();
					break;
				case 8:
					screenManageLoad();
					break;
				case 0:
					return;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
			}
		}
	}
	
	// 메뉴 추가
	public void screenManageAddMenu() throws IOException {
		ManageMenu manageMenu = new ManageMenu();
		System.out.print("추가할 메뉴의 이름과 카테고리를 입력하세요 (,로 구분하세요): ");
		token = new StringTokenizer(reader.readLine(), ",");
		manageMenu.addMenu(token.nextToken(), token.nextToken());
	}
	
	// 메뉴 수정
	// 1. 메뉴 이름 수정 / 2. 메뉴 카테고리 수정
	public void screenManageEditMenu() throws IOException {
		System.out.println("---------------메뉴 수정--------------");
		System.out.println("| 1. 메뉴 이름 수정 / 2. 메뉴 카테고리 수정 |");
		System.out.println("-----------------------------------");
		
		int select = Integer.parseInt(reader.readLine());
		
		if (select == 1) { // 메뉴 이름 수정
			ManageMenu manageMenu = new ManageMenu();
			System.out.print("수정할 메뉴의 기존 이름과 새 이름을 입력하세요 (,로 구분하세요): ");
			token = new StringTokenizer(reader.readLine(), ",");
			manageMenu.editMenuName(token.nextToken(), token.nextToken());
		} else if (select == 2) { // 메뉴 카테고리 수정
			ManageMenu manageMenu = new ManageMenu();
			System.out.print("수정할 메뉴의 이름과 새 카테고리를 입력하세요 (,로 구분하세요): ");
			token = new StringTokenizer(reader.readLine(), ",");
			manageMenu.editMenuCategory(token.nextToken(), token.nextToken());
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	// 메뉴 삭제
	public void screenManageRemoveMenu() throws IOException {
		ManageMenu manageMenu = new ManageMenu();
		System.out.print("삭제할 메뉴의 이름을 입력하세요: ");
		token = new StringTokenizer(reader.readLine());
		manageMenu.removeMenu(token.nextToken());
	}
	
	// 카테고리 추가
	public void screenManageAddCategory() throws IOException {
		ManageCategory manageCategory = new ManageCategory();
		System.out.println("추가할 카테고리의 이름을 입력하세요: ");
		token = new StringTokenizer(reader.readLine());
		manageCategory.addCategory(token.nextToken());
	}
	
	// 카테고리 수정
	public void screenManageEditCategory() throws IOException {
		ManageCategory manageCategory = new ManageCategory();
		System.out.println("수정할 카테고리의 기존 이름과 새 이름을 입력하세요 (,로 구분하세요): ");
		token = new StringTokenizer(reader.readLine(), ",");
		manageCategory.editCategoryName(token.nextToken(), token.nextToken());
	}
	
	// 카테고리 삭제
	public void screenManageRemoveCategory() throws IOException {
		ManageCategory manageCategory = new ManageCategory();
		System.out.println("삭제할 카테고리의 이름을 입력하세요: ");
		token = new StringTokenizer(reader.readLine());
		manageCategory.removeCategory(token.nextToken());
	}
	
	// 메뉴 / 카테고리 저장
	public void screenManageSave() throws IOException {
		System.out.println("저장할 파일 명을 입력하세요: ");
		token = new StringTokenizer(reader.readLine());
		Category.saveToFile(token.nextToken() + ".txt");
		System.out.println("메뉴 / 카테고리를 성공적으로 저장했습니다.");
	}
	
	// 메뉴 / 카테고리 불러오기
	public void screenManageLoad() throws IOException {
		System.out.println("불러올 파일 명을 입력하세요: ");
		token = new StringTokenizer(reader.readLine());
		Category.loadFromFile(token.nextToken() + ".txt");
		System.out.println("메뉴 / 카테고리를 성공적으로 불러왔습니다.");
	}
}
