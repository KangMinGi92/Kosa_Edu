package com.edu.bank.test;

import java.util.Scanner;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//james 계좌 관련 부분
		Customer james=new Customer("James","NY");
		Customer tomas=new Customer("Tomas","서울");
		System.out.println("값을 직접 입력합니다.");
		james.openAccount(new Account(sc.nextInt(),sc.next(),sc.nextDouble()));
//		tomas.openAccount(new Account(sc.nextInt(),sc.next(),sc.nextDouble()));
		
		Account jamesAccount=james.getAccount();
		jamesAccount.deposit(10000.0);
		jamesAccount.deposit(30000.0);
		jamesAccount.withdraw(20000.0);
		System.out.println("James Balance ==>"+james.getAccount().getBalance()+" 만원!!");
		System.out.println(james.getCustomerInfo());
		
//		james.setCoustomerInfo("james","NewYork");
//		System.out.println("=====계좌계설에 필요한 정보를 입력해주세요=====");
//		System.out.print("은행이름 : ");
//		String bankName1=sc.next();
//		System.out.print("계좌번호 : ");
//		int accNumber1=sc.nextInt();
//		System.out.print("초기입금액 : ");
//		double balance1=sc.nextDouble();
//		Account jamesAccount=new Account(accNumber1,bankName1,balance1);
//		james.openAccount(jamesAccount); 
//		jamesAccount.deposit(10000.0);
//		jamesAccount.deposit(30000.0);
//		jamesAccount.withdraw(20000.0);
//		System.out.println(james.getAccount().getBalance());//잔액확인
//		System.out.println(james.getCustomerInfo()+jamesAccount.getAccountInfo());
		
		//tomas 계좌 관련 부분
//		Customer tomas=new Customer();
//		tomas.setCoustomerInfo("tomas","LA");
//		System.out.println("=====계좌계설에 필요한 정보를 입력해주세요=====");
//		System.out.print("은행이름 : ");
//		String bankName2=sc.next();
//		System.out.print("계좌번호 : ");
//		int accNumber2=sc.nextInt();
//		System.out.print("초기입금액 : ");
//		double balance2=sc.nextDouble();
//		tomas.setCoustomerInfo("tomas","LA");
//		Account tomasAccount=new Account(accNumber2,bankName2,balance2);
//		tomas.openAccount(tomasAccount); 
//		tomasAccount.deposit(50000.0);
//		tomasAccount.deposit(20000.0);
//		tomasAccount.withdraw(60000.0);
//		System.out.println(tomas.getAccount().getBalance());//잔액확인
//		System.out.println(tomas.getCustomerInfo()+tomasAccount.getAccountInfo());
	}

}
