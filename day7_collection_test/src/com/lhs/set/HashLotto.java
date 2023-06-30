package com.lhs.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class HashLotto {

	public HashLotto() {
	}
	
	public static void hashSetLotto() {
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		/*
		 * 임의의 수 6개 추출 후 저장
		 * 로또번호 : 총 45개
		 * Math.random() : 0 ~ 1 사이의 실수, (int)Math.random() * 45 + 1
		 * Ramdom.class : nextInt(범위)
		 */
		Random random = new Random();
		for (int i = 0; lotto.size() < 6; i++)
			lotto.add(new Integer(random.nextInt(45) + 1));
		System.out.println(lotto);
		
		List<Integer> lottoList = new LinkedList<Integer>();
		for (int i = 0; i < 6; i++)
			lottoList.add((int)(Math.random() * 45) + 1);
		System.out.println(lottoList);
		Collections.sort(lottoList); // 정렬
		System.out.println(lottoList);
	}

}
