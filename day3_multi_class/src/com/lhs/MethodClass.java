package com.lhs;

import java.util.ArrayList;

/*
 * MethodClass : ������Ʈ�� �ʿ��� ������ �޼ҵ�鸸 �����ϴ� Ŭ����
 */
public class MethodClass {

	public MethodClass() { // �⺻ ������

	}
	
	// ��� Ŭ�������� ���� �����̱� ������ ��ü ������ �ʿ䰡 ����. -> static���� ����
	// MainClass�� main() ������ ȣ��
	// main()������ ���� �����͸� ������ members �迭�� ����!
	public static ArrayList<Integer> age(MemberClass[] members) {
		ArrayList<Integer> ages = new ArrayList<Integer>();
		
		// �ֹι�ȣ ���ڸ� �� 2��, ���ڸ� �� 2���� �̾� �� �� ���
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
