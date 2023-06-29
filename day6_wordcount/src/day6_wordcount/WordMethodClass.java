package day6_wordcount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordMethodClass {

	// �⺻ �����ڸ� �ܺο��� ������� ���ϵ��� private
	private WordMethodClass() {
	}
	
	// �˻��� �ܾ���� ����
	public static void readWord(String uri) {	
		try {
			FileReader fr = new FileReader(uri);
			BufferedReader br = new BufferedReader(fr);
			
			String tmp = "";
			while((tmp = br.readLine()) != null)
				WordDataClass.words.add(new WordCountClass(tmp));
		
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFountException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}
	
	// ��ü ������ �ٴ����� ����
	public static void readSentence(String uri) {
		FileReader fr;
		BufferedReader br;
		try {
			fr = new FileReader(uri);
			br = new BufferedReader(fr);
			
			String tmp = "";
			while((tmp = br.readLine()) != null)
				WordDataClass.sentence.add(tmp);
			
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}	
	}
	
	// �ٴ��� ���� �� ������ �и��Ͽ� ����
	public static void splitSentence() {
		String[] splits;
		
		for (String s : WordDataClass.sentence) {
			splits = s.split(" ");
			WordDataClass.splitSentence.add(new SentenceSplitClass(splits));
		}	
	}
	
	// ���庰�� �и� �� ��ü �����͸� �˻�
	public static void repeatWordCount() {
		for (SentenceSplitClass s : WordDataClass.splitSentence)
			searchWordCount(s.splitSentence);
	}
	
	// repeatWordCount() ���� �и� �� �ϳ��� ���忡 �� �˻��ܾ �ִ��� Ȯ���Ͽ� count
	public static void searchWordCount(String[] splitSentence) {
		for (String s : splitSentence) {
			for (WordCountClass w : WordDataClass.words) {
				if (s.contains(w.word))
					w.count++;
			}
		}
	}
	
	// �� �ܾ� count ���� �̿��Ͽ� tag ����
	public static String createHTML() {
		String tags = "";

		tags = tags + "<html>";
		tags = tags + "<head><title>Word Count</title></head>";
		tags = tags + "<body>";
		tags = tags + "<table>";
		
		tags = tags + "<caption>�˻� �ܾ��� ����Ƚ�� �ð�ȭ</caption>"; // <caption> : ��� ����
		tags = tags + "<colgroup style='text-align:center;'>"; //<colgroup> : column�� �׷�ȭ
		tags = tags + "<col style='width: 10%;'>"; // 1��° column :  �� column�� 10% ���
		tags = tags + "<col style='width: 10%;'>"; // 2��° column : �� column�� 10% ���
		tags = tags + "<col style='width: 80%;'>"; // 3��° column : �� column�� 80% ���
		tags = tags + "</colgroup>";
		
		tags = tags + "<thead>"; // <thead> : �������� ĭ�� ���� �� ��� 
		tags = tags + "<tr>";
		tags = tags + "<th>�˻� �ܾ�</th>";
		tags = tags + "<th>���� Ƚ��</th>";
		tags = tags + "<th>�ð�ȭ</th>";
		tags = tags + "</tr>";
		tags = tags + "</thead>";
		
		tags = tags + "<tbody>"; // <tbody> : ���̺��� ������ ���� ����
		
		String hashTag = ".";
		for(WordCountClass w : WordDataClass.words) {
			tags = tags + "<tr>";
			
			tags = tags + "<td>";
			tags = tags + w.word;
			tags = tags + "</td>";
			
			tags = tags + "<td>";
			tags = tags + w.count;
			tags = tags + "</td>";
			
			tags = tags + "<td>";
			for(int i = 0; i < w.count; i++)
				tags = tags + hashTag ;
			tags = tags + "</td>";
			
			tags = tags + "</tr>";
		}
		
		tags = tags + "</tbody>";
		tags = tags + "</table>";
		tags = tags + "</body>";
		tags = tags + "</html>";
		return tags;
	}

}
