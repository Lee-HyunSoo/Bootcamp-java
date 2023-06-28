package com.naver.news;

import java.io.FileWriter;
import java.io.IOException;

/*
 * View, Html 태그 파일로 저장
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
		System.out.println("파일 생성 완료");
	}
}
