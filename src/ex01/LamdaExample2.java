package ex01;

import java.util.function.Predicate;

public class LamdaExample2 {
	
	public static void main(String[] args) {
		// 정수를 입력해서 참 또는 거짓을 리턴하는 함수를 하나 만들겠다
		Predicate<Integer> isStrong = x -> x > 10;
		
		// Predicate<Type> 객체명 = 사용할 메소드 등록
		// 객체명.test(비교할 값) => true or false
		System.out.println(isStrong.test(10));
		System.out.println(isStrong.test(5));
		
	}
	
	public static boolean isStrong(int x) {
		// 10보다 크면 true
		// 10보다 작으면 false
		if ( x > 10 ) {
			return true;
		} else {
			return false;
		}
	}
}
