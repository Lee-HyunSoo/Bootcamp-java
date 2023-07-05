package com.lhs;

import java.util.Scanner;

import com.lhs.db.MySQLConnector;
import com.lhs.dto.Bootcamp;

public class BootcampMain {
	
	public static void main(String[] args) {
		MySQLConnector mysql = new MySQLConnector();
		mysql.connectMySQL();
		Scanner scan = new Scanner(System.in);
		Bootcamp bootcamp = new Bootcamp("이순신", "멤버", "2023.06.22.", "2023.07.10.", 36, 0, 0, "남", "50대후반");
		
		while(true) {
			PrintResult.printMenu();
			int input = scan.nextInt();
			switch (input) {
			case 1:
				PrintResult.printSelectAll(mysql.selectAll());
				break;
			case 2:
				mysql.update(mysql.findNames());
				break;
			case 3:
				mysql.insert(bootcamp);
				break;
			case 4:
				PrintResult.printSelectOverVisitNoAvg(mysql.selectOverVisitNoAvg());
				break;
			case 5:
				PrintResult.printSelectClosedAge(mysql.selectClosedAge());
				break;
			default:
				System.exit(0);
			}
		}
	}

}
