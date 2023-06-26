/**
 * 
 */
package com.lhs;

/**
 * @author LHS
 * Variable Test
 */
/*
 * public : 다른 class에 대한 접근 허가
 * class : class 선언을 위한 키워드
 * VarClass : 클래스명(첫 글자는 영문 대문자로 시작)
 * class 파일명 == class명 == 생성자명
 */
public class VarClass {

	/**
	 * @param args
	 */
	/*
	 * void : method 내 반환 값이 없는 경우
	 * main : 이름 변경 불가
	 * String[] : 전달되는 데이터 타입
	 * args : 파라미터명(매개변수명) -> 외부에서 보내는 값을 전달받아 저장하는 변수
	 */
	public static void main(String[] args) {
		// 변수 선언 : 데이터타입 변수명; / 데이터타입 변수명 = 초기값;
		// 정수(int)를 저장받는 변수 선언
		
		int a;
		int b = 10;
		
		// 변수 사용 : 선언된 변수를 활용(사용)
		a = 10;
		b = 100;
		// c = 300; c라는 변수 선언이 없기 때문에 오류
		int d = a + b;
		int f, g, h;
		f = 1000;
		
		// 숫자 관련 타입 : int(정수) / float(실수)
		// 논리 관련 타입 : boolean (true / false)
		// 단일 문자 : char (단일 문자는 ''로 감싸서 설정)
		// 단일 문자는 원래 유니코드값
		
		// 변수의 특징 : 한 번에 하나의 값만 저장 가능
		f = 1000;
		// g = 10, 20, 30;
		
		// 변수명 : 반드시 소문자로 시작
		// 예) 급여 : pay / 급여 평균 : payAvg
		
		// 한번에 여러 개의 값을 저장하는 변수 : 배열
		// 배열 선언 : 데이터타입[] 배열명 = new 데이터타입[저장 갯수] / 데이터타입 배열명[] = new 데이터타입[저장 갯수]
		// 저장 갯수는 선언 이후에 변경 불가
		int[] intArr = new int[5];
		int[] intArr2 = {10, 20, 30, 40, 50};
		intArr[0] = 100;
		intArr[1] = 200;
		intArr[2] = 300;
		intArr[3] = 400;
		intArr[4] = 500;
		
		intArr2[0] = 10000;
		
		int result = intArr[4] + intArr2[4];
		System.out.println(result);
		result = intArr[0] + intArr[1] + intArr[2] + intArr[3] + intArr[4];
		System.out.println(result);
		
		// intArr[5] = 22222;
	}
}
