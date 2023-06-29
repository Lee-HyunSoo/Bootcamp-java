package com.lhs;

public interface A {
	
	int a = 10; // 변수가 아니라 final이 붙은 상수로 선언되어, 더이상 값을 변경할 수 없다.

	//	public A() {
//		// interface는 생성자를 가질 수 없다.
//	}
	
//	public void sum() {} // interface 내에서는 메서드 선언이 불가능하다.
	public void sum(); // 때문에 이렇게 메서드명 까지만 선언 가능하고, 이 interface를 구현받는 클래스는 반드시 해당 메서드를 재정의 해야한다. 

}
