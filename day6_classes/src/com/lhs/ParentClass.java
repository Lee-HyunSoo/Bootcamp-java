package com.lhs;

public class ParentClass {

	int a = 10; // default
	protected String name = "lhs"; // default
	private boolean b = false;
	public char c = 'A';
	
	public ParentClass() {
	}
	
	public ParentClass(int a) {
		this.a = a;
		System.out.println("ParentClass() 생성자 종료");
	}
	
	// Object.Class에 존재하는 toString()을 재정의 : override
	public String toString() {
		String result = a + "--" + name;
		return result;
	}

}
