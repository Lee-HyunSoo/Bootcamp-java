package com.lhs.lsp;

import com.lhs.srp.Programmer;
import com.lhs.srp.PM;
import com.lhs.srp.Person;

/*
 * 제너릭 : 클래스에 다양한 데이터 타입을 사용하기 위한 선언
 * 사용방법 : <T> -> 아직 데이터 타입이 정해지지 않았음을 의미
 * 제너릭 적용 시, 데이터 타입은 컴파일 될 때 적용된다.
 * 1. 일반 클래스
 * public class Test {
 * 	private int a = 10;
 * 	
 * 	public Test() {
 * 	}
 * 	
 * 	public int getTest() {
 * 		return this.a;
 * 	}
 * 
 * 	public void setTest(int a) {
 * 		this.a = a;
 * 	}
 * }
 * 2. 제너릭 적용 클래스
 * public class Test<T> {
 * 	private <T> a;
 * 
 * 	public Test() {
 * 	}
 * 
 * 	public <T> getTest() {
 *		return this.a;
 * 	}
 * 
 * 	public <T> setTest(<T> a) {
 * 		this.a = a;
 * 	}
 * }
 * 3. 제너릭 적용 클래스 사용
 * public class Main {
 * 	public static void main(String[] args) {
 * 		Test<String> t1 = new Test<String>();
 * 		t1.setTest("addada");
 * 
 * 		Test<Integer> t2 = new Test<Integer>();
 * 		t2.setTest(3131); 
 * 	}
 * }
 * 
 */

/*
 * SOLID : 객체 지향의 5가지 원칙. 유지보수와 확장이 쉬운 SW를 만드는데 적용한다.
 * 
 * 1. SRP(Single Responsibility Principle) : 단일 책임 원칙
 * : sw의 설계 부품(클래스, 메서드 등)은 단 하나의 책임만 가져야한다. 독립적이어야한다.
 * 
 * 2. OCP(Open-Close principle) : 개방-폐쇄 원칙
 * : 기존의 코드를 변경하지 않고 기능을 수정하거나 추가할 수 있도록 설계해야 한다.
 * 
 * 3. LSP(Liskov Substitution Principle) : 리스코프 치환 원칙
 * : 자식 클래스는 부모 클래스에게 가능한 행위를 수행할 수 있어야 한다.
 * 
 * 4. ISP(Interface Segregation Principle): 인터페이스 분리 원칙
 * : 하나의 클래스는 자신이 사용하지 않는 인터페이스는 구현하지 말아야 한다.
 * : 하나의 일반적인 인터페이스보다는 여러개의 구체적인 인터페이스가 낫다.
 * 
 * 5. DIP(Dependency Inversion Principle): 의존관계 역전 원칙
 * : 의존 관계를 맺을 때, 변화하기 쉬운 것 보다 변화하기 어려운 것에 의존해야 한다.
 */

/*
 * LSP 적용 (Person / Programmer / PM 사용)
 */
public class Main {

	public static void main(String[] args) {
		// extends Person -> 자기타입이 아닌 부모타입으로 치환 -> 부모타입으로 Up Casting
		Person p1 = new Programmer(); 
		Person p2 = new PM();
		
		// 부모 클래스 타입으로 저장 받아도 자식클래스는 work() 메서드 사용가능
		p1.work(); 
		p2.work();
		
		Object p3 = new PM();
//		p3.work(); // 사용불가 -> Object로 선언 시 부모클래스의 메서드는 사용할 수 없다.
		
		// 1. 부모클래스 타입으로 형변환
		Person p4 = (Person)p3; // Object에서 Person으로 치환 -> Down Casting
		p4.work();
		// 2. 본인클래스 타입으로 형변환
		PM p5 = (PM)p3; // Object에서 PM으로 치환 -> Down Casting
		p5.work();
		
		/* 설계 시 주의사항
		 * 자식클래스의 멤버(필드) 변수는 선언하지 않는다.
		 * 부모클래스는 자식클래스의 멤버(필드) 변수를 알 수 없기 때문이다.
		 */
	}

}
