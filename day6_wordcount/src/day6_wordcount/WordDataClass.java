package day6_wordcount;

import java.util.ArrayList;

public class WordDataClass {

	/*
	 * Ŭ���� ������ ���� �����ϵ��� static, �ѹ� �����ϸ� �� �̻� ������ �� ������ final
	 */
	static final ArrayList<String> sentence = new ArrayList<String>(); // �ٴ��� ����
	static final ArrayList<WordCountClass> words = new ArrayList<WordCountClass>(); // �˻� �ܾ� 
	static final ArrayList<SentenceSplitClass> splitSentence = new ArrayList<SentenceSplitClass>(); // �ٴ��� ����и� 
	
	private WordDataClass() {
	}

}
