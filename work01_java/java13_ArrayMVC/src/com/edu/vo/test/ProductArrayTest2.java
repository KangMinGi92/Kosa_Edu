package com.edu.vo.test;
/*
	Test클래스는
	1)Scanner로 값 입력받는다.
	2)메소드 호출(서비스 요청)
	3)메소드 동작 후 반환되는 값은 콘솔로 출력
	1),2),3)작업만 있어야 하는데
	해당코드에서는 로직이 작동하고 있다.
	총가격, 특정젶무 출력... 고가제품 출력
	기능만을 따로 모아놓은 서비스 클래스를 추가적으로 작성
				SE
	vo ------- service ------test
	
				EE
	Model	  Controller	 View
*/

import com.edu.vo.Customer;
import com.edu.vo.Product;

public class ProductArrayTest2 {

	public static void main(String[] args) {
		/*
		Customer 2명 생성...
		Customer 타입의 배열을 생성... 값으로 위 2명(정우성,이정재)...customers
		
		customer[0]이 pro1을 구매
		customer[1]이 pro2을 구매
		
		이정재씨가 구매한 물건의 총 가격 출력
		정우성씨가 구매한 물건의 제품명만 출력
	*/
		Product[] pro1 = { 
							new Product("신라면", 1000, 5, "농심"),
							new Product("삼다수생수", 500, 8, "광동"),
							new Product("초코파이", 3000, 5, "오리온"),
							new Product("피존", 5000, 2, "엘지"),
							new Product("Ipad", 1100000, 1, "애플")
						};
		Product[] pro2 = { 
							new Product("테라", 5000, 2, "하이트"),
							new Product("진라면", 2000, 4, "오뚜기"), 
							new Product("맥심커피", 500, 6, "엘지") 
							};
		
		Customer[] customers= {
								new Customer(111,"정우성","방배동"),
								new Customer(222,"이정재","신사동")
								};
		//Has a Relation...
		customers[0].buyProducts(pro1);
		customers[1].buyProducts(pro2);
		int total=0;
		for(Product p : customers[1].getProducts()) 
			total+=p.getPrice()*p.getQuantity();
		
		System.out.println("1. 이정재가 구매한 물건의 총 가격운"+total+"원입니다.");
		
		System.out.println("2. 정우성씨가 구입한 물건들 입니다.");
		for(Product p : customers[0].getProducts()) 
			System.out.print(p.getMaker()+" ");
	
		//정우성씨가 구입한 물건중 1만원 이상의 제품의 제품명과 가격을 출력
		System.out.println("---------------------------------------");
		for(Product p : customers[0].getProducts()) {
			if(p.getPrice()>=10000)System.out.println(p.getMaker()+" "+p.getPrice());
		}
	}
/*
 	MVC 패턴
 	vo(ValueObject) : 정보를 저장하는 클래스
 	Service : 기능만을 모아놓은 클래스 *기능 1개 1개가 각각의 Service이다.*
 	test 메소드 : 하나의 서비스 요청은 Service클래스의 하나의 메소드와 매핑!!!
 	DAO(DataBase Access Object) : DB와 Service가 연동하는 클래스
 */
}
