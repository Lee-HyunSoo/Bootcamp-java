package day6_wordcount;

import java.io.FileWriter;
import java.io.IOException;

public class WordPrintClass {

	// �⺻ �����ڸ� �ܺο��� ������� ���ϵ��� private
	private WordPrintClass() {
	}
	
	// ���� �� ���� ��ο� �±׵��� �̿��Ͽ� html ���� ����
	public static void saveHTML(String uri, String tags) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(uri);
			fw.write(tags);
			fw.close();
			System.out.println("HTML ���� ����");
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}

}
