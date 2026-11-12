package ex01;

import java.util.List;

public class MonsterTestApp {

	public static void main(String[] args) {
		// 1. 몬스터 목록 객체 생성
		List<Monster> monsters = List.of(
				new Monster("슬라임", "일반", 3, 100, "물"), 
				new Monster("불꽃이", "희귀", 8, 250, "불"),
				new Monster("버섯돌이", "일반", 5, 180, "풀"),
				new Monster("꼬마드래곤", "전설", 20, 1500, "불"),
				new Monster("얼음토끼", "희귀", 12, 700, "얼음"),
				new Monster("돌멩이", "일반", 2, 80, "땅")
				);
		
		// 2. 몬스터 목록크기 알기
		System.out.println(monsters.size());
		
		// 3. 첫번째 몬스터(위치번호 0) 이름 알기
		System.out.println(monsters.get(0) // 목록의 위치번호가 0부터 시작합니다.
									.getName());	// 리스트 안의 슬라임 객체 얻음
		System.out.println("==========================================");
		// 1. 몬스터 리스트 데이터 처리
		//    스트림 이용
		monsters.stream()
			//	.filter(monster -> monster.getLevel() >= 10)
			//	.filter(monster -> monster.getElement().equals("불"))
		// 1. 리스트에 들어있는 Monster 객체는 유일하다
		// 2. 리스트의 객체를 맵의 키로 쓸 수 있다
				.map(monster -> monster.getName())
				.forEach(name
						-> System.out.println(name));
		
		long totalCount = monsters.stream().count();
		System.out.println("total = " + totalCount);
		
		// 희귀한 몬스터들 리스트
		List<String> rareNames = monsters.stream()
										 .filter(monster -> monster.getGrade().equals("희귀"))
										 .map(monster -> monster.getName())
										 .toList();
		// rareNames 리스트 내용 출력
		System.out.println(rareNames);
	}

}
