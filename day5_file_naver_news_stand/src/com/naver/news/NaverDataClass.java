package com.naver.news;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * ��� �Ź���� ���� ����
 * 1. ���� �б�
 * 2. ���� �������� NaverNewsClass ��ü�� ����
 * 3. ArrayList�� �߰�
 */
public class NaverDataClass {

	ArrayList<NaverNewsClass> news = new ArrayList<NaverNewsClass>();
	
	public NaverDataClass() {
	}
	
	// ����� �޼����� readData�� ���ڷ� String�� �ޱ� ������, �⺻�����ڰ� �ƴ϶� ���ڸ� �޴� �����ڸ� �ϳ� �� ����� �����Ѵ�.
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
