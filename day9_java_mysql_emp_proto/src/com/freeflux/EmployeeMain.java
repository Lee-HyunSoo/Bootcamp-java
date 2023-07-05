package com.freeflux;

import java.util.ArrayList;
import java.util.Scanner;

import com.freeflux.db.MySQLconnector;
import com.freeflux.dto.Employee;

/*
 * switch-case
 * int n = scan.nextInt();
 * switch(n) {
 * 	case value:
 * 		break;
 * 	default:
 * 		break;
 * }
 */
public class EmployeeMain {

	public static void main(String[] args) {
		MySQLconnector mysql = new MySQLconnector();
		mysql.connectMySQL();
		
		ArrayList<Employee> employees = null;
		
		PrintResult.printMenu();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int n = scan.nextInt();
			switch (n) {
			case 1:
				employees = mysql.selectAll();
				PrintResult.printSelectAll(employees);
				PrintResult.printMenu();
				break;
			case 2:
				mysql.insert();
				PrintResult.printMenu();
				break;
			case 3:
				employees = mysql.selectAll();
				mysql.update(employees);
				PrintResult.printMenu();
				break;
			case 4:
				mysql.delete();
				PrintResult.printMenu();
				break;
			default:
				System.exit(0);
			}
		}
		
//		while(flag) {	
//			int n = scan.nextInt();
//			
//			if (n == 1) {
//				employees = mysql.selectAll();
//				PrintResult.printSelectAll(employees);
//				PrintResult.printMenu();
//			}
//			else if (n == 2) {
//				mysql.insert();
//				PrintResult.printMenu();
//			}
//			else if (n == 3) {
//				employees = mysql.selectAll();
//				mysql.update(employees);
//				PrintResult.printMenu();
//			}
//			else if (n == 4) {
//				mysql.delete();
//				PrintResult.printMenu();
//			}
//			else if (n == 5) {
//				flag = false;
//				System.out.println("작업 종료");
//			}
//		}
	} // main() END

}
