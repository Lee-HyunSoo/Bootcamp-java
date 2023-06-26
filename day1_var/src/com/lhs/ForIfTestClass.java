package com.lhs;


public class ForIfTestClass {

	public static void main(String[] args) {
		int[] age = {27, 34, 28, 26, 41, 28, 42, 29, 29, 32};
		
		// 1. ������ ��(ageSum) ���ϱ�
		int ageSum = 0;
		for (int i = 0; i < age.length; i++)
			ageSum += age[i];
		System.out.println("������ ��: " + ageSum);
		
		// 2. ��� ����(ageAvg) ���ϱ�
		float ageAvg = (float)ageSum / age.length;
		System.out.println("��� ����: " + ageAvg);
		
		// 3. ��� ���̺��� ���� �ο� ��(num) ���ϱ�
		int num = 0;
		for (int i = 0; i < age.length; i++)
			if (age[i] > ageAvg)
				num++;
		System.out.println("��� ���̺��� ���� �ο� ��: " + num);
		
		// ���ڿ��� �����ϰ� ���� ��� ������ Ÿ�� : String
		// ���ڿ��� �ݵ�� ""���� ���ξ� �Ѵ�
		String t1 = "a";
		String t2 = "abc";
		String t3 = "��";
		String t4 = "��";
		String t5 = "��";
		// "����, Ư����ȣ, ����" => �� ���ڴ� 1byte
		// "�ѱ�" => 2byte (����: Oracle���� 3byte)
		
		String[] name = {"PJH","JDW","AJH","HST","HTW","LWS","LSD","YJH","JSW","LKO"};
		int[] pay = {460, 200, 250, 300, 300, 200, 350, 200, 400, 440};
		
		// �޿��� 300�� ����� �̴ϼ��� ����ϱ�
		for (int i = 0; i < name.length; i++)
			if (pay[i] == 300)
				System.out.println("�޿��� 300�� ���: " + name[i]);
	
		// �޿��� 300�� ����� �̴ϼ� ����ϱ�2
		// ���ڿ� ����(+), ���ڿ� + ���ڵ� ���� -> ����� ���ڿ�
		String initial = "";
		for (int i = 0; i < name.length; i++)
			if (pay[i] == 300)
				initial += (name[i] + " ");
		System.out.println("�޿��� 300�� ���: " + initial);
	}
}
