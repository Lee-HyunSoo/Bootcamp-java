package com.lhs;

public class ArrayClass {

	public static void main(String[] args) {
		//				0, 	1,	2,	3,	4
		int[] intArr = {10, 20, 30, 40, 50};
		System.out.println("intArr�� ������ ����: " + intArr.length);
		
		/*
		 * intArr�� �����͵��� ���ϰ� ���� ���
		 * 1. �� index�� �̿��Ͽ� ������ ���� ������(�����Ͽ�) ��
		 * 2. �ݺ��� : for(�ݺ��� ������ ����� ���� ����; �ݺ����� ���߱� ���� ���� ; ����) {������ ���̾��� ��� �ؾ��� �ϵ�}
		 */
		int sum1 = intArr[0] + intArr[1] + intArr[2] + intArr[3] + intArr[4];
		System.out.println(sum1);
		
		int sum2 = 0;
		for (int n = 0; n < intArr.length; n++) {
			System.out.println("n�� ���簪 : " + n);
			sum2 += intArr[n];
		}
		System.out.println(sum2);
	}
}
