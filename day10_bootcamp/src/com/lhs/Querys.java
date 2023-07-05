package com.lhs;

public interface Querys {
	String driver = "com.mysql.cj.jdbc.Driver";
	String dbName = "db_bootcamp";
	String url = "jdbc:mysql://localhost:3306/" + dbName + "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	String id_mysql = "root";
	String pw_mysql = "0000"; // 본인 비밀번호
	
	String querySelectAll = "select * from bootcamp2";	
	String queryUpdate = "update bootcamp2 set cGenger = ? where cGenger = '기타' and cName = ?";
	String queryInsert = "insert into bootcamp2 "
			+ "(cName, cRating, cJoinDate, cLastDate, cVisitNo, cPostNo, cCommentNo, cGenger, cAge) "
			+ "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
	String querySelectOverVisitNoAvg = "select * from bootcamp2 where cVisitNo > ?";
	String querySelectClosedAge = "select * from bootcamp2 where cAge = '비공개'";
}