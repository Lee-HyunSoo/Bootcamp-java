package com.lhs;

/*
 *  람다 표현식 : -> 키워드 사용, java 1.9부터 지원
 *  익명 객체 : 사용 후, 일정 시간이 지나면 JVM이 알아서 소멸 시킨다. 따라서, 메모리를 효율적으로 사용할 수 있다.
 *  JVM은 가비지 컬렉션이라는 곳에서 사용되지 않는 변수(객체 등)을 자동으로 넣어 소멸시킨다.
 */
public class Main {

	public static void main(String[] args) {
		// 익명(이름없는) 객체를 이용한 자바 코드
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("!!!!");
			}
		}).start();

		// lambda
		new Thread(() -> {
			System.out.println("!!!!");
		}).start();
		
		Func add = (int a, int b) -> a + b;
		
		// 1. 생성 된 객체를 return 받는 형태
		SingletonClass s = SingletonClass.getInstance1();
		
		// 2. 생성 된 객체를 return 받지 않는 형식
		SingletonClass.getInstance2();
		
	}

}

// interface
interface Func {
	public int calc(int n1, int n2);
}
