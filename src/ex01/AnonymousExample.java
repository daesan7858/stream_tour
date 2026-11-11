package ex01;

interface LabAction {
	void run();
}

// 실제 실행앱
public class AnonymousExample {
	public static void main(String[] args) {
		// 1. 이름이 있는 클래스로 기능만들기
		
		// LabAction action = new WelcomeAction();
		// 실제 LabAction의 run()메소드 실행
		// action.run();
		
		// 2. 익명클래스를 이용한 기능구현
		//LabAction action = new LabAction() {

		//	@Override
		//	public void run() {
		//		System.out.println("연구소에 온 걸 환영한다");
		//	}
		//};
		// 실제 LabAction의 run()메소드 실행
		//action.run();
		
		// 3. 익명클래스를 -> 람다 함수로 바꿔서 이용한 기능구현
		LabAction action = 	() ->	System.out.println("연구소에 온 걸 환영한다");
				
	}
}