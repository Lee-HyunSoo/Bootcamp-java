package com.lhs;

public class MainClass {

	public static void main(String[] args) {
		String test = "임재,20190509,20190510,8,남,30대후반";
		String[] splits = test.split(",");
		
		String date1 = splits[1];
		System.out.println(date1);
		
		/*
		 * 만약 연도를 뽑고 싶다면? 0 ~ 3까지, '4 이전까지' 뽑아야함
		 * 시작~ 끝까지 substring하고 싶으면 시작 index만 적으면된다.
		 * String.substring(startIndex, endIndex)
		 * String.substring(startIndex)
		 */
		
		String year = date1.substring(0, 4);
		System.out.println(year);
		
		String month = date1.substring(4, 6);
		System.out.println(month);
		
		String day = date1.substring(6);
		System.out.println(day);
		
		String name = splits[0];
		
		
		// 문자열 형태의 숫자는 (int) 처럼 강제로 형변환을 할 수 없다.
		// 외부에서 입력받은 모든 숫자는 내부에서 문자열로 전달되기 때문에 반드시 Integer.parseInt()를 이용해 숫자로 변환시켜야 한다.
		// 팁 : 숫자를 문자열로 바꿀 땐 String.valueof() 를 사용하면된다.
		int age = Integer.parseInt(splits[5].substring(0, 2));
		
		/*
		 * 1. EMPClass.class 파일 검색 -> EMPClass
		 * 2. EMPClass.class 파일 내부 선언 -> EMPClass
		 * 3. EMPClass.class 파일 내부에서 EMPClass 이름과 동일한 생성자 호출 -> EMPClass()
		 * 4. 생성자를 이용하여 EMPClass 객체 생성 -> new EMPClass()
		 * 5. 생성된 객체를 변수(객체명)에 저장 -> EMPClass empClass = new EMPClass()
		 */
		
		EMPClass empClass1 = new EMPClass();
		empClass1.name = "test";
		
		EMPClass empClass2 = new EMPClass();
		empClass2.name = "sample";
		
		System.out.println(empClass1.name);
		System.out.println(empClass2.name);
		
		/*
		 * 하나의 클래스는 자기자신 뿐만아니라 부모타입으로도 생성할 수 있다.
		 * 하지만 자식 클래스에서 만든 내용은 사용할 수 없다. ex) 조선시대는 비행기를 모른다.
		 */
		Object empObject = new EMPClass(test);
		
		EMPClass empClass3 = new EMPClass("임재,20190509,20190510,8,남,30대후반");
		EMPClass empClass4 = new EMPClass("성열,20190509,20190510,1,남,30대중반");
		System.out.println(empClass3.age);
		System.out.println(empClass4.age);
		
		String[] members = new String[3];
		members[0] = "임재,20190509,20190510,8,남,30대후반";
		members[1] = "성열,20190509,20190510,1,남,30대중반";
		members[2] = "재희,20190426,20190426,2,여,40대후반";
		
		int number = members.length;
		EMPClass[] empClasses = new EMPClass[number];
		for (int i = 0; i < number; i++)
			empClasses[i] = new EMPClass(members[i]);
		
		for (int i = 0; i < number; i++)
			// 배열의 index를 초과하면 null값을 보냄 -> NullPointerException
			System.out.println(empClasses[i].name);
		
		// 회원의 성비를 구하시오
		int male = 0;
		int female = 0;
		for (EMPClass empClass : empClasses) {
			if (empClass.gender.equals("남"))
				male++;
			else
				female++;	
		}
		System.out.println("남:여 = " + male + ":" + female);
		
		// 남여 각각의 비율
		System.out.println("남자 비율: " + (float)male / empClasses.length);
		System.out.println("여자 비율: " + (float)female / empClasses.length);
	}
}
