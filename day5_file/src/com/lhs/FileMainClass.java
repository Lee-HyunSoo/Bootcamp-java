package com.lhs;

import java.io.IOException;

/*
 * 외부 데이터 다루기
 * 1. 예외처리 : 문제가 발생했을 때 app은 유지를 시키고, 사용자에게 문제점에 대한 내용을 알리기 위함
 * 2. 예외처리 사용 : 로컬 파일 / 인터넷을 통한 데이터를 읽을 때 / 데이터베이스
 * 3. 예외처리 방법 : 
 * 	1) try {} catch(예외처리 클래스타입 매개변수) {}  
 * 	매개변수 : 문제가 발생한 내용을 전달(저장) 받는 변수
 * 	예외처리 클래스 : Exception
 * 	2) throws : 메서드의 선언부에 사용
 * 	3) try {} catch() {} finally {try 내부가 성공적으로 끝나거나, catch 내부가 끝났을 경우}
 
 * 메서드 내부에 try {실행 내용들} catch(Exception e) {try 내에서 문제가 발생했을 경우 해야할 일들} 를 사용하는 경우에는 
 * 다른 메서드에서 예외처리를 하지 않아도 되지만, 메서드 선언부에 throws를 이용하면 다른 메서드에서 다시 예외처리를 해야한다.
 * 이 때문에 주로 try - catch를 많이 사용한다.
 * 
 * Scanner를 사용할 때 마지막에 close를 해주는 것처럼, finally에는 접속한 DB를 종료하는 등 마무리작업이 필요할 때 반드시 사용해야한다.
 * 
 * 모든코드에 예외처리를 하는 것은 아니다. 일반적인 상황에서도 예외처리를 하게되면 오히려 에러가 발생할 수 있다.
 */

/*
 * 외부 로컬파일 다루기
 * 1. 파일 쓰기 : java.io.FileWriter.class
 * 	FileWriter fw = new FileWriter("파일경로");
 * 	fw.write("문자열\n");
 * 	fw.close();
 * 
 * 파일경로 : c:/폴더/파일.확장자, / 대신 \ 를사용하려면 \\ 로 사용하면된다.
 * FileWriter 객체를 생성 시엔 어디에, 어떤 파일로 쓸 것인지를 만들어줘야 한다.
 * windows의 c드라이브엔 파일 생성이 불가능하게 되어있기 때문에, 파일을 관리할 폴더를 하나 만들어 사용해야한다.
 * FileWriter 클래스는 경로에 파일이 없어도 해당 경로에 파일을 만들어 열어둔다.
 * 그리고 writer 메서드를 통해 해당 파일에 데이터를 쓰기 시작한다.
 * 
 * 2. 파일 읽기 : java.io.FileReader.class
 * 	FileReader fr = new FileReader("파일경로");
 * 	// 줄 단위로 읽기 : java.io.BufferedReader.class
 * 	BufferedReader br = new BufferedReader(FileReader 객체);
 * 	br.readLine();
 * 	String tmp = "";
 * 	while ((tmp = br.readLine()) != null) { tmp = tmp + "\n"; } -> 한 줄씩 띄어 저장하기 위해 \n을 사용한다.
 * 	br.close();
 * 
 * FileReader는 FileWriter와 다르게 파일 경로에 해당 파일이 없으면 에러가 난다.
 * 일반적으로 데이터를 읽을 때 줄 단위로 읽는데, FileReader에는 줄 단위로 읽는 메서드가 없다.
 * 때문에 줄 단위로 읽기 위해 BufferedReader를 사용한다. 이때 반복문을 사용하는데, 끝나는 시점을 알 수 없기 때문에 while을 사용한다.
 * 
 * 3. 실 사용 예
 * FileWriter fw = null;
 * try {
 * 	fw = new FileWriter("파일경로");
 * 	fw.write("파일에 적을 내용"); 
 * 	fw.close(); } catch(IOException e) { System.out.println(e.getMessage()); } 
 * 
 * 참고 : 자바는 DB에 접속할 수 있는 방법이없다. 때문에 DB회사에서 제공해주는 라이브러리를 사용해야한다. -> JDBC
 */

/*
 * 웹 페이지 만들기 : HTML 태그
 * <html><head><title>제목</title></head><body>현재 페이지</body></html>
 * 
 * 웹 페이지 확장자
 * 1. html
 * 2. htm : 리눅스 환경에서 인식 할 수 없다. 사용x
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
