package com.edu.test;

import com.edu.service.OutletCustomerService;
import com.edu.vo.Customer;
import com.edu.vo.Product;

public class OuletServiceTest {

	public static void main(String[] args) {
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
		Product[] pro3 = {
						new Product("LG gram",900000,1,"엘지")
						};
		
		Customer c1= new Customer(111,"정우성","방배동");
		Customer c2= new Customer(222,"이정재","신사동");
		Customer c3= new Customer(333,"이제니","방배동");
		
		Customer[] customers = {c1,c2,c3};
		
		//Product와 Customer의 Association 
		customers[0].buyProducts(pro1);
		customers[1].buyProducts(pro2);
		customers[2].buyProducts(pro3);
		
		//
		OutletCustomerService service = new OutletCustomerService();
		System.out.println("=========1. customers[1]고객이 구매한 제품들 입니다.==========");
		Product[] rProd1=service.getAllproduct(customers[1]);
		for(Product p : rProd1)	System.out.println(p.getProductInfo());
		
		System.out.println("=========2. customers[0]고객이 구매한 제품들 입니다.==========");
		String[] makers=service.getAllProductMaker(customers[0]);
		for(String maker : makers) System.out.println(maker+" ");
		
		System.out.println("=========3. 모든 고객중에서 222에 해당하는 고객을 찾습니다.======");
		Customer findC=service.findCustomer(customers, 555);
		if(findC!=null)
			System.out.println(findC.getSsn()+","+findC.getName());
		else
			System.out.println("고객을 찾을 수 없습니다.");
		
		System.out.println("=========4. 모든 고객중에서 방배동에 거주하는 고객정보입니다.======");
		Customer[] findCs=service.findCustomer(customers,"방배동");
		for(Customer c : findCs)
			System.out.println(c.getName()+","+c.getAddress());
		
		System.out.println("=========5. customers[0]고객님이 구입한 물건중 최고가 제품입니다.======");
		int max=service.getMaxPrice(customers[0]);
		System.out.println("최고가 금액은 " + max + "원입니다.");
		
		System.out.println("=========6. 특정 가격 이상되는 제품들 입니다.======");
		Product[] pros=service.getProductOverPrice(customers, 20000);
		for(Product p : pros)System.out.println(p.getMaker()+" "+p.getPrice());
	}
	

}
