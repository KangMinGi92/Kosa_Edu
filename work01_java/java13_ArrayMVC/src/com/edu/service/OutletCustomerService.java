package com.edu.service;

import java.util.Arrays;

import com.edu.vo.Customer;
import com.edu.vo.Product;

//Outlet에서 상품들을 구매하는 고객관련 기능들만 모아놓은 서비스 클래스
//데이터베이스와 연결되면 이후에 이 클래스는 DAO(Database Access Object)가 된다.
//VO, TEST클래스 중간에 위치함으로 해당 클래스는 Controller역할을 여기서 한다.

/*
 * 1.서비스의 기능들을 주석으로 먼저 달아둔다.
 * 2.모든기능의 선언부만 먼저 작성한다.
 * 		메소드이름, 인자값, 반환타입
 * 		인자값과 반환타입은 반드시 정확해야한다.
 * 3. 메소드를 하나만 먼저 구현
 * 4. 테스트에서 호출해서 잘 작성이 되었는지 확인..
 * 		다음 메소드 작성으로 넘어간다... 다시 테스트에서 호출 확인

 * Java Application 작업시 어떤 순서로 클래스를 구현해야 하는가? 1. 어떤것을 만들까? 2. 어떤 vo들이 필요할까? 3.
 * vo들의 관계는 어떤 관계인가? 4. Service클래스의 메소드 선언부만 먼저 정의 5. 메소드를 하나씩 구현 ---> Test에서
 * 하나씩 호출 ---> 하나씩 성공여부 확인
 */
public class OutletCustomerService {
	/*
	 * 메소드명 정의할때 좋은 구성방법 동사로 시작하고 복수(명사s 또는 All명사)를 표시하고 최대한 간결하게 작성한다.
	 */
	// 1. 특정 고객이 구매한 모든 상품을 반환하는 기능
//	public Product[] getProducts(Customer customer) {
	public Product[] getAllproduct(Customer customer) {
		return customer.getProducts();
	}

	// 2. 특정 고객이 구매한 모든 상품의 메이커만 반환하는 기능
//	public String[] getProductsMaker(Customer customer) {
	public String[] getAllProductMaker(Customer customer) {
		String[] temp = new String[customer.getProducts().length];
		int idx = 0;
		for (Product p : customer.getProducts()) {
			temp[idx++] = p.getMaker();
		}
		return temp;
	}

	/*
	 * Method Overloading Rule(규칙, 문법) 1.메소드 이름은 반드시 같아야 한다. 2.메소드 인자값은 반드시 달라야 한다.
	 * (순서, 갯수, 타입중 하나라도 달라야 한다.) 3.메소드 리턴타입은 상관없다.
	 * 
	 * 하는일이 같지만(메소드 이름은 같다) 처리하는 데이터를 달리하는 기법 결론적으로 코드의 가독성을 높이는데 중요한 역할을 하는 기법
	 */
	// 3. Outlet안에 있는 고객들 중에서 특정고객을 검색하는 기능
	// for문에서 특정한 대상을 발견!!(1. 발견o |2. 발견x)
	public Customer findCustomer(Customer[] customers, int ssn) {
		Customer customer = null;
		for (Customer c : customers) {
			if (c.getSsn() == ssn) {
				customer = c;
				break; // 조건을 만족하면 바로 Loop문을 빠져나오도록 하자
			}
		}
		return customer;

	}

	// 4. Outlet안에 있는 고객들 중에서 "혜화동"에 거주하는 고객을 검색하는 기능
	public Customer[] findCustomer(Customer[] customers, String address) {
		Customer[] temp = new Customer[customers.length];
		int idx = 0;
		for (Customer c : customers) {
			if (c.getAddress().equals(address))
				temp[idx++] = c;

		}
		// return temp;
		// 원하는 사이즈만큼 새로운 배열로 복사해서 배열을 생성
		return Arrays.copyOf(temp, idx);
	}

//	public String[] findCustomer(Customer[] customers,String name) {
//		return null;
//	} 변수타입이 같을경우에는 메소드명에 끝부분에 By를 붙여서 메소드명을 정의해준다.
	// ex) findCustomerByName,findCustomerByAddress 두경우 인자값이 String으로 중복되서 메소드명을
	// 수정해준 Case다

	// 5.특정 고객이 구입한 물건중에서 최고가에 해당하는 물건의 가격을 반환
	public int getMaxPrice(Customer customers) {
		int maxPrice = 0;
		for (Product p : customers.getProducts()) {
			if (maxPrice < p.getPrice())
				maxPrice = p.getPrice();
		}
		return maxPrice;
	}

	// 6. 모든 고객이 구입한 물건 중에서 특정 가격 이상되는 상품을 반환
	public Product[] getProductOverPrice(Customer[] customers, int price) {

		int count = 0;
		for (Customer c : customers) {
			for (Product p : c.getProducts()) {
				if (p.getPrice() >= price)
					count++;
			}
		}
		Product[] products = new Product[count];
		int idx = 0;
		for (Customer c : customers) {
			for (Product p : c.getProducts()) {
				if (p.getPrice() >= price) {
					products[idx++] = p;
					
				}
			}
		}
		return products;
	}


}
