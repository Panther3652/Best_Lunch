package shared;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Screen {
	// 메인 메뉴
	public void menuMain() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		while (true) {
			System.out.println("-------------------------------------");
			System.out.println("1. 메뉴 보기 / 2. 메뉴 관리 / 0. 종료");
			
			int select = Integer.parseInt(reader.readLine());
			
			if (select == 1) {
				menuView();
				break;
			}
			else if (select == 2) menuManage();
			else if (select == 0) {
				System.out.println("프로그램을 종료합니다.");
			}
			else System.out.println("잘못된 입력입니다.");
		}
	}
	
	
	// View 메뉴
	// 메뉴 확인
	// 메뉴 추천
	public void menuView() throws IOException {
		System.out.println("-------------메뉴 보기 / 추천-------------");
		System.out.println("| 1. 메뉴 보기 / 2. 메뉴 추천 / 0. 뒤로가기");
		System.out.println("----------------------------------------");
	}
	
	
	// Manage 메뉴
	// 메뉴 추가 / 수정 / 삭제
	// 카테고리 추가 / 수정 / 삭제
	// 메뉴, 카테고리 저장 / 불러오기
	public void menuManage() throws IOException {
		System.out.println("-------------메뉴 / 카테고리 관리-------------");
		System.out.println("| 1. 메뉴 추가 / 2. 메뉴 수정 / 3. 메뉴 삭제 / 4. 카테고리 추가 / 5. 카테고리 수정 / 6. 카테고리 삭제 / 0. 뒤로가기");
		System.out.println("----------------------------------------");
	}
}
