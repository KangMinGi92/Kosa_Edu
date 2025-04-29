package com.edu.service;

import com.edu.vo.Apartment;
import com.edu.vo.Realtor;

public class RealtorService {
	Realtor[] realtors = null;
	int ridx = 0;
	Apartment[] apartments = null;
	int aidx = 0;
	private static RealtorService service = new RealtorService(10);

	private RealtorService(int size) {
		realtors = new Realtor[size];
		apartments = new Apartment[size];
	}

	public static RealtorService getInstance() {
		return service;
	}

	// 1. 특정 중개업소를 추가하는 기능
	// 2. 모든 중개업소의 정보를 반환하는 기능
	// 3. 특정 중개업소에 있는 Apartment[]를 반환하는 기능
	// 4. 특정 중개업소가 가지고 있는 Apartment 중 가장비싼 Apartment를 반환
	// 5. 모든 중개업소가 보유한 Apartment 중 가장많은 브랜드명을 반환

	// 1. 특정 중개업소를 추가하는 기능
	public void addRealtor(Realtor realtor, Apartment[] apartments) {
		for (int i = 0; i < realtors.length; i++) {
			if (realtors[i] == null) {
				ridx = i;
				break;
			}
		}

		if (ridx == realtors.length) {
			System.out.println("더이상 추가 하실 수 없습니다.");
		} else {
			realtors[ridx] = realtor;
		}

		for (Realtor r : realtors) {
			if (r == null) {
				break;
			} else if (r.getBrn() == realtor.getBrn())
				r.setApartments(apartments);
		}
	}

	// 2. 모든 중개업소의 정보를 반환하는 기능
	public Realtor[] getAllRealtor() {
		return realtors;
	}

	// 3. 특정 중개업소에 있는 Apartment[]를 반환하는 기능
	public Apartment[] getApartment(String name) {
		for (Realtor r : realtors) {
			if (r.getName().equals(name))
				return r.getApartments();
		}
		return null;
	}

	// 4. 특정 중개업소가 가지고 있는 Apartment 중 가장비싼 Apartment를 반환
	public Apartment maxPriceApartment(String name) {
		int maxPrice = 0;
		for (Realtor r : realtors) {
			for (Apartment a : r.getApartments()) {
				if (maxPrice < a.getPrice()) {
					maxPrice = a.getPrice();
					return a;
				}
			}
		}
		return null;
	}

	// 5. 모든 중개업소가 보유한 Apartment 중 가장많은 브랜드명을 반환
	// 자이,힐스테이트,푸르지오,롯데캐슬,래미안,더샵
	public String popularBrand() {
		String popularBrand = "";
		int maxCount = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;

		for (Realtor r : realtors) {
			if (r != null) {
				for (Apartment a : r.getApartments()) {
					String brand = a.getBrand();
					switch (brand) {
					case "자이":
						count1 += 1;
						break;
					case "힐스테이트":
						count2 += 1;
						break;
					case "푸르지오":
						count3 += 1;
						break;
					case "롯데캐슬":
						count4 += 1;
						break;
					case "래미안":
						count5 += 1;
						break;
					case "더샵":
						count6 += 1;
						break;
					}
				}
			}
		}
		int[] counting = { count1, count2, count3, count4, count5, count6 };

		for (int i : counting)
			if (maxCount < i)
				maxCount = i;

		if (maxCount == count1) {
			popularBrand = "자이";
		} else if (maxCount == count2) {
			popularBrand = "힐스테이트";
		} else if (maxCount == count3) {
			popularBrand = "푸르지오";
		} else if (maxCount == count4) {
			popularBrand = "롯데캐슬";
		} else if (maxCount == count5) {
			popularBrand = "래미안";
		} else {
			popularBrand = "더샵";
		}
		return popularBrand;
	}

}