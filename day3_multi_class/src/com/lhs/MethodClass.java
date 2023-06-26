package com.lhs;

import java.util.ArrayList;

/*
 * MethodClass : 프로젝트에 필요한 공통적 메소드들만 보유하는 클래스
 */
public class MethodClass {

	public MethodClass() { // 기본 생성자

	}
	
	// 모든 클래스에서 갖다 쓸것이기 때문에 객체 생성이 필요가 없다. -> static으로 선언
	// MainClass의 main() 내에서 호출
	// main()에서는 실제 데이터를 보유한 members 배열을 전달!
	public static ArrayList<Integer> age(MemberClass[] members) {
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
		// 주민번호 앞자리 중 2개, 뒷자리 중 2개를 뽑아 비교 및 계산
		for (int i = 0; i < members.length; i++) {
			int firstNo = Integer.parseInt(members[i].firstNo.substring(0, 2));
			String lastNo = members[i].lastNo.substring(0, 1);
			if (lastNo.equals("1") || lastNo.equals("2"))
				ages.add(2023 - (1900 + firstNo));						
			else
				ages.add(2023 - (2000 + firstNo)); 
		}
		return ages;
	}
	
	public static int sumGrade(ArrayList<StudentClass> students) {
		int sum = 0;
		for (StudentClass student : students)
			sum += student.grade;
		return sum;
	}
}
