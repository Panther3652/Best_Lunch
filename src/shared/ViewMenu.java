package shared;

public class ViewMenu {
	// 메뉴 조회 기능
	// 카테고리별로 개별 메뉴 정리하여 출력
	String menu[] = new String[] {"",
			"한식","중식","일식",
			"양식","해장","간편식",
			"탕,찌개","기타","n개 입력"
		};
	
	int line = 3;
	
	public void Menu() {
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		for(int i=1;i<menu.length;i++) {
			System.out.print(i + ". "+menu[i]+"\t");
			if(i%line==0) {System.out.println();}
		}
		System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
		System.out.println("원하는 메뉴(1~"+(menu.length-1)+")를 선택하시오 : ");
		System.out.println("종료를 원하신다면 0을 누르시오.");
	}
	
	//메뉴선택 예외처리문의 편리성을 위해 만든 갯수 반환 함수
	public int getMenu() {
		return menu.length;
	}
}
