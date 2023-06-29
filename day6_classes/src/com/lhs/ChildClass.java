package com.lhs;

public class ChildClass extends ParentClass {


	// 자식 클래스에서는 부모클래스의 생성자에 값을 전달할 수 있다.
	public ChildClass() {
		super(1000); // 항상 맨위에 있어야한다. super 위에 다른 코드가 들어갈 수없다.
		System.out.println("ChildClass() 생성자 종료");
	}

}
