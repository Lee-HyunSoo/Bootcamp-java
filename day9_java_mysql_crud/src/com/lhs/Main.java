package com.lhs;

import com.lhs.db.MySQLConnector;

/*
 * MySQL 버전이 올라가면서 드리이버 패키지 구조가 변경되었다.
 * driver = "com.mysql.cj.jdbc.Driver"
 * 
 * 이에 따라 접속 방법도 변경되었다.
 * url = "jdbc:mysql://localhost:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
 * id_mysql = "root";
 * pw_mysql ="1234";
 * 
 * useSSL
 * SSL : 보안 소켓 계층을 이르는 말로, 인터넷에서 데이터를 안전하게 전송하기 위한 인터넷 통신 규약 프로토콜.
 * SSL은 웹 제품 뿐만 아니라 파일전송규약(FTP) 등 다른 TCP/IP 애플리케이션에 적용될 수 있으며, 인증 암호화 기능이 있다.
 * 인증은 웹 브라우저와 웹 서버 간에 서로 상대의 신원을 확인하는 기능이다.
 * 
 * serverTimezone : 서버의 시간대 영역
 * UTC : 세계 표준시
 * UTC + 9 : 한국 시간
 * 전세계의 기준 시간인 영국의 그리니치 평균 시간보다 9시간 빠른 시간을 의미한다.
 * UTC는 경도가 0인 그리니치 천문대를 기준으로 하는 세계 협정 시간을 의미한다.
 * 
 * allowPublicKeyRetrieval : 일반적인 키 검색 허용 여부
 * 
 */
public class Main {
	
	public static void main(String[] args) {
		MySQLConnector mysql = new MySQLConnector();
		
		mysql.connectMySQL();
		mysql.selectAll();
		mysql.selectOne();
		mysql.insert();
		mysql.update();
		mysql.delete();
	}
	
}
