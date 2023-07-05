package com.lhs.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.lhs.Querys;
import com.lhs.dto.Bootcamp;

public class MySQLConnector implements Querys{

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
	
	public ArrayList<Bootcamp> selectAll() {
		ArrayList<Bootcamp> bootcamps = new ArrayList<Bootcamp>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querySelectAll);
			
			while (rs.next()) {
				bootcamps.add(new Bootcamp(rs.getString("cName"), rs.getString("cRating"),
						rs.getString("cJoinDate"), rs.getString("cLastDate"), rs.getInt("cVisitNo"),
						rs.getInt("cPostNo"), rs.getInt("cCommentNo"), rs.getString("cGenger"),
						rs.getString("cAge")));
			}
		} catch (SQLException e) {
			System.out.println("selectAll ERR: " + e.getMessage());
		} finally {
			close(stmt, rs);
		}
		return bootcamps;
	}
	
	public ArrayList<String> findNames() {
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Bootcamp> bootcamps = selectAll();
		for (Bootcamp b : bootcamps)
			if (b.getcGenger().equals("기타"))
				names.add(b.getcName());
		return names;
	}
	
	public void update(ArrayList<String> names) {
		PreparedStatement pstmt = null;
		String male = "남";
		String female = "여";
		try {
			pstmt = conn.prepareStatement(queryUpdate);
			int n = 0;
			for (String s : names) {
				if (s.equals("허찬")) {
					pstmt.setString(1, male);
					pstmt.setString(2, s);
				}
				else if (s.equals("김효경")) {
					pstmt.setString(1, female);
					pstmt.setString(2, s);
				}
				else if (s.equals("이현수")) {
					pstmt.setString(1, male);
					pstmt.setString(2, s);
				}
				else if (s.equals("박정우")) {
					pstmt.setString(1, male);
					pstmt.setString(2, s);
				}
				else if (s.equals("최호준")) {
					pstmt.setString(1, male);
					pstmt.setString(2, s);
				}
				n = pstmt.executeUpdate();				
			}
			if (n > 0)
				System.out.println("update 완료");	
		} catch (SQLException e) {
			System.out.println("update ERR: " + e.getMessage());
		} finally {
			close(pstmt);
		}
	}
	
	public void insert(Bootcamp bootcamp) {
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(queryInsert);
			pstmt.setString(1, bootcamp.getcName());
			pstmt.setString(2, bootcamp.getcRating());
			pstmt.setString(3, bootcamp.getcJoinDate());
			pstmt.setString(4, bootcamp.getcLastDate());
			pstmt.setInt(5, bootcamp.getcVistiNo());
			pstmt.setInt(6, bootcamp.getcPostNo());
			pstmt.setInt(7, bootcamp.getcCommentNo());
			pstmt.setString(8, bootcamp.getcGenger());
			pstmt.setString(9, bootcamp.getcAge());
			int n = pstmt.executeUpdate();
			if (n > 0)
				System.out.println("insert 완료");
		} catch (SQLException e) {
			System.out.println("insert ERR: " + e.getMessage());
		} finally {
			close(pstmt);
		}
	}
	
	public float visitNoAvg() {
		int sum = 0;
		ArrayList<Bootcamp> bootcamps = selectAll();
		for (Bootcamp b : bootcamps)
			sum += b.getcVistiNo();
		return (float)sum / bootcamps.size();
	}
	
	public Map<String, Integer> selectOverVisitNoAvg() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		float visit = visitNoAvg();
		System.out.println("평균 방문 횟수: " + visit);
		try {
			pstmt = conn.prepareStatement(querySelectOverVisitNoAvg);
			pstmt.setFloat(1, visit);
			rs = pstmt.executeQuery();
			while (rs.next())
				map.put(rs.getString("cName"), rs.getInt("cVisitNo"));
			
		} catch (SQLException e) {
			System.out.println("selectOverVisitNoAvg ERR: " + e.getMessage());
		} finally {
			close(pstmt, rs);
		}
		return map;
	}

	public Map<String, Integer> selectClosedAge() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(querySelectClosedAge);
			
			while (rs.next())
				map.put(rs.getString("cName"), rs.getInt("cVisitNo"));
		} catch (SQLException e) {
			System.out.println("selectClosedAge ERR: " + e.getMessage());
		} finally {
			close(stmt, rs);
		}
		return map;
	}
	
	public void close(Statement stmt, ResultSet rs) {
		try {
			rs.close();
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Statement, ResultSet CLOSE  ERR : " + e.getMessage());
		}
	} 

	public void close(PreparedStatement pstmt, ResultSet rs) {
		try {
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("PreparedStatement, ResultSet  CLOSE  ERR : " + e.getMessage());
		}
	} 

	public void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("PreparedStatement  CLOSE  ERR : " + e.getMessage());
		}
	} 

	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			System.out.println("Connection  CLOSE  ERR : " + e.getMessage());
		}
	} 

}
