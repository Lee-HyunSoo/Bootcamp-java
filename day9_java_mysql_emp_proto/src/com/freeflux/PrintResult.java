package com.freeflux;

import java.util.ArrayList;
import java.util.Map;

import com.freeflux.dto.Employee;

public class PrintResult {

	public PrintResult() {
	}

	public static void printMenu() {
		System.out.println();
		System.out.println("원하는 작업 번호를 입력해 주세요..");
		System.out.println("1. 전체사원조회 / 2. 사원추가 / 3. 전사원 급여10%올림 / 4. 과장 직책 사원 삭제 / 5. 작업 종료:  ");
	}
	
	public static void printSelectAll(ArrayList<Employee> employees) {
		for (Employee e : employees)
			System.out.println(e.toString());
	}
	
}
