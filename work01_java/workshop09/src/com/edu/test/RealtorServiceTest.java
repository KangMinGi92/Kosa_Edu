package com.edu.test;

import com.edu.service.RealtorService;
import com.edu.vo.Apartment;
import com.edu.vo.Realtor;

public class RealtorServiceTest {

	public static void main(String[] args) {
		RealtorService service = RealtorService.getInstance();
		// 자이,힐스테이트,푸르지오,롯데캐슬,래미안,더샵

		// 1. 특정 중개업소를 추가하는 기능
		Apartment[] apt1 = { new Apartment(300000000, "논현동", "푸르지오", 40), new Apartment(200000000, "압구정동", "힐스테이트", 28),
				new Apartment(150000000, "삼성동", "푸르지오", 33), new Apartment(170000000, "청담동", "롯데캐슬", 40),
				new Apartment(200000000, "개포동", "자이", 24) };
		Apartment[] apt2 = { new Apartment(200000000, "서초동", "래미안", 24), new Apartment(250000000, "잠원동", "롯데캐슬", 28),
				new Apartment(350000000, "반포동", "롯데캐슬", 33), new Apartment(180000000, "방배동", "힐스테이트", 40),
				new Apartment(230000000, "양재동", "자이", 24) };
		Apartment[] apt3 = { new Apartment(100000000, "이태원동", "푸르지오", 40), new Apartment(200000000, "남영동", "더샵", 28),
				new Apartment(150000000, "후암동", "래미안", 24), new Apartment(170000000, "용산동", "푸르지오", 33),
				new Apartment(200000000, "이촌동", "자이", 24) };
		Apartment[] apt4 = { new Apartment(100000000, "추가한동", "래미안", 40) };

		service.addRealtor(new Realtor(1, "강남부동산", "논현동"), apt1);
		service.addRealtor(new Realtor(2, "서초부동산", "압구정동"), apt2);
		service.addRealtor(new Realtor(3, "강북부동산", "이태원동"), apt3);
		service.addRealtor(new Realtor(4, "추가부동산", "추가한동"), apt4);

		// 2. 모든 중개업소의 정보를 반환하는 기능
		Realtor[] temp = service.getAllRealtor();

		for (Realtor r : temp) {
			if (r != null) {
				System.out.println("======================================================");
				System.out.println("각각의 중개업소가 가지고 있는 중개업소 정보 및 아파트 정보입니다.");
				System.out.println(r.getName());
				if (r.getApartments() != null) {
					for (Apartment apt : r.getApartments()) {
						System.out.println(apt.toString());
					}
				}
			} else {
				break;
			}
		}

		// 3. 특정 중개업소에 있는 Apartment[]를 반환하는 기능
		System.out.println("======================================================");
		Apartment[] apt = service.getApartment("강북부동산");
		for (Apartment a : apt) {
			System.out.println("강북부동산이 가지고 있는 아파트 매물 정보입니다.");
			System.out.println(a.toString());
		}

		// 4. 특정 중개업소가 가지고 있는 Apartment 중 가장비싼 Apartment를 반환
		System.out.println("======================================================");
		System.out.println("강남부동산이 가지고 있는 가장 비싼 아파트 매물입니다.");
		System.out.println(service.maxPriceApartment("강남부동산").toString());

		// 5. 모든 중개업소가 보유한 Apartment 중 가장많은 브랜드명을 반환
		System.out.println("======================================================");
		System.out.println("가장 인기있는 아파트 브랜드는 " + service.popularBrand() + "입니다.");

	}
}