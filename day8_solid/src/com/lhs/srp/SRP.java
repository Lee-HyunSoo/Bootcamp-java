package com.lhs.srp;

/*
 * SRP가 지켜진 경우
 */
public class SRP { // 대표클래스 SRP

	public SRP() {
	}
	
	
	// 클래스 내부에 클래스 선언 및 접근제어자 사용이 가능하다.
	public class InnerClass {
	}
	public void method() {
		// 메서드 내부에 클래스 선언도 가능하다.
		class InnerMethod {		
		}
	}

}

// 서브 클래스는 대표클래스의 접근제어자를 따라가기 때문에 접근제어자를 사용할 수 없다.
abstract class Person2 {
	
	// 서브클래스엔 접근제어자를 사용할 수 없지만 메서드에는 사용할 수 있다.
	public abstract void work();
}

//class Programmer extends Person2 {
//
//	@Override
//	public void work() {
//		System.out.println("코딩하는 사람");
//	}
//	
//}
//
//class PM extends Person2 {
//
//	@Override
//	public void work() {
//		System.out.println("기획하는 사람");
//	}
//	
//}
