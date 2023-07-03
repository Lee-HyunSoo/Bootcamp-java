package com.lhs.isp;

/*
 * ISP 미적용
 */
public class Programmer extends Person{

	public Programmer() {
	}

	@Override
	public void work() {
		
	}
	
	/*
	 * 이런식으로 추상메서드가 아닌데 재정의하는 것은 좋지않다.
	 * 이렇게 쓸바엔 추상메서드로 선언하거나, 인터페이스를 사용하는 것이 좋다.
	 */
	public void Eating() { // Person에 있는 Eating 메서드를 재정의
	}
	
	public void Sleeping() { // Person에 있는 Sleeping 메서드를 재정의
	}

}
