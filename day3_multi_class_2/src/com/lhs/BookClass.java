package com.lhs;

public class BookClass {
	String title = null;	// å ����
	String author = null;	// ����
	private String press = null;	// ���ǻ�
	int price = 0;			// ����
	String image = null;	// åǥ��
	int dc = 0;				// ������
	
	public BookClass() {

	}
	
	public BookClass(String title, String author, String press, int price, String image, int dc) {
		this.title = title;
		this.author = author;
		this.setPress(press);
		this.price = price;
		this.image = image;
		this.dc = dc;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}
}
