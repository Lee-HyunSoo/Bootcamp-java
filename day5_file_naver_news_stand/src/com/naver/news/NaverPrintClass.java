package com.naver.news;

import java.io.FileWriter;
import java.io.IOException;

/*
 * View, Html �±� ���Ϸ� ����
 */

public class NaverPrintClass {

	public NaverPrintClass() {
	}
	
	public static void saveHTML(String uri, String tags) {
		try {
			FileWriter fw = new FileWriter(uri);
			fw.write(tags);
			fw.close();
		} catch (IOException e) {
			System.out.println("FileWriter: " + e.getMessage());
		}
		System.out.println("���� ���� �Ϸ�");
	}
}
