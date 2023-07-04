package com.lhs;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

/*
 * 1. mysql 접속 드라이버 로드
 * Driver.class -> com.mysql.jdbc.Driver : 접속 드라이버명
 * 
 * 2. mysql 서버 접속
 * 서버 접속 프로토콜 : jdbc:mysql://
 * 서버 주소 : localhost
 * 데이터 통신 게이트 (port 번호) : 3306
 * 사용할 DB 명 : test
 * -> jdbc:mysql://localhost:3306/test
 * 서버 관리자 id : root
 * 서버 관리자 pw : 설치 시 입력한 pw
 * 접속 결과를 저장하는 변수 : Connection 변수명 
 * 
 * 3. mysql에 요청 : SQL -> SQLException
 * 	1) Statement : 쿼리문 내에 변수가 포함되지 않을 경우
 * 	2) PreparedStatement : 쿼리문 내에 변수가 포함될 경우
 * 
 * 4. 결과처리 -> SQLException
 * select * from 테이블명의 결과를 ResultSet 객체로 전달 받아 사용한다.
 * ResultSet -> while 문을 통해 레코드 하나 (한줄) 씩 읽을 수 있다.
 * while(ResultSet.next() {
 * }
 * 
 * 5. 자원해제
 *  1) ResultSet.close();
 *  2) Statement.close(); / preparedStatement.close();
 *  3) Connection.close();
 */
public class MainClass {
	public static void main(String[] args) {
		// 1. mysql 접속 드라이버 로드
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		}
		
		// 2. mysql 서버 접속
		String url = "jdbc:mysql://localhost:3306/";
		String id = "root";
		String pw = "0000";
		String dbName = "test";
		url += dbName;

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pw);
			
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
		
		// 3. mysql에 요청
		
		// 4. 결과처리 
		
		// 5. 자원해제
	}
}
