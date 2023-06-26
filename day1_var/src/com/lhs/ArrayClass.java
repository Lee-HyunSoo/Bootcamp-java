package com.lhs;

public class ArrayClass {

	public static void main(String[] args) {
		//				0, 	1,	2,	3,	4
		int[] intArr = {10, 20, 30, 40, 50};
		System.out.println("intArr의 데이터 갯수: " + intArr.length);
		
		/*
		 * intArr의 데이터들을 합하고 싶을 경우
		 * 1. 각 index를 이용하여 각각의 값을 꺼내어(추출하여) 합
		 * 2. 반복문 : for(반복문 내에서 사용할 변수 선언; 반복문을 멈추기 위한 조건 ; 증감) {조건이 참이었을 경우 해야할 일들}
		 */
		int sum1 = intArr[0] + intArr[1] + intArr[2] + intArr[3] + intArr[4];
		System.out.println(sum1);
		
		int sum2 = 0;
		for (int n = 0; n < intArr.length; n++) {
			System.out.println("n의 현재값 : " + n);
			sum2 += intArr[n];
		}
		System.out.println(sum2);
	}
}
