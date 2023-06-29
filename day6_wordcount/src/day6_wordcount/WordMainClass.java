package day6_wordcount;

public class WordMainClass {

	public static void main(String[] args) {
		String uri_word = "C:\\filetest\\검색단어리스트.txt";
		String uri_doc = "C:\\filetest\\하둡 분산 처리 파일 시스템.txt";
		String uri_save = "C:\\filetest\\wordcount.html";
		
		WordMethodClass.readWord(uri_word);		
		WordMethodClass.readSentence(uri_doc);
		WordMethodClass.splitSentence();
		WordMethodClass.repeatWordCount();
		
		String tags = WordMethodClass.createHTML();
		WordPrintClass.saveHTML(uri_save, tags);
	}

}
