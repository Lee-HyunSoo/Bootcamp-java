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
	private String firstNo = null; 	// �ֹε�� ���ڸ�
	private String lastNo = null; 	// �ֹε�� ���ڸ� 
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
		this.setFirstNo(tmp[0]);
		this.setLastNo(tmp[1]);
		this.pname = pname;
		this.cCode = cCode;
		this.pJob = pjob;
		this.hireDate = Integer.parseInt(hireDate);
	}

	public String getFirstNo() {
		return firstNo;
	}

	public void setFirstNo(String firstNo) {
		this.firstNo = firstNo;
	}

	public String getLastNo() {
		return lastNo;
	}

	public void setLastNo(String lastNo) {
		this.lastNo = lastNo;
	}
}
