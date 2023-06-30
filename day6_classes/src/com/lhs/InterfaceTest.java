package com.lhs;

public class InterfaceTest implements A {

	public InterfaceTest() {
//		a = 100; // interface에 선언 된 변수는 final이 붙은 상수기 때문에 값을 변경할 수 없다.
//		int c = a; // 변경은 불가능하지만 추출은 가능하다.
		int ccc = 0;
	}

	@Override // interface에 선언 된 메서드를 재정의했다 라는 어노테이션
	public void sum() {
		System.out.println('A');	
	}

}
