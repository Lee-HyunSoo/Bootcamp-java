package com.lhs;


public class ForIfTestClass {

	public static void main(String[] args) {
		int[] age = {27, 34, 28, 26, 41, 28, 42, 29, 29, 32};
		
		// 1. 나이의 합(ageSum) 구하기
		int ageSum = 0;
		for (int i = 0; i < age.length; i++)
			ageSum += age[i];
		System.out.println("나이의 합: " + ageSum);
		
		// 2. 평균 나이(ageAvg) 구하기
		float ageAvg = (float)ageSum / age.length;
		System.out.println("평균 나이: " + ageAvg);
		
		// 3. 평균 나이보다 많은 인원 수(num) 구하기
		int num = 0;
		for (int i = 0; i < age.length; i++)
			if (age[i] > ageAvg)
				num++;
		System.out.println("평균 나이보다 많은 인원 수: " + num);
		
		// 문자열을 저장하고 싶을 경우 데이터 타입 : String
		// 문자열은 반드시 ""으로 감싸야 한다
		String t1 = "a";
		String t2 = "abc";
		String t3 = "ㄱ";
		String t4 = "가";
		String t5 = "값";
		// "영문, 특수기호, 숫자" => 한 글자당 1byte
		// "한글" => 2byte (참고: Oracle에선 3byte)
		
		String[] name = {"PJH","JDW","AJH","HST","HTW","LWS","LSD","YJH","JSW","LKO"};
		int[] pay = {460, 200, 250, 300, 300, 200, 350, 200, 400, 440};
		
		// 급여가 300인 사람의 이니셜을 출력하기
		for (int i = 0; i < name.length; i++)
			if (pay[i] == 300)
				System.out.println("급여가 300인 사람: " + name[i]);
	
		// 급여가 300인 사람의 이니셜 출력하기2
		// 문자열 연산(+), 문자열 + 숫자도 가능 -> 결과는 문자열
		String initial = "";
		for (int i = 0; i < name.length; i++)
			if (pay[i] == 300)
				initial += (name[i] + " ");
		System.out.println("급여가 300인 사람: " + initial);
	}
}
