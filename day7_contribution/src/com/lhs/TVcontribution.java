package com.lhs;

/*
 * ARS 모금
 * ARS는 3개 전화: 한번 전화 걸때마다 자동으로 1000씩 모금
 */
public class TVcontribution {

	static Account account; // 모금통을 의미, 때문에 static을 사용
	
	public static void main(String[] args) {
		account = new Account();
		
		Customer customer1 = new Customer(account, "02-777-1001");
		Customer customer2 = new Customer(account, "02-777-1002");
		Customer customer3 = new Customer(account, "02-777-1003");
		try {
			// start를 먼저 실행해야 join이 제대로 실행된다.
			customer1.start();
			customer2.start();
			customer3.start();
			
			customer1.join();
			customer2.join();
			customer3.join();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("총 모금액 : " + account.getTotal());
	}

}
