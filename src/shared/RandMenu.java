package shared;

import java.util.Random;

public class RandMenu {
	Random rand = new Random();
	// 2차원 배역의 세부 메뉴 생성
	String[][] detail_menu = new String[][] {	
		{"종료합니다."},
		{"불고기", "오징어 두루치기", "닭볶음탕", "쌈밥", "비빔밥", "생선구이",	"낙지볶음", "게장", "떡갈비"},
		{"짜장면", "짬뽕", "볶음밥", "탕수육", "마파두부", "양장피", "깐풍기", "유린기", "고추잡채"},
		{"초밥", "라멘", "낫또", "오니기리", "덮밥", "우동", "야키니쿠", "메밀소바", "돈카츠"},
		{"토마토 스파게티", "봉골레", "크림 파스타", "피자", "함박 스테이크", "리조또", "스테이크", "햄버거", "시저 샐러드"},
		{"북엇국", "콩나물국밥", "순대국", "뼈해장국", "우거지국", "선지해장국", "올갱이국", "라면", "물냉면"},
		{"편의점 도시락", "샌드위치", "토스트", "샐러드", "김밥", "떡볶이", "핫도그", "밥버거", "시리얼"},
		{"김치찌개", "순두부찌개", "된장찌개", "부대찌개", "청국장", "동태찌개", "갈비탕", "추어탕", "삼계탕"},
		{"쌀국수", "회", "카레", "찜닭", "닭발", "칼국수", "아구찜", "닭갈비", "월남쌈"}
	};
	
	public String one_Menu(int list) {
		String result = detail_menu[list][rand.nextInt(detail_menu[list].length)];
		return result;
	}
	
	public String multi_Menu(int list1, int list2) {
		int rand_list = (rand.nextInt(1) == 1) ? list1 : list2;
		String result = detail_menu[rand_list][rand.nextInt(detail_menu[rand_list].length)];
		return result;
	}
}