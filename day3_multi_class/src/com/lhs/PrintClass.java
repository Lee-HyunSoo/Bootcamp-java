package com.lhs;

import java.util.ArrayList;

/*
 * PrintClass : ��¿� �ش��ϴ� �޼���鸸 ����
 * ����, HTML�� ���� GUI, UI��� ��ü
 * View ����
 */
public class PrintClass {

	public PrintClass() { // �⺻������
	}
	
	public static void prn(ArrayList<Integer> ages) { // ����� ���� �޼���
		for (int age : ages)
			System.out.println(age);
	}
	
	public static void prn(int sum) {
		System.out.println("���� ��: " + sum);
	}
}
