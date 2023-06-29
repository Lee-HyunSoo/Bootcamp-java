package day6_wordcount;

import java.io.FileWriter;
import java.io.IOException;

public class WordPrintClass {

	// 기본 생성자를 외부에서 사용하지 못하도록 private
	private WordPrintClass() {
	}
	
	// 전달 된 파일 경로와 태그들을 이용하여 html 파일 생성
	public static void saveHTML(String uri, String tags) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(uri);
			fw.write(tags);
			fw.close();
			System.out.println("HTML 생성 성공");
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}

}
