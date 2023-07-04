package com.lhs;

import java.util.Scanner;

import com.lhs.db.MySQLConnector;

public class EmployMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MySQLConnector mysql = new MySQLConnector();
		mysql.connectMySQL();
		while (true) {
			System.out.println("원하는 작업번호를 입력 해 주세요.");
			System.out.print("1. 전체 사원조회 / 2. 사원추가 / 3. 전사원 급여 10% 올림 / 4. 과장 직책 사원 삭제 / 5. 작업종료: ");
			int input = scan.nextInt();
			
			switch (input) {
			case 1:
				mysql.selectAll();
				break;
			case 2:
				mysql.insert();
				break;
			case 3:
				mysql.update();
				break;
			case 4:
				mysql.delete();
				break;
			case 5:
				System.exit(0);
			default:
				System.exit(0);
			}
		}
//		mysql.selectOne();
	}
			
}

