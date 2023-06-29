package com.lhs;

import java.util.ArrayList;

public class WordDataClass {

	/*
	 * 클래스 명으로 접근 가능하도록 static, 한번 선언하면 더 이상 수정할 수 없도록 final
	 */
	static final ArrayList<String> sentence = new ArrayList<String>(); // 줄단위 문장
	static final ArrayList<WordCountClass> words = new ArrayList<WordCountClass>(); // 검색 단어 
	static final ArrayList<SentenceSplitClass> splitSentence = new ArrayList<SentenceSplitClass>(); // 줄단위 문장분리 
	
	private WordDataClass() {
	}

}
