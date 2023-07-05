package com.lhs;

import java.util.ArrayList;
import java.util.Map;

import com.lhs.dto.Bootcamp;

public class PrintResult {

	public PrintResult() {
	}
	
	public static void printMenu() {
		System.out.println("원하는 작업 번호를 입력해 주세요..");
		System.out.println("1. 전체 레코드 조회");
		System.out.println("2. 성별이 기타인 사람 성별 수정");
		System.out.println("3. 멤버 추가");
		System.out.println("4. 평균 방문횟수보다 많이 방문한 사람 명단");
		System.out.println("5. 나이 비공개인 사람들의 방문 횟수");
		System.out.println("6. 작업 종료");
		System.out.print("입력 : ");
	}
	
	public static void printSelectAll(ArrayList<Bootcamp> bootcamps) {
		for (Bootcamp b : bootcamps)
			System.out.println(b.toString());
	}
	
	public static void printSelectOverVisitNoAvg(Map<String, Integer> map) {
		System.out.println("----- 평균보다 많이 방문한 사람 -----");
		for (Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println(entry.getKey() + "의 방문 횟수: " + entry.getValue());
	}
	
	public static void printSelectClosedAge(Map<String, Integer> map) {
		System.out.println("----- 나이 비공개인 사람 -----");
		for (Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println(entry.getKey() + "의 방문 횟수: " + entry.getValue());
	}

}
