package com.lhs;

import java.util.ArrayList;

/*
 * 기본 데이터 타입
 * 정수 : byte(1) short(2) int(4) long(8)
 * 실수 : float(4) double(8)
 * 논리 : boolean
 * 문자 : char(2)
 * char a = 45; -> 문자는 유니코드 값이기 떄문에 이런식으로 사용가능하다.
 * int t = a; -> char 타입을 int타입으로 알아서 바꿔버린 것. 암묵적 형변환에 속한다.
 * int t = (int)a; -> 이런식으로 작성해야 명시적 형변환이 된다.
 * 
 * 참조(클래스) 데이터 타입 -> 반드시 클래스가 존재하고 있어야한다.
 * 문자열 : String
 * 
 * 데이터 타입 변환 (형변환)
 * up : 작은 타입이 큰 타입으로 변하는 것. ex) byte a = 10; short b = 20; -> b = a;
 * down : 큰 타입이 작은 타입으로 변하는 것. ex) a = b;
 * 명시적 : 암묵적보단 명시적을 사용하자.
 * 암묵적 : 위의 b = a; 처럼 자바에게 알아서 변환하라고 시키는 것. 개발자가 직접 확인하며 하는 것이 아니기 때문에 위험한 형변환이다.
 * 
 * MemberClass m1 = new MemberClass();
 * Object m2 = new MemberClass(); -> MemberClass 라는 자식클래스를 부모인 Object 로 선언했기 때문에 up scale 이라 할 수 있다.
 * MemberClass m3 = (MemberClass)m2(); -> 조상타입을 자식타입으로 강제로 변환하는 것. 명시적 형변환에 속한다.
 * 
 * 조건 : if(비교 조건문) {} / if(비교 조건문) {} else {}
 * 비교
 * 1. 산술비교(==, !=, <, >, <=, >=)
 * 2. 논리비교(&, |, !)
 * 	and : true & true -> true
 * 	or : false | false -> false
 * 	not : !true -> false 
 * 반복 : for ( ; ; ) { }
 * 
 * 검색(조회) : for 내부에 if
 * 	break : 반복문을 중간에 멈추기 위해 사용
 * 
 * 배열 : 한번에 다중값을 저장할 경우 사용, 배열의 한번 정해진 길이는 변경 불가능 
 * 	선언 : 데이터타입[] 배열명; / 데이터타입[] 배열명 = new 데이터타입[갯수] / 데이터타입[] 배열명 = {}
 * 	사용 : 배열은 데이터의 위치를 지정하는 index 가 존재한다. index는 항상 0 부터 시작하고, 정수이다.
 * 
 * 배열에 데이터를 설정(대입) 하는 경우 : 배열명[index] = 데이터
 * 배열로부터 데이터를 추출하는 경우 : 저장할 변수 = 배열명[index]
 * 주의사항 : 배열의 index를 벗어나는 경우 코드 상에서는 오류가 없지만 컴파일러에서 오류가 발생한다.
 * 
 * 문자열 다루기 : String.class -> 자바에서 제공해주는 클래스
 * String s1 = new String("문자열"); -> 원래 이게 정식 코드지만, 문자열을 너무 많이 쓰다보니 String s2 = "문자열"; 이렇게 써도 되게했다.
 * 
 * 문자열 비교 : s1.equals("비교 할 문자열")
 * String s1 = new String("abcd");
 * 이렇게 선언할 경우 "abcd"라는 문자열이 저장되어있는게 아니라 String으로 감싸진 객체가 저장된다.
 * 하지만 브라우저 상에서 String input = "abcd" 라고 들어온다면, 이 부분은 순수 문자열로 들어올 가능성이 높다.
 * 때문에 s1과 input을 == 으로 비교해버리면, false가 나올 확률이 굉장히 높아진다.
 * 이 상황에서, equals로 비교를 한다면 String 객체를 뜯어내 순수 문자열만 비교하기 때문에 에러가 나지 않는다.
 * 
 * 문자열 분리 : String.split("구분자")
 * String text = "<html><head></head><body></body></html>";
 * String[] splits = text.split("<body>") -> 이와같이 특정 단어로도 분리 가능하다. 분리 후 구분자 부분은 사라진다.
 * splits[0] = "<html><head></head>", splits[1] = "</body></html>"
 * 
 * String text = "문, 자, 열,  분, 리";
 * String[] splits = text1.split("  ") -> 띄어쓰기 2개가 기준이 될 수 있다.
 * splits[0] = "문, 자, 열," splits[1] = "분, 리"
 * 
 * 문자열 추출 : String.subString()
 * 1. 지정위치부터 마지막까지 : String.subString(startIndex)
 * 2. 지정위치부터 지정위치까지 : String.subString(startIndex, endIndex)
 * 
 * String text = "문자열의 일부분"
 * String end = text.subString(5); // "일부분"
 * String between = text.subString(2, 4); // "열의"
 * 
 * String에 저장되는 문자열은 내부에 index 번호가 배열처럼 자동 부여된다.
 * 
 * 클래스의 종류
 * 1. main()을 포함하는 클래스 : 하나의 프로젝트에 단 하나만 존재해야 한다. -> 프로젝트 실행 시 초기 진입점이기 때문
 * 2. 일반 클래스 : main()을 포함하는 클래스의 일을 분리시키고자 사용한다.
 * 	1) 클래스 선언부
 * 	2) 변수(클래스 영역 변수)
 * 	3) 생성자 : 클래스를 new 연산자로 객체화 시킬 때, 자동 호출되는 메서드
 * 	4) 메서드 : 클래스 내 또는 다른 클래스에서 호출하여 사용되는 메서드
 * 3. interface 클래스 : 객체의 유연성(데이터 타입)을 부여하기 위해 사용, 선언 시 'class' 키워드 대신 'interface'를 이용하여 선언
 * 	1) interface 선언부
 * 	2) 상수 : 한번 설정한 값을 변경하지 못하도록 선언된 변수
 * 	3) 추상메서드
 * 4. 추상클래스 : 일반클래스와 interface의 기능을 묶어놓은 클래스, 'class' 키워드 앞에 추상을 뜻하는 'abstract'를 붙인다.
 * 	1) abstract class 키워드를 이용하여 클래스 선언
 * 	2) 변수(클래스변수)
 * 	3) 생성자 -> new로 객체 생성 불가능, 상속에서 사용되는 생성자이다.
 * 	4) 메서드
 * 	5) 추상클래스
 * 
 * 자바에서 생성되는 모든 클래스는 내부적으로 java.lang.Object.class를 이용(상속)하여 선언된다.
 * 따라서 모든 클래스의 객체는 Object 타입으로 저장 가능하다.
 * 단, 클래스 내부에서 선언된 변수, 메서드들은 사용 불가능하다. (생성자는 호출한다)
 * Object 타입으로 저장받은 객체의 변수, 메서드들을 사용하려면 반드시 원래 타입으로 형변환을 해야한다.
 * 이러한 단점을 해결하기 위해 사용하는 것이 interface이다. 
 * 
 * 클래스 파일을 이용한 객체 생성 : new를 이용하여 생성, 클래스 파일은 반드시 객체화가 되어야만 클래스 본연의 기능을 사용할 수 있다.
 * 
 * 객체 생성 순서
 * MemberClass m1 = new MemberClass()
 * 1. new MemberClass(); 에서 객체 생성이 완료되어야 한다.
 * 2. MemberClass와 동일한 이름을 가지는 클래스 파일이 존재하는지를 검색
 * 3. 존재하면 MemberClass 내부에 선언할 수 있는 것은 모두 선언
 * 4. 선언 완료 후 MemberClass 내부에 MemberClass() 생성자를 호출한다.
 * 5. new 연산자를 이용하여 객체 생성을 완료한다.
 * 6. 생성 완료된 객체를 동일 형태의 구조를 갖는 m1에 대입(할당)
 */

