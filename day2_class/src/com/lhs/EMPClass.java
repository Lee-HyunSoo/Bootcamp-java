package com.lhs;

import java.util.ArrayList;

/*
 * main�� ���� Ŭ������ ���ο� �����ڰ� �ʿ��ϴ�.
 * ������ : �ٸ� Ŭ������ �� Ŭ������ ��ü�� ���� �� �ڵ����� ȣ��Ǵ� �޼���(�Լ�)
 * �Ϲ�Ŭ���� : main�� ���� Ŭ����, Ŭ���� ���Ϸδ� �ƹ� �۾��� ���� ���ϰ�, �ݵ�� ��üȭ �Ǿ�߸� ���� �� �� �ִ�.
 * �Ϲ�Ŭ������ ��üȭ ��Ű��� ��� : new Ŭ������()
 * Ŭ���� �ڽ��� �����ʹ� this�� �ٿ��� ���. Ž���ð��� �پ���.
 */

/*
 * Overloading : �� Ŭ���������� �̹� �����̸��� ���� �޼ҵ尡 �ִ��� ���� �̸����� ������ �� �ִ� ��
 * 1. �޼ҵ���� �����ؾ��Ѵ�.
 * 2. �Ű������� ������ Ʋ���ų�, ������ Ÿ���� �޶���Ѵ�.
 * ex) println
 * 
 * Overriding : �θ�Ŭ�������� ��ӹ��� �޼ҵ带 �ڽ�Ŭ�������� �������ϴ� ��
 * 1. �޼ҵ��, �Ű�����, ���ϰ��� ��� �����ؾ��Ѵ�.
 * 2. ������ ������ �޶󵵵ȴ�.
 */

/*
 * �޼���
 * 1. ������ġ : Ŭ���� ����
 * 2. ������
 *  1) public ��ȯŸ�� �ż����() { ���� }
 *  2) public ��ȯŸ�� �ż����() { ����, ��ȯ�� }
 *  3) public ��ȯŸ�� �ż����(�Ķ����) { ���� }
 *  4) public ��ȯŸ�� �ż����(�Ķ����) { ����, ��ȯ�� }
 */

public class EMPClass {
	String name;          // �̸�
	String joinDate;      // ������
	String lastVisitDate; // �����湮��
	int numVisit;         // �湮Ƚ��
	String gender;        // ����
	String age;           // ���ɴ�
	
	// �⺻ ������
	public EMPClass() {
		
	}
	
	// �⺻ �����ڿ� ���� �Ļ� ������ : Overloading
	public EMPClass(String data) {
		String[] splits = data.split(",");
		this.name = splits[0];
		this.joinDate = splits[1];
		this.lastVisitDate = splits[2];
		this.numVisit = Integer.parseInt(splits[3]);
		this.gender = splits[4];
		this.age = splits[5];
		
		this.setSplit(data);
	}
	
	// ���ڿ��� ���� �и��Ͽ� ���������� �����ϴ� �޼��� -> �������� �ϴ����� �ٿ��� �� �ִ�.
	public void setSplit(String data) {
		String[] splits = data.split(",");
		this.name = splits[0];
		this.joinDate = splits[1];
		this.lastVisitDate = splits[2];
		this.numVisit = Integer.parseInt(splits[3]);
		this.gender = splits[4];
		this.age = splits[5];
	}
}
