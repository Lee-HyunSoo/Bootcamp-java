package com.lhs;

import java.util.ArrayList;

public class PrintClass {

	public PrintClass() {

	}

	public static void prn(String title, double price) {
		System.out.println("����: " + title + " �� �ǸŰ�: " + price);		
	}
	
	public static void prn(String author, ArrayList<String> titles) {
		if (titles.isEmpty())
			System.out.println("�ش� ������ ������ �˻��� �� �����ϴ�.");
		else
			for(String title : titles)
				System.out.println(title);
	}
}
