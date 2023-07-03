package com.lhs.isp;

/*
 * ISP 적용 : 공통 모듈 개발 시 적용
 * 부모클래스는 각 자식클래스의 공통 부분을 구현받도록 설계 : AOP(관점 지향 프로그래밍)
 * 자식클래스는 자신만의 메서드를 구현할 수 있도록 설계
 */
public class Teacher extends Person{

	public Teacher() {
	}

	@Override
	public void work() {
	}
	
	
	// 이렇게 Teacher 클래스만 사용할 메서드인 경우에만 만드는 것이 좋다.
	public void teaching() {
		System.out.println("신입 사원 교육");
	}

}
