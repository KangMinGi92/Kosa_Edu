package com.edu.service;

import java.util.Random;
import java.util.TreeSet;

/*
 	중복된 번호를 받아들이지 않는 Set의 성질을 이용한 로직을 작성
 	번호의 range는 1~45사이의 숫자
 	숫자의 갯수는 모두 6개의 숫자가 반환
 	함수를...	 	TreeSet createLottoNumber()
 	
 	!!!
 	자바 프로젝트 서비스 기능에서 TreeSet을 반환하는 기능을 모든 팀에서 추가
 */
public class LottoMachineService {
	public TreeSet<Integer> createLottoNumber() {
		TreeSet<Integer> set = new TreeSet<>();
		/*
		 	1. r이라는 이름으로 Random()객체를 하나 생성 
		 	2. while문 안에서 1~45사이의 임의의 숫자를 반환받는 로직을 작성 
		 	3. 반환받은 값을 set에다 저장 
		 	4. 사이즈가 6이 될때까지 반복하면서
		 * 
		 */
		Random r = new Random();
		while (set.size() < 6) {
			set.add(r.nextInt(45)+1); // 1~45사이의 랜덤한 수가 할당 됨
		}
		return set;
	}
}
