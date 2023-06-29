package day6_wordcount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordMethodClass {

	// 기본 생성자를 외부에서 사용하지 못하도록 private
	private WordMethodClass() {
	}
	
	// 검색할 단어들을 저장
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
	
	// 전체 문서를 줄단위로 저장
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
	
	// 줄단위 저장 된 문장을 분리하여 저장
	public static void splitSentence() {
		String[] splits;
		
		for (String s : WordDataClass.sentence) {
			splits = s.split(" ");
			WordDataClass.splitSentence.add(new SentenceSplitClass(splits));
		}	
	}
	
	// 문장별로 분리 된 전체 데이터를 검색
	public static void repeatWordCount() {
		for (SentenceSplitClass s : WordDataClass.splitSentence)
			searchWordCount(s.splitSentence);
	}
	
	// repeatWordCount() 부터 분리 된 하나의 문장에 각 검색단어가 있는지 확인하여 count
	public static void searchWordCount(String[] splitSentence) {
		for (String s : splitSentence) {
			for (WordCountClass w : WordDataClass.words) {
				if (s.contains(w.word))
					w.count++;
			}
		}
	}
	
	// 각 단어 count 값을 이용하여 tag 생성
	public static String createHTML() {
		String tags = "";

		tags = tags + "<html>";
		tags = tags + "<head><title>Word Count</title></head>";
		tags = tags + "<body>";
		tags = tags + "<table>";
		
		tags = tags + "<caption>검색 단어의 노출횟수 시각화</caption>"; // <caption> : 가운데 정렬
		tags = tags + "<colgroup style='text-align:center;'>"; //<colgroup> : column을 그룹화
		tags = tags + "<col style='width: 10%;'>"; // 1번째 column :  총 column의 10% 사용
		tags = tags + "<col style='width: 10%;'>"; // 2번째 column : 총 column의 10% 사용
		tags = tags + "<col style='width: 80%;'>"; // 3번째 column : 총 column의 80% 사용
		tags = tags + "</colgroup>";
		
		tags = tags + "<thead>"; // <thead> : 제목으로 칸을 만들 때 사용 
		tags = tags + "<tr>";
		tags = tags + "<th>검색 단어</th>";
		tags = tags + "<th>노출 횟수</th>";
		tags = tags + "<th>시각화</th>";
		tags = tags + "</tr>";
		tags = tags + "</thead>";
		
		tags = tags + "<tbody>"; // <tbody> : 테이블의 데이터 영역 시작
		
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
