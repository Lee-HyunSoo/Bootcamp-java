package com.naver.news;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 모든 신문사들 정보 저장
 * 1. 파일 읽기
 * 2. 읽은 내용으로 NaverNewsClass 객체를 생성
 * 3. ArrayList에 추가
 */
public class NaverDataClass {

	ArrayList<NaverNewsClass> news = new ArrayList<NaverNewsClass>();
	
	public NaverDataClass() {
	}
	
	// 사용할 메서드인 readData가 인자로 String을 받기 때문에, 기본생성자가 아니라 인자를 받는 생성자를 하나 더 만들어 실행한다.
	public NaverDataClass(String uri) {
		this.readData(uri);
	}
	
	private void readData(String uri) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(uri);
			br = new BufferedReader(fr);
			
			String tmp = "";
			String[] splits = null;
			while ((tmp = br.readLine()) != null) {
				splits = tmp.split("\", \"");
				news.add(new NaverNewsClass(splits[1], splits[2]));
			}
			
			br.close();
			fr.close();	
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFountException: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}
}
