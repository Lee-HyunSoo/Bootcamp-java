package com.lhs;

public abstract class ABClass {

	int a = 0;
	final boolean B = true; // 일반적으로 상수를 만들 때의 변수명은 대문자로만든다.
	
	public ABClass() {
		System.out.println("ABClass() 호출");
	}
	
	public void avg() {
		
	}
	
	public abstract void prn(); // 추상메서드는 반드시 재정의를 해야한다.

}
