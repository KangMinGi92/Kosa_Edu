package com.edu.array.test;

import com.edu.array.Account;

public class AccountArrayTest2 {

	public static void main(String[] args) {
		// 1. Account[ ]의 배열을 생성...사이즈는 3...accounts
		Account[] accounts = new Account[3];
		// 2. 각각의 배열요서에 Account 객체를 생성
		accounts[0] = new Account(111,"Toss",4000.0);
		//accounts[1] = new Account(222,"KB",4500.0);
		accounts[2] = new Account(333,"Busan",5000.0);
		// 3. 메모리상에 올라간 Account[] 배열 위치값을 출력
			System.out.println(accounts);
		// 4. 모든 Account 객체 정보를 출력
		for(Account account : accounts) {
			if(account==null) continue;
			System.out.println(account.getAccountInfo()+" ");
			
		}
	}

}