/*
 * 1. 전체적인 구조 잡기
 * 2. 메서드는 기본구조만 만들어 놓고, 추후 변경 
 * 3. 정보클래스(멤버클래스 같은 것)
 * 4. 데이터클래스 : 정보클래스를 이용하여 전체 데이터 저장
 * 5. MainClass에서 각 데이터가 제대로 들어갔는지 확인 및 각 메서드가 잘 호출되는지 확인
 */

/*
 * 형상관리 (version 관리)
 * 1. git 
 * 2. svn (naver 쪽에서 주로 많이 사용)
 */

/*
 * MainClass : 프로젝트 전체를 컨트롤하는 역할
 * Controller 역할
 */

/*
 * 1. MainClass
 * 2. DataClass
 * 3. MemberClass
 * 4. MethodClass
 * 5. PrintClass
 */
public class MainClass {
	
	/*
	 * 이 변수 앞에 static이 없다면 main 메서드 안에서 사용할 수 없다. main 메서드는 static 영역에 선언되어 있기 때문이다.
	 * static이 붙은 변수는 모든 객체의 공유 변수가 된다.
	 * 즉, static을 붙여두면 객체 선언을 안해도 되서 편리하지만, 공유변수가 되기 때문에 주의해서 사용해야한다.
	 */
	static String s = "aaaas";
	
	static int a = 10; 
	static final int b = 100; // final : 초기 설정값을 변경하지 못하도록 막아주는 키워드

	public static void main(String[] args) {
		MemberClass m1 = new MemberClass();
		Object m2 = new MemberClass();
		MemberClass m3 = (MemberClass) m2; // 조상타입은 자식타입으로 못들어가기 때문에 형변환을 해야한다.
		
		m1.a = 1000;
		System.out.println(m1.a + " " + m3.a);
		
		/*
		 * static 변수는 일반변수와 다르게 생성되는 위치가 다르다.
		 * static 변수는 객체 내부에 선언되는게 아니라 클래스 내부에 선언된다.
		 * 때문에 객체의 생성 필요없이 클래스 단에서 직접 접근이 가능하다.
		 */
		m1.b = 20000;
		System.out.println(m1.b + " " + m3.b);
		MemberClass.b = 123456; // 클래스 단에서 직접 static 변수에 접근
		System.out.println(m1.b + " " + m3.b);
		System.out.println(s);
		
		a = 3300;
		// b = 4400; // final이 붙은 변수는 초기에 한번 값을 지정하면 더이상 수정 불가능하다.(상수)
		
		// 실제 데이터는 dataclass 객체 내의 MemberClass에 존재
		DataClass dataClass = new DataClass();
		ArrayList<Integer> ages = MethodClass.age(dataClass.members);
		PrintClass.prn(ages);
		
		int sum = MethodClass.sumGrade(dataClass.students);
		PrintClass.prn(sum);
	}
}
