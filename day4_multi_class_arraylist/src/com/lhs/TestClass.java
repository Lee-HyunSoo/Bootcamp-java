package com.lhs;

/*
 * 접근제어자
 * 1. public : 언제 어디서든 접근 가능
 * 2. protected : 상속까지만 허용
 * 3. default : 아무것도 없는 경우 (동일 패키지 내에서만 접근 가능)
 * 4. private : 해당 클래스 내에서만 접근 가능, 정보에 대한 은닉성을 주입하기 위해 사용
 * 
 * 접근제어자 사용 위치
 * 1. 클래스 선언 시 (단, private는 사용 x)
 * 2. 생성자 선언 시
 * 3. 메서드 선언 시
 * 4. 변수 선언 시
 * 
 * 클래스 및 생성자 쪽에는 웬만하면 private를 붙이지 않는다.
 * private를 붙이면 다른 클래스에서 접근할 수 없기 때문에, 클래스를 만드는 의미가 없어지기 때문이다.
 * 하지만 생성자에 private를 붙이는 경우가 있는데, 디자인 패턴 중 싱글톤 패턴을 구현할 때 사용한다.
 * 변수에 private를 사용하는 경우, 외부에서 해당 변수의 값을 함부로 변경 못하도록 은닉 시킬 때 사용한다.
 * 
 * 디자인 패턴 : 기존 개발자등리 코딩할 때 최적화 될 수 있도록 명시해 놓은 코딩 구조
 */

public class TestClass {
	int a = 10; // default 이기 때문에 동일한 패키지에서만 접근 가능
	private String name = "sss"; // private 이기 때문에 외부에서 접근 불가능
	public boolean b = true; // public 이기 때문에 누구나 접근 가능

	public TestClass() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
