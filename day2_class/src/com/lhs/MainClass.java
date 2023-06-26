package com.lhs;

public class MainClass {

	public static void main(String[] args) {
		String test = "����,20190509,20190510,8,��,30���Ĺ�";
		String[] splits = test.split(",");
		
		String date1 = splits[1];
		System.out.println(date1);
		
		/*
		 * ���� ������ �̰� �ʹٸ�? 0 ~ 3����, '4 ��������' �̾ƾ���
		 * ����~ ������ substring�ϰ� ������ ���� index�� ������ȴ�.
		 * String.substring(startIndex, endIndex)
		 * String.substring(startIndex)
		 */
		
		String year = date1.substring(0, 4);
		System.out.println(year);
		
		String month = date1.substring(4, 6);
		System.out.println(month);
		
		String day = date1.substring(6);
		System.out.println(day);
		
		String name = splits[0];
		
		
		// ���ڿ� ������ ���ڴ� (int) ó�� ������ ����ȯ�� �� �� ����.
		// �ܺο��� �Է¹��� ��� ���ڴ� ���ο��� ���ڿ��� ���޵Ǳ� ������ �ݵ�� Integer.parseInt()�� �̿��� ���ڷ� ��ȯ���Ѿ� �Ѵ�.
		// �� : ���ڸ� ���ڿ��� �ٲ� �� String.valueof() �� ����ϸ�ȴ�.
		int age = Integer.parseInt(splits[5].substring(0, 2));
		
		/*
		 * 1. EMPClass.class ���� �˻� -> EMPClass
		 * 2. EMPClass.class ���� ���� ���� -> EMPClass
		 * 3. EMPClass.class ���� ���ο��� EMPClass �̸��� ������ ������ ȣ�� -> EMPClass()
		 * 4. �����ڸ� �̿��Ͽ� EMPClass ��ü ���� -> new EMPClass()
		 * 5. ������ ��ü�� ����(��ü��)�� ���� -> EMPClass empClass = new EMPClass()
		 */
		
		EMPClass empClass1 = new EMPClass();
		empClass1.name = "test";
		
		EMPClass empClass2 = new EMPClass();
		empClass2.name = "sample";
		
		System.out.println(empClass1.name);
		System.out.println(empClass2.name);
		
		/*
		 * �ϳ��� Ŭ������ �ڱ��ڽ� �Ӹ��ƴ϶� �θ�Ÿ�����ε� ������ �� �ִ�.
		 * ������ �ڽ� Ŭ�������� ���� ������ ����� �� ����. ex) �����ô�� ����⸦ �𸥴�.
		 */
		Object empObject = new EMPClass(test);
		
		EMPClass empClass3 = new EMPClass("����,20190509,20190510,8,��,30���Ĺ�");
		EMPClass empClass4 = new EMPClass("����,20190509,20190510,1,��,30���߹�");
		System.out.println(empClass3.age);
		System.out.println(empClass4.age);
		
		String[] members = new String[3];
		members[0] = "����,20190509,20190510,8,��,30���Ĺ�";
		members[1] = "����,20190509,20190510,1,��,30���߹�";
		members[2] = "����,20190426,20190426,2,��,40���Ĺ�";
		
		int number = members.length;
		EMPClass[] empClasses = new EMPClass[number];
		for (int i = 0; i < number; i++)
			empClasses[i] = new EMPClass(members[i]);
		
		for (int i = 0; i < number; i++)
			// �迭�� index�� �ʰ��ϸ� null���� ���� -> NullPointerException
			System.out.println(empClasses[i].name);
		
		// ȸ���� ���� ���Ͻÿ�
		int male = 0;
		int female = 0;
		for (EMPClass empClass : empClasses) {
			if (empClass.gender.equals("��"))
				male++;
			else
				female++;	
		}
		System.out.println("��:�� = " + male + ":" + female);
		
		// ���� ������ ����
		System.out.println("���� ����: " + (float)male / empClasses.length);
		System.out.println("���� ����: " + (float)female / empClasses.length);
	}
}
