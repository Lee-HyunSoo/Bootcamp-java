package com.freeflux;

/*
 * Oracle, MySQL, SQLite : ANSI (표준) Query
 * 이 DB 들은 각각 접속방식이 다르기 때문에 driver ~ pw_mql 까지는 DB 종류마다 달라진다.
 * 인터페이스는 내부 상수도 구현이 가능하고, abstract class로 바꿔 사용도 가능하다.
 * 단, 추상 클래스를 사용하려면 implements 가 아니라 extends 로 바꿔 사용해야한다.
 */
public interface Querys {
	String driver = "com.mysql.cj.jdbc.Driver";
	String dbName = "db_emp";
	String url = "jdbc:mysql://localhost:3306/" + dbName + "?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	String id_mysql = "root";
	String pw_mysql = "0000"; // 본인 비밀번호
	
	String querySelectAll = "select * from employee";	
	String querySelectOne = "select * from employee where id = ?";
	String queryInsert = "insert into employee "
			+ "(empNo, empName, job, mgr, hireDate, sale, commission, deptNo) "
			+ "values (?, ?, ?, ?, ?, ?, 0, ?)";
	String queryUpdate = "update employee set sale = ? where seq_no = ?";
	String queryDelete = "delete from employee where job = ?";
}
