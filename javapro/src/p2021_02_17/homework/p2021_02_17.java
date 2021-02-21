package p2021_02_17.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class p2021_02_17 {
//	과제.  1~45 사이의 정수중에서 6개의 숫자를 추출하는 
//    로또 프로그램을 작성하세요?
//
//  1) Set자료구조를 사용해서 중복 숫자가 나오지 않도록 작성하세요.
//  2) 추출된 6개의 숫자를 오름차순으로 정렬해서 출력하세요.
	public static void main(String[] args) {
//		//1.hashset을 선언
//		Set set = new HashSet();
//		
//		//2.반복문을 활용해서 랜덤 숫자를 hashset에 저장
//		for (int i = 0; set.size()<6; i++) {
//			int num = (int)(Math.random()* 45)+1;
//			set.add(num);
//		}
//		//3.저장된 객체들을 linkedlist에 담기
//		List list = new LinkedList(set);
//		//4.오름차순으로 정렬
//		Collections.sort(list);
//		System.out.println("번호6개:"+list);

		Set set = new TreeSet();
		
		for (int i = 0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		System.out.println(set);
//		System.out.println(set);
	}
}
