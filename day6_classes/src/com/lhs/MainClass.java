package com.lhs;

import com.lhs.test.Child2;

/*
 * 상속(extends) : 부모(super) 로부터 물려받은 자원을 자식이 그대로 사용하거나 수정해서 사용 가능.
 * 
 * Java는 한번에 하나의 클래스만 상속 가능
 * 예) public class ChildClass extends ParentClass, ParentClass2 {} : 불가능
 * 
 * 부모 클래스 -> 상속 -> 자식클래스 -> 상속 -> 자식2클래스 도 가능하다.
 * 부모의 데이터에 private가 붙어있을 경우 상속을해도 사용할 수 없다.
 * 생성자는 상속받지 못한다. 생성자를 제외한 나머지 자원을 상속받는다.
 * 부모클래스에서 상속받은 메서드를 그대로 사용해도 되고, 상속받은 메서드의 내부를 수정해 사용할 수도 있다.
 * override : 부모로부터 상속받은 메서드의 내부를 수정. 선언부를 수정하는 것이 아니다.
 * 
 * 상속을 사용하는 이유 : 메모리 효율 때문. 상속을 통해 생성 할 변수를 줄일 수 있다.
 * 상속은 클래스 파일이 상속되는 것이 아니라 객체가 상속되는 것이다. (부모객체 생성 -> 자식객체 생성) 
 */

/*
 * 접근 제어자 : 외부클래스가 내 클래스 내부의 자원(변수, 생성자, 메서드)을 접근할 수 있는 범위를 설정
 * 1. public : 가장 넓은 범위
 * 2. default : 같은 패키지 내에서만
 * 3. protected : 부모 자식 사이에서만
 * 4. private : 한 클래스 내에서만
 */

/*
 * interface : 코드의 유연성, 유지보수, 메서드에 대한 다형성
 * 
 * public interface 클래스명 { }
 * 
 * interface 클래스 구성
 * 1. 상수 선언 가능 : 컴파일 단계에서 int a = 10; -> final int a = 10; 이 된다.
 * 2. 메서드명 '만' 선언 가능
 * 3. 변수 선언 불가
 * 4. 생성자 선언 불가
 * 때문에 interface는 단독으로 사용하는 것이 아니라, 다른 클래스에 구현되어 사용된다. -> 객체 생성이 불가능하다.
 * 
 * 한 클래스에서 interface를 implements 할 때, 여러 interface를 implements 하는 것도 가능하다.
 * interface 끼리는 다중 상속이 가능하다.
 * 
 * 일반클래스 구성요소
 * 1. 변수
 * 2. 상수
 * 3. 생성자
 * 4. 메서드 (추상메서드 선언 불가능 -> public void sum(); 불가)
 * 
 * 추상클래스(일반클래스 + interface) 구성요소
 * 1. 변수
 * 2. 상수
 * 3. 생성자 : new는 사용 불가능하다.(객체 생성 불가)
 * 4. 메서드 (추상메서드 선언 가능)
 * 추상클래스 선언을 위해선 abstract 키워드가 필요하다.
 * 추상메서드는 컴파일 단계에서 public void sum(); -> public abstract void sum(); 으로 변경된다.
 */

/*
 * 미니 프로젝트 조건
 * 1. DB를 무조건 사용할 것 (테이블하나라도)
 * 2. 결과물을 HTML로 뿌릴 것
 * 3. 전체는 아니더라도 일부분에 thread가 들어갈 것
 * 4. Collection을 한 번이상 사용
 * 5. extends / interface / abstract 중 하나 이상 쓸 것
 * 발표자료에 소스코드 x 난 이걸 왜, 무엇 때문에 만들었고 이런 방법으로 만들었다
 */

public class MainClass {

	public static void main(String[] args) {
		ParentClass p = new ParentClass();
		System.out.println(p.toString());
		
		ChildClass c = new ChildClass();
		System.out.println(c.toString());
		
		/*
		 * 다른 패키지에 있는 클래스를 사용하기 위해서는 import 가 필요하다.
		 * c와 c2는 같은 부모를 상속받지만, c2는 다른 패키지에 있기 때문에 default로 선언된 값을 사용할 수 없다.
		 */
		Child2 c2 = new Child2(); 
		
		A a = new InterfaceTest();
		A a2 = new InterfaceTest2();
		// 인터페이스로 선언한 클래스는 내부에 만든 메서드만 사용할 수 있고, 변수는 사용할 수 없다.
		a.sum();
//		a.ccc; 
		// 추상클래스는 생성자는 가지고있지만, 단독으로 스스로의 객체를 만들지는 못한다. 그 생성자는 상속에서만 사용 가능하다.
//		ABClass abClass = new ABClass();
		
		ABChild abChild = new ABChild();
	}

}
