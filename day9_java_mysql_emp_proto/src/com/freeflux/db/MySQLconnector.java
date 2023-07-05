package com.freeflux.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.freeflux.Querys;
import com.freeflux.dto.Employee;

/*
 * dao (data access object) : 데이터에 접근하는 객체
 */
public class MySQLconnector implements Querys {
	public Connection conn = null;

	public MySQLconnector() { // 기본 생성자
	}
	
	/** MySQL Connect Method **/
	public void connectMySQL() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id_mysql, pw_mysql);
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException: " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("SQLException: " + e.getMessage());
		}
	} //  connectMySQL() END

	/** 테이블 데이터 전체 조회 **/
	public ArrayList<Employee> selectAll() {
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Statement stmt = null;
		ResultSet rs = null;	
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querySelectAll);
			// empNo, empName, job, mgr, hireDate, sale, commission, deptNo
			while (rs.next()) {
				int empNo = rs.getInt("empNo");
				String empName = rs.getString("empName");
				String job = rs.getString("job");
				String mgr = rs.getString("mgr");
				String hireDate = rs.getString("hireDate");
				int sale = rs.getInt("sale");
				int commission = rs.getInt("commission");
				int deptNo = rs.getInt("deptNo");
				employees.add(new Employee(empNo, empName, job, mgr, hireDate, sale, commission, deptNo));
			}
		} catch (SQLException e) {
			System.out.println("SelectAll ERR: " + e.getMessage());
		} finally {
			close(stmt, rs);
		}
		System.out.println("데이터 전체 조회 성공");
		return employees;
	} // selectAll() END

	/** 테이블 데이터 하나만 조회 **/
	public void selectOne() {
		String query = "select * from employee where id = ?";
		System.out.println("데이터 조회 성공");
	} // selectOne() END

	/** 테이블에 데이터 삽입(추가) **/
	public void insert() {
		PreparedStatement pstmt = null;		
		try {
			pstmt = conn.prepareStatement(queryInsert);
			// (?, ?, ?, ?, ?, ?, 0, ?)
			pstmt.setInt(1, 2000);
			pstmt.setString(2, "마동석");
			pstmt.setString(3, "과장");
			pstmt.setString(4, "05");
			pstmt.setString(5, "2023-07-05");
			pstmt.setInt(6, 450);
			pstmt.setInt(7, 20);
			
			int n = pstmt.executeUpdate();
			if (n > 0)
				System.out.println("데이터 삽입 성공");
		} catch (SQLException e) {
			System.out.println("Insert ERR: " + e.getMessage());
		} finally {
			close(pstmt);
		}
	} // insert() END

	/** 테이블 데이터 수정 **/
	public void update(ArrayList<Employee> employees) {
		PreparedStatement pstmt = null;		
		try {
			pstmt = conn.prepareStatement(queryUpdate);
			
			int n = 0;
			for (int i = 0; i < employees.size(); i++) {
				int sale = employees.get(i).getSale();
				sale += (sale * 10 / 100);
				pstmt.setInt(1, sale);
				pstmt.setInt(2, i + 1);
				n += pstmt.executeUpdate();
			}
			if (n > 0)
				System.out.println(n + "개의 레코드 수정 성공");
		} catch (SQLException e) {
			System.out.println("Update ERR: " + e.getMessage());
		} finally {
			close(pstmt);
		}
		
	} // update() END

	/** 테이블 데이터 삭제 **/
	public void delete() {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(queryDelete);
			pstmt.setString(1, "과장");
			int n = pstmt.executeUpdate();

			if (n > 0)
				System.out.println(n + "개의 레코드 삭제 성공");
		} catch (SQLException e) {
			System.out.println("Delete ERR: " + e.getMessage());
		} finally {
			close(pstmt);
		}
	} // delete() END

	/** 자원 해제 메서드들 : Overloading 기법 **/
	public void close(Statement stmt, ResultSet rs) {
		try {
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Statement, ResultSet CLOSE  ERR : " + e.getMessage());
		}
	} // close() END

	public void close(PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("PreparedStatement, ResultSet  CLOSE  ERR : " + e.getMessage());
		}
	} // close() END

	public void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("PreparedStatement  CLOSE  ERR : " + e.getMessage());
		}
	} // close() END

	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Connection  CLOSE  ERR : " + e.getMessage());
		}
	} // close() END

}
