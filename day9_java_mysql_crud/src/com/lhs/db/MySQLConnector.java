package com.lhs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnector {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private String id_mysql = "root";
	private String pw_mysql = "0000";
	
	public Connection conn = null; // MySQL 접속 결과(상태) 저장
	
	public MySQLConnector() {
	}
	
	public void connectMySQL() {
		/*
		 * 1. driver load : Class.forName("드라이버명");
		 * 2. MySQL과 접속 : DriverManager.getConnection("접속주소", "id", "pw");
		 * 이 두 작업은 외부와 통신하기 때문에 예외처리가 필요하다. 
		 */
		try {
			Class.forName(driver);
			System.out.println("driver load 성공");
			conn = DriverManager.getConnection(url, id_mysql, pw_mysql);
			System.out.println("MySQL 접속 성공");
			
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}
	
	/*
	 * 3. Java에서 SQL을 MySQL에 요청하는 방법
	 *  1) Statement 객체 생성 : 쿼리 내부에 변수가 포함되지 않을 경우
	 *  반드시 현재 연결(접속)되어 있는 Connection 객체를 통해 생성해야한다. 따라서 new 키워드를 사용할 수 없다.
	 *  Statement stmt = conn.createStatement();
	 *  ResultSet rs = stmt.executeQuery("select * from member");
	 *  int n = stmt.executeUpdate("insert into member values (1, 'ssss')");
	 *  int n = stmt.executeUpdate("update member set id = 3 where name = 'lhs1'");
	 *  int n = stmt.executeUpdate("delete from member where id = 3");
	 *  
	 *  2) PreparedStatement 객체 생성 : 쿼리 내부에 변수가 포함되는 경우 (동적쿼리)
	 *  PreparedStatement pstmt = conn.prepareStatement("쿼리");
	 *  
	 *  ex1) 
	 *  int idx = 3; // member 테이블로부터 id가 3인 레코드만 조회하겠다면?
	 *  String query = "select * from member where id = ?";
	 *  
	 *  PreparedStatement pstmt = conn.prepareStatement(query);
	 *  pstmt.setInt(1, idx); // 첫 번째 물음표는 idx를 사용해라
	 *  ResultSet rs = pstmt.executeQuery(); // select 이기 때문에 ResultSet 사용
	 *  
	 *  ex2) 
	 *  int idx = 5;
	 *  String name = "LES";
	 *  String query = "insert into member values (?, ?)";
	 *  
	 *  PreparedStatement pstmt = conn.prepareStatement(query);
	 *  pstmt.setInt(1, idx); // 첫 번째 물음표는 idx를 사용해라
	 *  pstmt.setString(2, name); // 두 번째 물음표는 name을 사용해라
	 *  int n = pstmt.executeUpdate(); // insert 이기 떄문에 int n 사용
	 *  
	 *  
	 *  공통 메서드
	 *  ResultSet rs = executeQuery() : select
	 *  while(rs.next()) { // 데이터를 확인
	 *  	rs.getInt("필드명");
	 *  	rs.getString("필드명");
	 *  	// "필드명" 대신 필드에 대한 index도 사용은 가능 -> 필드에 대한 index는 0이아니라 1부터 시작한다.
	 *  }
	 *  int n = executeUpdate() : insert / update / delete
	 *  if (n > 0) {
	 *  	System.out.println("~~성공");
	 *  }
	 */
	
	public void selectAll() { // 테이블 데이터 전체 조회 : select * from member
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from member");
			
			System.out.println("----- selectAll -----");
			while (rs.next())
				System.out.println(rs.getInt("id") + " : " + rs.getString("name"));
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		} finally {
			close(stmt, rs);
		}
	}
	
	public void selectOne() { // 테이블 데이터 하나만 조회
		int idx = 11;
		String query = "select * from member where id = ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			rs = pstmt.executeQuery();
			
			System.out.println("----- selectOne -----");
			while (rs.next())
//				System.out.println(rs.getInt(1) + " : " + rs.getString(2));
				System.out.println(rs.getInt("id") + " : " + rs.getString("name"));
			
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		} finally {
			close(pstmt, rs);
		}
	}
	
	public void insert() { // 테이블에 데이터 삽입(추가)
		int idx = 12;
		String name = "영어";
		String query = "insert into member values (?, ?)";
		
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			pstmt.setString(2, name);
			int n = pstmt.executeUpdate();
			if (n > 0)
				System.out.println("----- insert -----");
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		} finally {
			close(pstmt);
		}
	}
	
	public void update() { // 테이블 데이터 수정
		int idx = 12;
		String name = "불어";
		String query = "update member set name = ? where id = ?";
		
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			pstmt.setInt(2, idx);
			int n = pstmt.executeUpdate();
			if (n > 0)
				System.out.println("----- update -----");
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		} finally {
			close(pstmt);
		}
	}
	
	public void delete() { // 테이블 데이터 삭제
		int idx = 12;
		String query = "delete from member where id = ?";
		
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, idx);
			int n = pstmt.executeUpdate();
			if (n > 0)
				System.out.println("----- delete -----");
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		} finally {
			close(pstmt);
		}
	}
	
	public void close(Statement stmt, ResultSet rs) {
		try {
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Close SQLException: " + e.getMessage());
		}
	}
	
	public void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("Close SQLException: " + e.getMessage());
		}
	}
	
	public void close(PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("Close SQLException: " + e.getMessage());
		}
	}

}
