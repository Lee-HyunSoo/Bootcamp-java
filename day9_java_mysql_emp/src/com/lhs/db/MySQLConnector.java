package com.lhs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLConnector {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost:3306/db_emp?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	private String id_mysql = "root";
	private String pw_mysql = "0000";
	
	public Connection conn = null;

	public MySQLConnector() {
	}
	
	public void connectMySQL() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id_mysql, pw_mysql);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	}
	
	public void selectAll() {
		Statement stmt = null;
		ResultSet rs = null;
		String query = "select * from employee";
		
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				System.out.println(
						"seq_no: " + rs.getInt("seq_no") + " empNo: " + rs.getInt("empNo") +
						" empName: " + rs.getString("empName") + " job: " + rs.getString("job") +
						" mgr: " + rs.getString("mgr") + " hireDate: " + rs.getString("hireDate") +
						" sale: " + rs.getInt("sale") + " commission: " + rs.getInt("commission") +
						" deptNo: " + rs.getInt("deptNo")
				);
			}
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		} finally {
			close(stmt, rs);
		}
		
	}
	
	public void selectOne() {
		String name = "이현수";
		String query = "select * from employee where empName = ?";
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(
						"seq_no: " + rs.getInt("seq_no") + " empNo: " + rs.getInt("empNo") +
						" empName: " + rs.getString("empName") + " job: " + rs.getString("job") +
						" mgr: " + rs.getString("mgr") + " hireDate: " + rs.getString("hireDate") +
						" sale: " + rs.getInt("sale") + " commission: " + rs.getInt("commission") +
						" deptNo: " + rs.getInt("deptNo")
				);
			}	
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		} finally {
			close(pstmt, rs);
		}
	}
	
	public void insert() {
		int empNo = 1005;
		String empName = "이현수";
		String job = "팀장";
		String mgr = "01";
		String hireDate = "1995-08-15";
		int sale = 500;
		int commission = 200;
		int deptNo = 20;
		
		String query = "insert into employee values (NULL, ?, ?, ?, ?, ?, ?, ?, ?)"; 
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, empNo);
			pstmt.setString(2, empName);
			pstmt.setString(3, job);
			pstmt.setString(4, mgr);
			pstmt.setString(5, hireDate);
			pstmt.setInt(6, sale);
			pstmt.setInt(7, commission);
			pstmt.setInt(8, deptNo);
			int n = pstmt.executeUpdate();
			if (n > 0)
				System.out.println("insert 완료");
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		} finally {
			close(pstmt);
		}		
	}
	
	public void update() {
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		String query1 = "select * from employee";		
		String query2 = "update employee set sale = ? where empNo = ?";
		
		try {
			pstmt = conn.prepareStatement(query2);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query1);
			
			int sale = 0;
			while(rs.next()) {
				sale = rs.getInt("sale");
				sale += (sale * 10 / 100);
				pstmt.setInt(1, sale);
				pstmt.setInt(2, rs.getInt("empNo"));
				int n = pstmt.executeUpdate();
				if (n > 0)
					System.out.println("update 완료");
			}
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		} finally {
			close(stmt, rs);
			close(pstmt);
		}
	}
	
	public void delete() {
		PreparedStatement pstmt = null;
		String job = "과장";
		String query = "delete from employee where job = ?";
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, job);
			int n = pstmt.executeUpdate();
			if (n > 0)
				System.out.println("delete 완료");
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
