package shared;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Screen {
	// 메인 메뉴
	public void screenMain() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
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
			} else System.out.println("잘못된 입력입니다.");
		}
	}
	
	/* View 메뉴
	 * 메뉴 확인
	 * 메뉴 추천
	 */
	public void screenView() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("-------------메뉴 보기 / 추천-------------");
			System.out.println("| 1. 메뉴 보기 / 2. 메뉴 추천 / 0. 뒤로가기 |");
			System.out.println("----------------------------------------");
			
			 int select = Integer.parseInt(reader.readLine());
	         
	         if (select == 1) {
	             // 메뉴 보기 로직 추가
	             System.out.println("메뉴를 표시합니다.");
	         } else if (select == 2) {
	             // 메뉴 추천 로직 추가
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
	            System.out.println("메뉴를 추가합니다.");
	        } else if (select == 2) {
	            // 메뉴 수정 로직
	            System.out.println("메뉴를 수정합니다.");
	        } else if (select == 3) {
	            // 메뉴 삭제 로직
	            System.out.println("메뉴를 삭제합니다.");
	        } else if (select == 4) {
	            // 카테고리 추가 로직
	            System.out.println("카테고리를 추가합니다.");
	        } else if (select == 5) {
	            // 카테고리 수정 로직
	            System.out.println("카테고리를 수정합니다.");
	        } else if (select == 6) {
	            // 카테고리 삭제 로직
	            System.out.println("카테고리를 삭제합니다.");
	        } else if (select == 7) {
	        	// 메뉴 / 카테고리 저장 로직
	        } else if (select == 8) {
	        	// 메뉴 / 카테고리 불러오기 로직
	        } else if (select == 0) {
	        	screenMain();
	            break;  // 뒤로가기
	        } else {
	            System.out.println("잘못된 입력입니다.");
	        }
		}
	}
	
	public void screenManageAddMenu() throws IOException {
		
	}
	
	public void screenManageEditMenu() throws IOException {
			
	}
	
	public void screenManageRemoveMenu() throws IOException {
		
	}
	
	public void screenManageAddCategory() throws IOException {
		
	}
	
	public void screenManageEditCategory() throws IOException {
		
	}
	
	public void screenManageRemoveCategory() throws IOException {
		
	}
	
	public void screenManageSave() throws IOException {
		
	}
	
	public void screenManageLoad() throws IOException {
		
	}
}
