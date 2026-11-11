package ex01;

import java.util.List;
import java.util.Scanner;

/** CH01: 이전 단계의 기능을 유지하면서 새 기능을 더한 프로그램입니다. */
public class MonsterLabApp {
    
	// 1. 키보드로 입력받을 준비
	// 2. 객체이름은 scanner로 선언
	// 완성하세요
	private static final Scanner scanner = new Scanner(System.in);

    /// 모든 몬스터는 Monster 클래스의 설계도로 만들어집니다.
	/// 1. 몬스터 클래스 설계도를 사용하여 6개의 몬스터 리스트를 만드시오
	// 몬스터 자료는 아래와 같다
	// new Monster("슬라임", "일반", 3, 100, "물"),
    // new Monster("불꽃이", "희귀", 8, 350, "불"),
    // new Monster("버섯돌이", "일반", 5, 180, "풀"),
    // new Monster("꼬마드래곤", "전설", 20, 1500, "불"),
    // new Monster("얼음토끼", "희귀", 12, 700, "얼음"),
    // new Monster("돌멩이", "일반", 2, 80, "땅")
	/// 2. List 컬렉션 자료형을 이용하라
	//
	private static final List<Monster> monsters = List.of(
		new Monster("슬라임", "일반", 3, 100, "물"),
		new Monster("불꽃이", "희귀", 8, 350, "불"),
		new Monster("버섯돌이", "일반", 5, 180, "풀"),
		new Monster("꼬마드래곤", "전설", 20, 1500, "불"),
		new Monster("얼음토끼", "희귀", 12, 700, "얼음"),
		new Monster("돌멩이", "일반", 2, 80, "땅")
    );
	
	// 몬스터 도감 메인 실행 시작점
    public static void main(String[] args) {
    	// 프로그램 제목 출력과 사용설명서
        System.out.println("========================================");
        System.out.println("       🐻 나만의 몬스터 연구소 CH01");
        System.out.println("========================================");
        System.out.println("처음이셔도 괜찮습니다. 메뉴를 하나씩 선택해 보세요.");

        /// 무한루프를 탈출하는 방법
        /// 1. 감시자에 의한 자동 종료			(프로그램 흐름에 맞김 자연스러움)
        /// 2. break를 통한 강제종료				(인터럽트 예외 발생 주의)
        /// 3. return; 을 통한 상위단계로 전환	(재귀에 빠지는 오류 주의)
        /// while문의 조건식을 이용한 무한루프 종료를 작성하시오
        boolean running = true;
        
        while (running) {
        	/// 이 부분부터 끝이라는 주석까지 메소드로 만드세요
        	/// 메소드 이름은 printMenu()
        	printMenu();
        	/// 끝
        	
        	/// 실제 메뉴를 선택하는 명령
        	/// choice라는 변수에 메뉴번호를 저장하는 명령줄을 작성하세요
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    showMonsterList();
                    break;
                case "2":
                    showMonsterClassGuide();
                    break;
                case "0":
                    running = false;
                    System.out.println("연구소를 종료합니다. 오늘도 수고하셨습니다!");
                    break;
                default:
                    System.out.println("메뉴 번호를 다시 확인해 주세요.");
            }

            if (running) {
                System.out.println();
                System.out.print("메뉴로 돌아가려면 Enter를 눌러 주세요...");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("\n--------------- 연구소 메뉴 ---------------");
        System.out.println("1. 몬스터 도감 보기");
        System.out.println("2. 몬스터 클래스 알아보기");
        System.out.println("0. 연구소 종료");
        System.out.println("------------------------------------------");
    }

    private static void showMonsterList() {
        System.out.println("\n[전체 몬스터 도감]");
        // 먼저 익숙한 향상된 for문으로 한 마리씩 출력합니다.
        for (Monster monster : monsters) {
            System.out.println(monster.getInfo());
        }
        System.out.println("현재 몬스터는 " + monsters.size() + "마리입니다.");
    }
    private static void showMonsterClassGuide() {
        System.out.println("\n[Monster 클래스 알아보기]");
        System.out.println("Monster는 몬스터 한 마리를 만들기 위한 설계도입니다.");
        System.out.println("필드: name(이름), grade(등급), level(레벨), exp(경험치), element(속성)");
        System.out.println("생성자: new Monster(이름, 등급, 레벨, 경험치, 속성)");
        System.out.println("Getter: getName(), getGrade(), getLevel(), getExp(), getElement()");
        System.out.println("\n[설계도로 만든 객체 예시]");
        System.out.println(monsters.get(0).getInfo());
        System.out.println("\n추가로 체력, 공격력, 방어력, 특수 기술을 넣어 확장할 수 있습니다.");
    }
}
