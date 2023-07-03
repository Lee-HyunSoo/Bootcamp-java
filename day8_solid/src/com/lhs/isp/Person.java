package com.lhs.isp;

/*
 * ISP 적용
 * 상위 클래스에서 공통부분을 구현하고, 하위 클래스가 따로 구현할 수 밖에 없는 메서드만 구현하도록 설계 
 */
public abstract class Person {

	/*
	 * 기본생성자를 보유하고 있지만 new()를 이용해 단독 객체 생성은 불가능하다.
	 * 클래스 자체가 추상클래스이기 때문이다. 추상클래스의 생성자는 상속 부분에서만 사용가능하다.
	 */
	public Person() { 
	}
	
	public abstract void work(); // 추상메서드 : 메서드명 까지만 선언한다.
	
	public void eating() {
		System.out.println("먹다");
	}
	
	public void sleeping() {
		System.out.println("자다");
	}
	
}
