package com.lhs;

import java.util.ArrayList;

/*
 * PrintClass : 출력에 해당하는 메서드들만 보유
 * 추후, HTML과 같은 GUI, UI들로 대체
 * View 역할
 */
public class PrintClass {

	public PrintClass() { // 기본생성자
	}
	
	public static void prn(ArrayList<Integer> ages) { // 사용자 정의 메서드
		for (int age : ages)
			System.out.println(age);
	}
	
	public static void prn(int sum) {
		System.out.println("성적 합: " + sum);
	}
}
