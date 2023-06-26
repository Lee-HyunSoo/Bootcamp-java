package com.lhs;

import java.util.ArrayList;

/*
 * 클래스 내부 선언 변수 : 전역(필드, 속성, global) 변수
 * 클래스 내부 생성자 or 메서드에 선언된 변수 : 지역(local) 변수
 * method 앞에 get : 값을 추출 / method 앞에 set : 값을 설정
 * 
 * 나머지연산 : 특정 값을 3으로 나머지연산 한다 가정하면, 나머지는 0, 1, 2 중 하나로 결정. 개수 제한을 걸 수 있음
 * 비트연산 : 속도 가장 빠름
 */

/*
 * 배열 선언
 * 1. 데이터타입[] 배열명;
 * 2. 데이터타입[] 배열명 = new 데이터타입[갯수]
 * 3. 데이터타입[] 배열명 = {}
 * new : 생성키워드, 생성 후 앞의 변수명에 저장 됨
 */

/*
 * 데이터타입 종류
 * 1. 숫자형 : 정수, 실수 (int, float) -> 4byte
 * 2. 논리형 : boolean (true, false)
 * 3. 문자형 : char (사실 유니코드 값, int에 대입이 가능함) -> 2byte
 * 4. 문자열 : String
 * 
 * 소문자 데이터타입 : 기본 데이터타입
 * 대문자 데이터타입 : String.class라는 클래스가 존재하는 타입. 클래스기에 다양한 메서드를 가지고있다.
 */

public class EMPMainClass {

	public static void main(String[] args) {
		int[] age = {27, 34, 28, 26, 41, 28, 42, 29, 29, 32};
		String[] name = {"PJH","JDW","AJH","HST","HTW","LWS","LSD","YJH","JSW","LKO"};
		String[] phone = {"010-8532-0537","010-9672-5257","010-9932-4536","010-4117-0975","011-8975-7892","010-6251-6976","010-9482-6059","010-4845-0105","010-6283-4849","010-4510-1609"};
		char[] gender = {'F','M','F','M','M','F','M','M','F','M'};
		int[] pay = {460, 200, 250, 300, 300, 200, 350, 200, 400, 440};
		String[] code = {"JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE","KR"};

		// 참고 : Java 1.8에선 float 부분을 double로 써야 동작함
		// 1. 남자 사원의 평균 나이 구하기
		int sumAge = 0;
		int male = 0;
		for (int i = 0; i < age.length; i++) {
			if (gender[i] == 'M') {
				sumAge += age[i];
				male++;
			}
		}
		System.out.println("남자 사원의 평균 나이: " + (float)sumAge / male);
		
		// 2. 여자 사원의 평균 급여 구하기
		int sumPay = 0;
		int female = 0;
		for (int i = 0; i < pay.length; i++) {
			if (gender[i] == 'F') {
				sumPay += pay[i];
				female++;
			}
		}
		System.out.println("여자 사원의 평균 급여: " + (float)sumPay / female);
		
		/*
		 * split : 문자열 쪼개기
		 * split 앞엔 항상 문자열이 와야함
		 * split의 인자로 사용할 문자를 잘고르고, 저장은 String[]로
		 */

		// 3. 일본에 근무하는 사람들의 이름과 연락처 출력하기 (이름, 연락처)
		// answer1
		String inputCode = "JP";
		String names = "";
		String phones = "";
		String[] splitNames;
		String[] splitPhones;
		
		for (int i = 0; i < code.length; i++) {
			if (code[i] == inputCode) {
				names += (name[i] + " ");
				phones += (phone[i] + " ");
			}
		}
		splitNames = names.split(" ");
		splitPhones = phones.split(" ");
		
		// 항상 출력은 분리해서 쓰는 습관
		for (int i = 0; i < splitNames.length; i++)
			System.out.println("일본에 근무하는 사람들의 이름, 연락처: " + splitNames[i] + ", " + splitPhones[i]);
		
		// answer2 -> 나의 풀이
		ArrayList<String> nameCall = new ArrayList<String>();
		for (int i = 0; i < code.length; i++)
			if (code[i] == "JP")
				nameCall.add(name[i] + " " + phone[i]);
		
		for (int i = 0; i < nameCall.size(); i++) {
			String[] tmp = nameCall.get(i).split(" ");
			System.out.println("일본에 근무하는 사람들의 이름, 연락처: " + tmp[0] + ", " + tmp[1]);
		}
	}
}
