package shared;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Screen {
	private StringTokenizer token;
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	// 메인 메뉴
	public void screenMain() throws IOException {
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("1. 메뉴 보기 / 2. 메뉴 관리 / 0. 종료");
			System.out.println("-------------------------------------");
			
			int select = Integer.parseInt(reader.readLine());
			
			if (select == 1) {
				screenView();
				break;
			}
			else if (select == 2) {
				screenManage();
				break;
			}
			else if (select == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else System.out.println("잘못된 입력입니다.");
		}
	}
	
	/* View 메뉴
	 * 메뉴 확인
	 * 메뉴 추천
	 */
	public void screenView() throws IOException {
		while (true) {
			System.out.println("-------------메뉴 보기 / 추천-------------");
			System.out.println("| 1. 메뉴 보기 / 2. 메뉴 추천 / 0. 뒤로가기 |");
			System.out.println("----------------------------------------");
			
			 int select = Integer.parseInt(reader.readLine());
	         
	         if (select == 1) {
	             // 메뉴 보기 로직 추가
	        	 screenViewMenu();
	             System.out.println("메뉴를 표시합니다.");
	         } else if (select == 2) {
	             // 메뉴 추천 로직 추가
	        	 screenRecommendMenu();
	             System.out.println("메뉴를 추천합니다.");
	         } else if (select == 0) {
	        	 screenMain();
	             break;  // 뒤로가기
	         } else {
	             System.out.println("잘못된 입력입니다.");
	         }
		}
	}
	
	public void screenViewMenu() throws IOException {
		
	}
	
	public void screenRecommendMenu() throws IOException {
		
	}
	
	/* Manage 메뉴
	 * 메뉴 추가 / 수정 / 삭제
	 * 카테고리 추가 / 수정 / 삭제
	 * 메뉴, 카테고리 저장 / 불러오기
	 */
	public void screenManage() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("-------------메뉴 / 카테고리 관리-------------");
			System.out.println("| 1. 메뉴 추가 / 2. 메뉴 수정 / 3. 메뉴 삭제 / 4. 카테고리 추가 / 5. 카테고리 수정 / 6. 카테고리 삭제 / 0. 뒤로가기 |");
			System.out.println("----------------------------------------");
			
			int select = Integer.parseInt(reader.readLine());
	        
	        if (select == 1) {
	            // 메뉴 추가 로직
	        	screenManageAddMenu();
	        } else if (select == 2) {
	            // 메뉴 수정 로직
	        	screenManageEditMenu();
	        } else if (select == 3) {
	            // 메뉴 삭제 로직
	        	screenManageRemoveMenu();
	        } else if (select == 4) {
	            // 카테고리 추가 로직
	        	screenManageAddCategory();
	        } else if (select == 5) {
	            // 카테고리 수정 로직
	        	screenManageEditCategory();
	        } else if (select == 6) {
	            // 카테고리 삭제 로직
	        	screenManageRemoveCategory();
	        } else if (select == 7) {
	        	// 메뉴 / 카테고리 저장 로직
	        	screenManageSave();
	        } else if (select == 8) {
	        	// 메뉴 / 카테고리 불러오기 로직
	        	screenManageLoad();
	        } else if (select == 0) {
	        	screenMain();
	            break;  // 뒤로가기
	        } else {
	            System.out.println("잘못된 입력입니다.");
	        }
		}
	}
	
	public void screenManageAddMenu() throws IOException {
		ManageMenu manageMenu = new ManageMenu();
		System.out.print("추가할 메뉴의 이름과 카테고리를 입력하세요 (공백으로 구분하세요): ");
		token = new StringTokenizer(reader.readLine(), " ");
		manageMenu.addMenu(token.nextToken(), token.nextToken());
		System.out.println("메뉴가 추가되었습니다.");
		screenManage();
	}
	
	public void screenManageEditMenu() throws IOException {
		System.out.println("-------------메뉴 수정-------------");
		System.out.println("| 1. 메뉴 이름 수정 / 2. 메뉴 카테고리 수정 |");
		System.out.println("----------------------------------------");
		
		int select = Integer.parseInt(reader.readLine());
		
		if (select == 1) {
			ManageMenu manageMenu = new ManageMenu();
			System.out.print("수정할 메뉴의 기존 이름과 새 이름을 입력하세요 (공백으로 구분하세요): ");
			token = new StringTokenizer(reader.readLine(), " ");
			manageMenu.editMenuName(token.nextToken(), token.nextToken());
			System.out.println("메뉴 이름이 수정되었습니다.");
			screenManage();
		} else if (select == 2) {
			ManageMenu manageMenu = new ManageMenu();
			System.out.print("수정할 메뉴의 이름과 새 카테고리를 입력하세요 (공백으로 구분하세요): ");
			token = new StringTokenizer(reader.readLine(), " ");
			manageMenu.editMenuCategory(token.nextToken(), token.nextToken());
			System.out.println("메뉴 카테고리가 수정되었습니다.");
			screenManage();
		} else {
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	public void screenManageRemoveMenu() throws IOException {
		ManageMenu manageMenu = new ManageMenu();
		System.out.print("삭제할 메뉴의 이름을 입력하세요: ");
		token = new StringTokenizer(reader.readLine());
		manageMenu.removeMenu(token.nextToken());
		System.out.println("메뉴가 삭제되었습니다.");
		screenManage();
	}
	
	public void screenManageAddCategory() throws IOException {
		ManageCategory manageCategory = new ManageCategory();
		System.out.println("추가할 카테고리의 이름을 입력하세요: ");
		token = new StringTokenizer(reader.readLine());
		manageCategory.addCategory(token.nextToken());
		System.out.println("카테고리가 추가되었습니다.");
		screenManage();
	}
	
	public void screenManageEditCategory() throws IOException {
		ManageCategory manageCategory = new ManageCategory();
		System.out.println("수정할 카테고리의 기존 이름과 새 이름을 입력하세요 (공백으로 구분하세요): ");
		token = new StringTokenizer(reader.readLine(), " ");
		manageCategory.editCategoryName(token.nextToken(), token.nextToken());
		System.out.println("카테고리의 이름이 수정되었습니다.");
		screenManage();
	}
	
	public void screenManageRemoveCategory() throws IOException {
		ManageCategory manageCategory = new ManageCategory();
		System.out.println("삭제할 카테고리의 이름을 입력하세요: ");
		token = new StringTokenizer(reader.readLine());
		manageCategory.removeCategory(token.nextToken());
		System.out.println("카테고리가 삭제되었습니다.");
		screenManage();
	}
	
	public void screenManageSave() throws IOException {
		System.out.println("저장할 파일 명을 입력하세요: ");
		token = new StringTokenizer(reader.readLine());
		Category.saveToFile(token.nextToken() + ".txt");
		System.out.println("메뉴 / 카테고리를 성공적으로 저장했습니다.");
		screenManage();
	}
	
	public void screenManageLoad() throws IOException {
		System.out.println("불러올 파일 명을 입력하세요: ");
		token = new StringTokenizer(reader.readLine());
		Category.loadFromFile(token.nextToken() + ".txt");
		System.out.println("메뉴 / 카테고리를 성공적으로 불러왔습니다.");
		screenManage();
	}
}
