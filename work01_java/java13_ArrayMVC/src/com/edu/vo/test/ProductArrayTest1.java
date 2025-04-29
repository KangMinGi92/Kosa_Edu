package com.edu.vo.test;

import com.edu.vo.Product;

public class ProductArrayTest1 {

	public static void main(String[] args) {
		// 1.
		// 배열 선언,생성,초기화를 한번에...
		// Product타입의 배열을 2개 생성 pro1, pro2
		// pro1(신라면, 삼다수생수, 초코파이, 피존)
		// pro2(테라, 진라면, 맥심커피)

		// 2. 배열안에 들어있는 모든 제품정보를 출력
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
		for (Product product : pro1)
			System.out.println(product.getProductInfo());
		for (Product product : pro2)
			System.out.println(product.getProductInfo());

	}

}
