/**
 * 
 */
package com.lhs;

/**
 * @author LHS
 * Variable Test
 */
/*
 * public : �ٸ� class�� ���� ���� �㰡
 * class : class ������ ���� Ű����
 * VarClass : Ŭ������(ù ���ڴ� ���� �빮�ڷ� ����)
 * class ���ϸ� == class�� == �����ڸ�
 */
public class VarClass {

	/**
	 * @param args
	 */
	/*
	 * void : method �� ��ȯ ���� ���� ���
	 * main : �̸� ���� �Ұ�
	 * String[] : ���޵Ǵ� ������ Ÿ��
	 * args : �Ķ���͸�(�Ű�������) -> �ܺο��� ������ ���� ���޹޾� �����ϴ� ����
	 */
	public static void main(String[] args) {
		// ���� ���� : ������Ÿ�� ������; / ������Ÿ�� ������ = �ʱⰪ;
		// ����(int)�� ����޴� ���� ����
		
		int a;
		int b = 10;
		
		// ���� ��� : ����� ������ Ȱ��(���)
		a = 10;
		b = 100;
		// c = 300; c��� ���� ������ ���� ������ ����
		int d = a + b;
		int f, g, h;
		f = 1000;
		
		// ���� ���� Ÿ�� : int(����) / float(�Ǽ�)
		// �� ���� Ÿ�� : boolean (true / false)
		// ���� ���� : char (���� ���ڴ� ''�� ���μ� ����)
		// ���� ���ڴ� ���� �����ڵ尪
		
		// ������ Ư¡ : �� ���� �ϳ��� ���� ���� ����
		f = 1000;
		// g = 10, 20, 30;
		
		// ������ : �ݵ�� �ҹ��ڷ� ����
		// ��) �޿� : pay / �޿� ��� : payAvg
		
		// �ѹ��� ���� ���� ���� �����ϴ� ���� : �迭
		// �迭 ���� : ������Ÿ��[] �迭�� = new ������Ÿ��[���� ����] / ������Ÿ�� �迭��[] = new ������Ÿ��[���� ����]
		// ���� ������ ���� ���Ŀ� ���� �Ұ�
		int[] intArr = new int[5];
		int[] intArr2 = {10, 20, 30, 40, 50};
		intArr[0] = 100;
		intArr[1] = 200;
		intArr[2] = 300;
		intArr[3] = 400;
		intArr[4] = 500;
		
		intArr2[0] = 10000;
		
		int result = intArr[4] + intArr2[4];
		System.out.println(result);
		result = intArr[0] + intArr[1] + intArr[2] + intArr[3] + intArr[4];
		System.out.println(result);
		
		// intArr[5] = 22222;
	}
}
