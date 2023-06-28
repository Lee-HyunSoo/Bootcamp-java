package com.lhs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMethodClass {

	public FileMethodClass() { // 기본 생성자
	}
	
	public static void fileWrite(String uri) {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(uri);
			String txt = "hello ㅁㅇㅁㄹ\nasdf\n";
			fw.write(txt);
			fw.close();
		} catch (IOException e) {
			System.out.println("FileWriter: " + e.getMessage());
//			e.printStackTrace(); -> 기본제공 메서드지만, 에러가 많아 잘 사용하지 않는다.
		}
		
	}
	
	public static void fileRead(String uri) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(uri);
			br = new BufferedReader(fr);
			
			String tmp = "";
			while ((tmp = br.readLine()) != null) {
				System.out.println(tmp);
			}
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("FileReader: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("FileReader: " + e.getMessage());
		}	
	}
}
