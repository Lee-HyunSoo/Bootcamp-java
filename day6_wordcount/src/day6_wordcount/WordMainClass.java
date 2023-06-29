package day6_wordcount;

public class WordMainClass {

	public static void main(String[] args) {
		String uri_word = "C:\\filetest\\�˻��ܾ��Ʈ.txt";
		String uri_doc = "C:\\filetest\\�ϵ� �л� ó�� ���� �ý���.txt";
		String uri_save = "C:\\filetest\\wordcount.html";
		
		WordMethodClass.readWord(uri_word);		
		WordMethodClass.readSentence(uri_doc);
		WordMethodClass.splitSentence();
		WordMethodClass.repeatWordCount();
		
		String tags = WordMethodClass.createHTML();
		WordPrintClass.saveHTML(uri_save, tags);
	}

}
