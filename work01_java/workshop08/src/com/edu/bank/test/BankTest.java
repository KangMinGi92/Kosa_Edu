package com.edu.bank.test;

import java.util.Scanner;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int customerNum = 0;
		Customer[] customers = null;
		while (run) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("1. 고객수 | 2. 고객 정보 입력 | 3. 계좌 개설 | 4. 정보 출력 |5. 종료");
			System.out.println("-----------------------------------------------------------");
			System.out.print("메뉴 선택 > ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				customerNum = inputCustomerNum();
				break;
			case 2:
				customers = inputCustomerInfo(customerNum);
				break;
			case 3:
				makeAccount(customers);
				break;
			case 4:
				printCustomerInfo(customers);
				break;
			case 5:
				run = false;
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}// main

	private static int inputCustomerNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("고객수 입력 >>>");
		int customerNum = sc.nextInt();
		return customerNum;
	}

	private static Customer[] inputCustomerInfo(int customerNum) {
		Scanner sc = new Scanner(System.in);
		Customer[] customers = new Customer[customerNum];
		int i = 0;
		for (Customer customer : customers) {
			System.out.print(i + 1 + "번 고객 정보 입력 >>>");
			customers[i] = new Customer(sc.next(), sc.next());
			i++;
		}
		return customers;
	}

	private static void makeAccount(Customer[] customers) {
		Scanner sc = new Scanner(System.in);
		int j = 0;
		for (Customer customer : customers) {
			System.out.print(customer.getName() + "님 계좌번호, 은행명, 잔액입력 >>>");
			customers[j].openAccount(new Account(sc.nextInt(), sc.next(), sc.nextDouble()));
			j++;
		}
	}

	private static void printCustomerInfo(Customer[] customers) {
		for (Customer customer : customers) {
			System.out.println(customer.getName() + " 고객 정보입니다.");
			System.out.println(customer.getCustomerInfo());
			System.out.println(customer.getAccount().getAccountInfo());
			System.out.println("==========================");
		}
	}
}// class