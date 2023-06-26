package com.lhs;

/*
 * �� ȸ���� ������ �ϳ��� �����ִ� ����
 * Model ����
 */
public class MemberClass {
	int a = 100;
	static int b = 20;
	
	// Ŭ���� ������ �ڵ��ʱ�ȭ �Ǳ� ������, ������ �� �ֱ� ������ ���� �ʱ�ȭ���ִ°� ����.
	String pno = null; 		// ���� ���  
	String firstNo = null; 	// �ֹε�� ���ڸ�
	String lastNo = null; 	// �ֹε�� ���ڸ� 
	String pname = null; 	// ���� �̸�         	 
	int cCode = 0; 			// Ŭ����(��) �ڵ�      
	String pJob = null; 	// ������å           
	int hireDate; 			// �Ի翬��
	
	public MemberClass() {
		System.out.println("MemberClass ������ ȣ��");
	}
	
	// 7�� �����͸� ���� �޴� ������
	// ("92001", "590327-1839240", "���±�", 920, "����", "1997")
	public MemberClass(String pno, String jumin, String pname, int cCode, String pjob, String hireDate) {
		this.pno = pno;
		String[] tmp = jumin.split("-");
		this.firstNo = tmp[0];
		this.lastNo = tmp[1];
		this.pname = pname;
		this.cCode = cCode;
		this.pJob = pjob;
		this.hireDate = Integer.parseInt(hireDate);
	}
}
