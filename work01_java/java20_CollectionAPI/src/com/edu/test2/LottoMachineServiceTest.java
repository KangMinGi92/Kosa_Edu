package com.edu.test2;

import java.util.TreeSet;

import com.edu.service.LottoMachineService;

public class LottoMachineServiceTest {

	public static void main(String[] args) {
		LottoMachineService service = new LottoMachineService();
		TreeSet<Integer> set =service.createLottoNumber();
		System.out.println("당신의 추첨한 Lotto Number ==>"+set);
	}

}
