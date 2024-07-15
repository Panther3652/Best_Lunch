package shared;

import java.util.Scanner;

public class Process {

	
		// 메뉴 개수 받기
		ViewMenu menu = new ViewMenu();
		int menu_len = menu.getMenu();
		
		int menu1, menu2;
		
		protected void multimenu() {
			Scanner sc = new Scanner(System.in);
			menu1 = sc.nextInt();
			menu2 = sc.nextInt();
			sc.close();
		}
		
		public Process(int input) {
			// 종료 함수
			if (input == 0) {
				System.out.println("종료합니다.");
				return;
			}
			// 마지막 값을 입력 받은 경우 = 중복 입력
			else if (input == (menu_len - 1)) {
				System.out.println("2개의 메뉴를 입력해주세요.");
				multimenu();
				RandMenu mul_menu = new RandMenu();
				System.out.println("<오늘 메뉴는 " + mul_menu.multi_Menu(menu1, menu2) + "(이)다!>");
			}
			// 한 가지 메뉴를 선택한 경우
			else {
				RandMenu one_menu = new RandMenu();
				System.out.println("<오늘 메뉴는 " + one_menu.one_Menu(input) + "(이)다!!!!!>");
			}
		}

	}


