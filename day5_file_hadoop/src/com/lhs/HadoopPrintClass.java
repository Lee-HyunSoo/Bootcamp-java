package com.lhs;

import java.io.FileWriter;
import java.io.IOException;

public class HadoopPrintClass {

	public HadoopPrintClass() {
	}
	
	public static void saveHtml(String uri, String tags) {
		FileWriter fr;
		try {
			fr = new FileWriter(uri);
			fr.write(tags);
			fr.close();
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
		System.out.println("hadoops 파일 생성 완료");
	}

}
