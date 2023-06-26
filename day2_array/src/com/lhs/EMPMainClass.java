package com.lhs;

import java.util.ArrayList;

/*
 * Ŭ���� ���� ���� ���� : ����(�ʵ�, �Ӽ�, global) ����
 * Ŭ���� ���� ������ or �޼��忡 ����� ���� : ����(local) ����
 * method �տ� get : ���� ���� / method �տ� set : ���� ����
 * 
 * ���������� : Ư�� ���� 3���� ���������� �Ѵ� �����ϸ�, �������� 0, 1, 2 �� �ϳ��� ����. ���� ������ �� �� ����
 * ��Ʈ���� : �ӵ� ���� ����
 */

/*
 * �迭 ����
 * 1. ������Ÿ��[] �迭��;
 * 2. ������Ÿ��[] �迭�� = new ������Ÿ��[����]
 * 3. ������Ÿ��[] �迭�� = {}
 * new : ����Ű����, ���� �� ���� ������ ���� ��
 */

/*
 * ������Ÿ�� ����
 * 1. ������ : ����, �Ǽ� (int, float) -> 4byte
 * 2. ���� : boolean (true, false)
 * 3. ������ : char (��� �����ڵ� ��, int�� ������ ������) -> 2byte
 * 4. ���ڿ� : String
 * 
 * �ҹ��� ������Ÿ�� : �⺻ ������Ÿ��
 * �빮�� ������Ÿ�� : String.class��� Ŭ������ �����ϴ� Ÿ��. Ŭ�����⿡ �پ��� �޼��带 �������ִ�.
 */

public class EMPMainClass {

	public static void main(String[] args) {
		int[] age = {27, 34, 28, 26, 41, 28, 42, 29, 29, 32};
		String[] name = {"PJH","JDW","AJH","HST","HTW","LWS","LSD","YJH","JSW","LKO"};
		String[] phone = {"010-8532-0537","010-9672-5257","010-9932-4536","010-4117-0975","011-8975-7892","010-6251-6976","010-9482-6059","010-4845-0105","010-6283-4849","010-4510-1609"};
		char[] gender = {'F','M','F','M','M','F','M','M','F','M'};
		int[] pay = {460, 200, 250, 300, 300, 200, 350, 200, 400, 440};
		String[] code = {"JP", "FR", "JP", "US", "CN", "DE", "KR", "JP", "DE","KR"};

		// ���� : Java 1.8���� float �κ��� double�� ��� ������
		// 1. ���� ����� ��� ���� ���ϱ�
		int sumAge = 0;
		int male = 0;
		for (int i = 0; i < age.length; i++) {
			if (gender[i] == 'M') {
				sumAge += age[i];
				male++;
			}
		}
		System.out.println("���� ����� ��� ����: " + (float)sumAge / male);
		
		// 2. ���� ����� ��� �޿� ���ϱ�
		int sumPay = 0;
		int female = 0;
		for (int i = 0; i < pay.length; i++) {
			if (gender[i] == 'F') {
				sumPay += pay[i];
				female++;
			}
		}
		System.out.println("���� ����� ��� �޿�: " + (float)sumPay / female);
		
		/*
		 * split : ���ڿ� �ɰ���
		 * split �տ� �׻� ���ڿ��� �;���
		 * split�� ���ڷ� ����� ���ڸ� �߰���, ������ String[]��
		 */

		// 3. �Ϻ��� �ٹ��ϴ� ������� �̸��� ����ó ����ϱ� (�̸�, ����ó)
		// answer1
		String inputCode = "JP";
		String names = "";
		String phones = "";
		String[] splitNames;
		String[] splitPhones;
		
		for (int i = 0; i < code.length; i++) {
			if (code[i] == inputCode) {
				names += (name[i] + " ");
				phones += (phone[i] + " ");
			}
		}
		splitNames = names.split(" ");
		splitPhones = phones.split(" ");
		
		// �׻� ����� �и��ؼ� ���� ����
		for (int i = 0; i < splitNames.length; i++)
			System.out.println("�Ϻ��� �ٹ��ϴ� ������� �̸�, ����ó: " + splitNames[i] + ", " + splitPhones[i]);
		
		// answer2 -> ���� Ǯ��
		ArrayList<String> nameCall = new ArrayList<String>();
		for (int i = 0; i < code.length; i++)
			if (code[i] == "JP")
				nameCall.add(name[i] + " " + phone[i]);
		
		for (int i = 0; i < nameCall.size(); i++) {
			String[] tmp = nameCall.get(i).split(" ");
			System.out.println("�Ϻ��� �ٹ��ϴ� ������� �̸�, ����ó: " + tmp[0] + ", " + tmp[1]);
		}
	}
}
