package com.lhs;

import java.io.IOException;

/*
 * �ܺ� ������ �ٷ��
 * 1. ����ó�� : ������ �߻����� �� app�� ������ ��Ű��, ����ڿ��� �������� ���� ������ �˸��� ����
 * 2. ����ó�� ��� : ���� ���� / ���ͳ��� ���� �����͸� ���� �� / �����ͺ��̽�
 * 3. ����ó�� ��� : 
 * 	1) try {} catch(����ó�� Ŭ����Ÿ�� �Ű�����) {}  
 * 	�Ű����� : ������ �߻��� ������ ����(����) �޴� ����
 * 	����ó�� Ŭ���� : Exception
 * 	2) throws : �޼����� ����ο� ���
 * 	3) try {} catch() {} finally {try ���ΰ� ���������� �����ų�, catch ���ΰ� ������ ���}
 
 * �޼��� ���ο� try {���� �����} catch(Exception e) {try ������ ������ �߻����� ��� �ؾ��� �ϵ�} �� ����ϴ� ��쿡�� 
 * �ٸ� �޼��忡�� ����ó���� ���� �ʾƵ� ������, �޼��� ����ο� throws�� �̿��ϸ� �ٸ� �޼��忡�� �ٽ� ����ó���� �ؾ��Ѵ�.
 * �� ������ �ַ� try - catch�� ���� ����Ѵ�.
 * 
 * Scanner�� ����� �� �������� close�� ���ִ� ��ó��, finally���� ������ DB�� �����ϴ� �� �������۾��� �ʿ��� �� �ݵ�� ����ؾ��Ѵ�.
 * 
 * ����ڵ忡 ����ó���� �ϴ� ���� �ƴϴ�. �Ϲ����� ��Ȳ������ ����ó���� �ϰԵǸ� ������ ������ �߻��� �� �ִ�.
 */

/*
 * �ܺ� �������� �ٷ��
 * 1. ���� ���� : java.io.FileWriter.class
 * 	FileWriter fw = new FileWriter("���ϰ��");
 * 	fw.write("���ڿ�\n");
 * 	fw.close();
 * 
 * ���ϰ�� : c:/����/����.Ȯ����, / ��� \ ������Ϸ��� \\ �� ����ϸ�ȴ�.
 * FileWriter ��ü�� ���� �ÿ� ���, � ���Ϸ� �� �������� �������� �Ѵ�.
 * windows�� c����̺꿣 ���� ������ �Ұ����ϰ� �Ǿ��ֱ� ������, ������ ������ ������ �ϳ� ����� ����ؾ��Ѵ�.
 * FileWriter Ŭ������ ��ο� ������ ��� �ش� ��ο� ������ ����� ����д�.
 * �׸��� writer �޼��带 ���� �ش� ���Ͽ� �����͸� ���� �����Ѵ�.
 * 
 * 2. ���� �б� : java.io.FileReader.class
 * 	FileReader fr = new FileReader("���ϰ��");
 * 	// �� ������ �б� : java.io.BufferedReader.class
 * 	BufferedReader br = new BufferedReader(FileReader ��ü);
 * 	br.readLine();
 * 	String tmp = "";
 * 	while ((tmp = br.readLine()) != null) { tmp = tmp + "\n"; } -> �� �پ� ��� �����ϱ� ���� \n�� ����Ѵ�.
 * 	br.close();
 * 
 * FileReader�� FileWriter�� �ٸ��� ���� ��ο� �ش� ������ ������ ������ ����.
 * �Ϲ������� �����͸� ���� �� �� ������ �дµ�, FileReader���� �� ������ �д� �޼��尡 ����.
 * ������ �� ������ �б� ���� BufferedReader�� ����Ѵ�. �̶� �ݺ����� ����ϴµ�, ������ ������ �� �� ���� ������ while�� ����Ѵ�.
 * 
 * 3. �� ��� ��
 * FileWriter fw = null;
 * try {
 * 	fw = new FileWriter("���ϰ��");
 * 	fw.write("���Ͽ� ���� ����"); 
 * 	fw.close(); } catch(IOException e) { System.out.println(e.getMessage()); } 
 * 
 * ���� : �ڹٴ� DB�� ������ �� �ִ� ����̾���. ������ DBȸ�翡�� �������ִ� ���̺귯���� ����ؾ��Ѵ�. -> JDBC
 */

/*
 * �� ������ ����� : HTML �±�
 * <html><head><title>����</title></head><body>���� ������</body></html>
 * 
 * �� ������ Ȯ����
 * 1. html
 * 2. htm : ������ ȯ�濡�� �ν� �� �� ����. ���x
 * 3. mhtml
 */

public class FileMainClass {

	public static void main(String[] args) throws IOException {
		FileMethodClass.fileWrite("c:/filetest/text.txt");
		String uri = "C:\\work-java\\day5_file\\src\\com\\lhs\\FileMethodClass.java";
		FileMethodClass.fileRead(uri);
		
		int[] test = { 10, 20, 30, 40, 50 };
		
		for (int t : test)
			System.out.println(t);
	}
}
